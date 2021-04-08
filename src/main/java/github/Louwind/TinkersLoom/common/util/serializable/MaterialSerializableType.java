package github.Louwind.TinkersLoom.common.util.serializable;

import github.Louwind.TinkersLoom.common.material.Material;
import net.minecraft.util.JsonSerializableType;
import net.minecraft.util.JsonSerializer;

public class MaterialSerializableType extends JsonSerializableType<Material> {

    public MaterialSerializableType(JsonSerializer<? extends Material> jsonSerializer) {
        super(jsonSerializer);
    }

}

