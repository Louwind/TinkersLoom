package github.Louwind.TinkersLoom.core.init;

import github.Louwind.TinkersLoom.common.material.Material;
import github.Louwind.TinkersLoom.common.util.serializable.MaterialSerializableType;
import github.Louwind.TinkersLoom.core.util.material.serializer.NonMetallicMaterialSerializer;
import github.Louwind.TinkersLoom.core.util.material.serializer.SmeltableMaterialSerializer;
import net.minecraft.util.JsonSerializer;
import net.minecraft.util.registry.Registry;

import java.util.function.Supplier;

import static github.Louwind.TinkersLoom.common.registry.TinkersRegistry.*;

public class MaterialTypes {

    public static final MaterialSerializableType NON_METALLIC;

    public static final MaterialSerializableType SMELTABLE;

    protected static MaterialSerializableType createMaterial(String id, Supplier<JsonSerializer<? extends Material>> jsonSerializer) {
        return Registry.register(MATERIAL, id, new MaterialSerializableType(jsonSerializer.get()));
    }

    static {
        NON_METALLIC = createMaterial("tinkersloom:non_metallic", NonMetallicMaterialSerializer::new);
        SMELTABLE = createMaterial("tinkersloom:smeltable", SmeltableMaterialSerializer::new);
    }

}
