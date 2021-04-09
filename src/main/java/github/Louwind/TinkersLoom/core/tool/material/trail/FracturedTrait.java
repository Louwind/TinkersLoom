package github.Louwind.TinkersLoom.core.tool.material.trail;

import com.google.common.collect.Multimap;
import github.Louwind.TinkersLoom.common.material.trait.Trait;
import github.Louwind.TinkersLoom.common.material.trait.context.TraitContext;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;

import static net.minecraft.entity.attribute.EntityAttributeModifier.Operation.MULTIPLY_BASE;
import static net.minecraft.entity.attribute.EntityAttributes.GENERIC_ATTACK_DAMAGE;

public class FracturedTrait implements Trait {

    @Override
    public void appendAttributeModifiers(Multimap<EntityAttribute, EntityAttributeModifier> builder, TraitContext context, int level) {
        builder.put(GENERIC_ATTACK_DAMAGE, new EntityAttributeModifier("Fractured", 0.2F * level, MULTIPLY_BASE));
    }

}
