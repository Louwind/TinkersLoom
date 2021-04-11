package github.Louwind.TinkersLoom.core.tool.material.trail;

import com.google.common.collect.ImmutableSetMultimap;
import github.Louwind.TinkersLoom.common.material.trait.Trait;
import github.Louwind.TinkersLoom.common.material.trait.context.TraitContext;
import github.Louwind.TinkersLoom.common.util.serializable.TraitSerializableType;
import lombok.Getter;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;

import static github.Louwind.TinkersLoom.core.init.Traits.LEVELING_ATTRIBUTE;

@Getter
public class LevelingAttributeTrait implements Trait {

    protected final EntityAttributeModifier.Operation operation;
    protected final EntityAttribute attribute;
    protected final float multiplier;
    protected final String name;

    public LevelingAttributeTrait(String name, EntityAttribute attribute, float multiplier, EntityAttributeModifier.Operation operation) {
        this.attribute = attribute;
        this.multiplier = multiplier;
        this.operation = operation;
        this.name = name;
    }

    @Override
    public void appendAttributeModifiers(ImmutableSetMultimap.Builder<EntityAttribute, EntityAttributeModifier> builder, TraitContext context) {
        builder.put(this.attribute, new EntityAttributeModifier(this.name, this.multiplier * context.getLevel(), this.operation));
    }

    @Override
    public TraitSerializableType getType() {
        return LEVELING_ATTRIBUTE;
    }

}
