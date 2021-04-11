package github.Louwind.TinkersLoom.core.tool.material.trail;

import com.google.common.collect.ImmutableSetMultimap;
import github.Louwind.TinkersLoom.common.material.trait.Trait;
import github.Louwind.TinkersLoom.common.material.trait.context.TraitContext;
import github.Louwind.TinkersLoom.common.util.serializable.TraitSerializableType;
import lombok.Getter;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.nbt.CompoundTag;

import java.util.UUID;

import static github.Louwind.TinkersLoom.core.init.Traits.INCREASING_ATTRIBUTE_ON_ATTACK;

@Getter
public class IncreasingAttributeTrait implements Trait {

    protected final EntityAttributeModifier.Operation operation;
    protected final EntityAttribute attribute;
    protected final float amount;
    protected final int stacks;
    protected final String name;

    public IncreasingAttributeTrait(String name, EntityAttribute attribute, int stacks, float amount, EntityAttributeModifier.Operation operation) {
        this.attribute = attribute;
        this.operation = operation;
        this.amount = amount;
        this.stacks = stacks;
        this.name = name;
    }

    @Override
    public void appendAttributeModifiers(ImmutableSetMultimap.Builder<EntityAttribute, EntityAttributeModifier> builder, TraitContext context) {
        LivingEntity living =  context.getUser();

        if(living != null) {
            LivingEntity target = living.getAttacking();

            if(target != null) {
                CompoundTag tag = context.getTraitData();

                if(tag != null) {
                    UUID entityUuid = tag.getUuid("Entity");
                    UUID targetUuid = target.getUuid();

                    if(targetUuid.equals(entityUuid)) {
                        int stacks = tag.getInt("Stacks");

                        builder.put(this.attribute, new EntityAttributeModifier(this.name, this.amount * stacks * context.getLevel(), this.operation));

                        if(stacks >= this.stacks) {
                            tag.putUuid("Entity", null);
                            tag.putInt("Stacks", 0);
                        }

                    }

                }

            }

        }

    }

    @Override
    public TraitSerializableType getType() {
        return INCREASING_ATTRIBUTE_ON_ATTACK;
    }

}
