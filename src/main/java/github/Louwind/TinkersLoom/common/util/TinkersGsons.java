package github.Louwind.TinkersLoom.common.util;

import com.google.gson.GsonBuilder;
import github.Louwind.TinkersLoom.common.material.Material;
import github.Louwind.TinkersLoom.common.material.trait.Trait;
import net.minecraft.util.JsonSerializing;

import static github.Louwind.TinkersLoom.common.registry.TinkersRegistry.*;

public class TinkersGsons {

    public static GsonBuilder getMaterialGsonBuilder() {
        return new GsonBuilder()
                .registerTypeHierarchyAdapter(Material.class, TinkersGsons.createMaterialSerializer())
                .registerTypeHierarchyAdapter(Trait.class, TinkersGsons.createTraitSerializer());
    }

    public static GsonBuilder getTraitGsonBuilder() {
        return new GsonBuilder()
                .registerTypeHierarchyAdapter(Trait.class, TinkersGsons.createTraitSerializer());
    }

    private static Object createMaterialSerializer() {
        return JsonSerializing.createTypeHandler(MATERIAL_TYPE, "type", "type", Material::getType).createGsonSerializer();
    }

    private static Object createTraitSerializer() {
        return JsonSerializing.createTypeHandler(TRAIT_TYPE, "trait", "trait", Trait::getType).createGsonSerializer();
    }

}
