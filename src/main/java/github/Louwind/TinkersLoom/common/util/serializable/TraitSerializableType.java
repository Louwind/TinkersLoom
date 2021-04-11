package github.Louwind.TinkersLoom.common.util.serializable;

import github.Louwind.TinkersLoom.common.material.trait.Trait;
import net.minecraft.util.JsonSerializableType;
import net.minecraft.util.JsonSerializer;

public class TraitSerializableType extends JsonSerializableType<Trait> {

    public TraitSerializableType(JsonSerializer<? extends Trait> jsonSerializer) {
        super(jsonSerializer);
    }

}
