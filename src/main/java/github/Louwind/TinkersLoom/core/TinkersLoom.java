package github.Louwind.TinkersLoom.core;

import github.Louwind.TinkersLoom.client.resource.MaterialReloadListener;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.minecraft.util.registry.Registry;

import static github.Louwind.TinkersLoom.common.registry.TinkersRegistry.TINKER_TOOL;
import static github.Louwind.TinkersLoom.common.registry.TinkersRegistry.TRAIT;
import static github.Louwind.TinkersLoom.core.init.Tools.*;
import static github.Louwind.TinkersLoom.core.init.Traits.FRACTURED;
import static github.Louwind.TinkersLoom.core.init.Traits.SPLINTERING;
import static net.minecraft.resource.ResourceType.SERVER_DATA;

public class TinkersLoom implements ModInitializer {

	public static final MaterialReloadListener MATERIAL_RELOAD_LISTENER = new MaterialReloadListener();

	@Override
	public void onInitialize() {
		ResourceManagerHelper.get(SERVER_DATA).registerReloadListener(MATERIAL_RELOAD_LISTENER);

		Registry.register(TINKER_TOOL, "tinkersloom:axe", AXE);
		Registry.register(TINKER_TOOL, "tinkersloom:battleaxe", BATTLEAXE);
		Registry.register(TINKER_TOOL, "tinkersloom:battlesign", BATTLESIGN);
		Registry.register(TINKER_TOOL, "tinkersloom:broadsword", BROADSWORD);
		Registry.register(TINKER_TOOL, "tinkersloom:cleaver", CLEAVER);
		Registry.register(TINKER_TOOL, "tinkersloom:dagger", DAGGER);
		Registry.register(TINKER_TOOL, "tinkersloom:excavator", EXCAVATOR);
		Registry.register(TINKER_TOOL, "tinkersloom:flying_pan", FLYING_PAN);
		Registry.register(TINKER_TOOL, "tinkersloom:hammer", HAMMER);
		Registry.register(TINKER_TOOL, "tinkersloom:hatchet", HATCHET);
		Registry.register(TINKER_TOOL, "tinkersloom:longsword", LONGSWORD);
		Registry.register(TINKER_TOOL, "tinkersloom:lumber", LUMBER);
		Registry.register(TINKER_TOOL, "tinkersloom:mattock", MATTOCK);
		Registry.register(TINKER_TOOL, "tinkersloom:pickaxe", PICKAXE);
		Registry.register(TINKER_TOOL, "tinkersloom:rapier", RAPIER);
		Registry.register(TINKER_TOOL, "tinkersloom:scythe", SCYTHE);
		Registry.register(TINKER_TOOL, "tinkersloom:shovel", SHOVEL);

		Registry.register(TRAIT, "tinkersloom:fractured", FRACTURED);
		Registry.register(TRAIT, "tinkersloom:splintering", SPLINTERING);
	}

}
