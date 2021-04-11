package github.Louwind.TinkersLoom.client.resource;

import com.google.gson.Gson;
import github.Louwind.Reload.client.resource.SimpleJsonReloadListener;
import github.Louwind.TinkersLoom.common.material.Material;
import github.Louwind.TinkersLoom.common.material.trait.Trait;
import github.Louwind.TinkersLoom.common.util.TinkersGsons;
import net.minecraft.util.Identifier;

import static github.Louwind.TinkersLoom.common.registry.TinkersRegistry.TRAIT;

public class TraitReloadListener extends SimpleJsonReloadListener<Trait> {

    private static final Gson GSON = TinkersGsons.getTraitGsonBuilder().create();

    public TraitReloadListener() {
        super(GSON, Material.class, TRAIT, "materials/traits");
    }

    @Override
    public Identifier getFabricId() {
        return new Identifier("tinkersloom:trait");
    }

}
