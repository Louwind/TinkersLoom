package github.Louwind.TinkersLoom.core.init;

import github.Louwind.TinkersLoom.common.material.trait.Trait;
import github.Louwind.TinkersLoom.common.util.serializable.TraitSerializableType;
import github.Louwind.TinkersLoom.core.util.trait.serializer.EntityAttributeTraitSerializer;
import github.Louwind.TinkersLoom.core.util.trait.serializer.IncreasingAttributeTraitSerializer;
import net.minecraft.util.JsonSerializer;
import net.minecraft.util.registry.Registry;

import java.util.function.Supplier;

import static github.Louwind.TinkersLoom.common.registry.TinkersRegistry.TRAIT_TYPE;

public class Traits {

    public static final TraitSerializableType INCREASING_ATTRIBUTE_ON_ATTACK;

    public static final TraitSerializableType LEVELING_ATTRIBUTE;

    protected static TraitSerializableType createTrait(String id, Supplier<JsonSerializer<? extends Trait>> supplier) {
        return Registry.register(TRAIT_TYPE, id,  new TraitSerializableType(supplier.get()));
    }

    static {
        INCREASING_ATTRIBUTE_ON_ATTACK = createTrait("tinkersloom:increasing_attribute_on_attack", IncreasingAttributeTraitSerializer::new);
        LEVELING_ATTRIBUTE = createTrait("tinkersloom:leveling_attribute", EntityAttributeTraitSerializer::new);
    }

}
