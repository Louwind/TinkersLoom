package github.Louwind.TinkersLoom.client.resource;

import com.google.gson.Gson;
import github.Louwind.Reload.client.resource.SimpleJsonReloadListener;
import github.Louwind.TinkersLoom.common.material.Material;
import github.Louwind.TinkersLoom.common.util.TinkersGsons;
import net.minecraft.util.Identifier;

import static github.Louwind.TinkersLoom.common.registry.TinkersRegistry.MATERIAL;

public class MaterialReloadListener extends SimpleJsonReloadListener<Material> {

    private static final Gson GSON = TinkersGsons.getMaterialGsonBuilder().create();

    public MaterialReloadListener() {
        super(GSON, Material.class, MATERIAL, "material");
    }

    @Override
    public Identifier getFabricId() {
        return new Identifier("tinkersloom:material");
    }

}
