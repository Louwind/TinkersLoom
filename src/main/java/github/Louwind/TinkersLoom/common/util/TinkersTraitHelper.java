package github.Louwind.TinkersLoom.common.util;

import com.google.common.collect.ImmutableSetMultimap;
import com.google.common.collect.Multimap;
import github.Louwind.TinkersLoom.common.material.trait.context.TraitContext;
import github.Louwind.TinkersLoom.common.tool.TinkersTool;
import github.Louwind.TinkersLoom.common.util.tool.ToolPartStack;
import github.Louwind.TinkersLoom.common.util.tool.ToolStack;
import github.Louwind.TinkersLoom.common.util.tool.TraitStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.item.ItemStack;
import org.jetbrains.annotations.Nullable;

import java.util.Set;
import java.util.stream.Collectors;

public class TinkersTraitHelper {

    public static Set<TraitStack> getTraits(ToolStack toolStack) {
        return toolStack.getParts().stream()
                .map(ToolPartStack::getTraits)
                .flatMap(Set::stream)
                .collect(Collectors.toSet());
    }

    public static Multimap<EntityAttribute, EntityAttributeModifier> getAttributeTraits(ItemStack stack, TinkersTool tool, ToolStack toolStack, @Nullable LivingEntity user) {
        ImmutableSetMultimap.Builder<EntityAttribute, EntityAttributeModifier> builder = ImmutableSetMultimap.builder();

        for (TraitStack traitStack : TinkersTraitHelper.getTraits(toolStack)) {
            TraitContext context = TraitContext.create(stack, tool, toolStack, traitStack, user);

            traitStack.getTrait().appendAttributeModifiers(builder, context);
        }

        return builder.build();
    }

}
