package github.Louwind.TinkersLoom.common.util;

import com.google.gson.GsonBuilder;
import github.Louwind.TinkersLoom.common.material.Material;
import net.minecraft.util.JsonSerializing;

import static github.Louwind.TinkersLoom.common.registry.TinkersRegistry.MATERIAL;

public class TinkersGsons {

    public static GsonBuilder getMaterialGsonBuilder() {
        return new GsonBuilder()
                .registerTypeHierarchyAdapter(Material.class, TinkersGsons.createMaterialSerializer());
    }

    private static Object createMaterialSerializer() {
        return JsonSerializing.createTypeHandler(MATERIAL, "material", "material", Material::getType).createGsonSerializer();
    }

}
