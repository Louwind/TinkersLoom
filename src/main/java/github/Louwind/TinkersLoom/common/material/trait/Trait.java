package github.Louwind.TinkersLoom.common.material.trait;

import com.google.common.collect.ImmutableSetMultimap;
import github.Louwind.TinkersLoom.common.material.trait.context.TraitContext;
import github.Louwind.TinkersLoom.common.util.serializable.TraitSerializableType;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;

public interface Trait {

    void appendAttributeModifiers(ImmutableSetMultimap.Builder<EntityAttribute, EntityAttributeModifier> builder, TraitContext context);

    TraitSerializableType getType();

}
