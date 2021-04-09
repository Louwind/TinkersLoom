package github.Louwind.TinkersLoom.common.material.trait;

import com.google.common.collect.Multimap;
import github.Louwind.TinkersLoom.common.material.trait.context.TraitContext;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;

@FunctionalInterface
public interface Trait {

    void appendAttributeModifiers(Multimap<EntityAttribute, EntityAttributeModifier> builder, TraitContext context, int level);

}
