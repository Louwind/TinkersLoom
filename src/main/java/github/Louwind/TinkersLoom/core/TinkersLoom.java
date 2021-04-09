package github.Louwind.TinkersLoom.core;

import github.Louwind.TinkersLoom.client.resource.MaterialReloadListener;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.minecraft.util.registry.Registry;

import static github.Louwind.TinkersLoom.common.registry.TinkersRegistry.TOOL;
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

		Registry.register(TOOL, "tinkersloom:axe", AXE);
		Registry.register(TOOL, "tinkersloom:battleaxe", BATTLEAXE);
		Registry.register(TOOL, "tinkersloom:battlesign", BATTLESIGN);
		Registry.register(TOOL, "tinkersloom:broadsword", BROADSWORD);
		Registry.register(TOOL, "tinkersloom:cleaver", CLEAVER);
		Registry.register(TOOL, "tinkersloom:dagger", DAGGER);
		Registry.register(TOOL, "tinkersloom:excavator", EXCAVATOR);
		Registry.register(TOOL, "tinkersloom:flying_pan", FLYING_PAN);
		Registry.register(TOOL, "tinkersloom:hammer", HAMMER);
		Registry.register(TOOL, "tinkersloom:hatchet", HATCHET);
		Registry.register(TOOL, "tinkersloom:longsword", LONGSWORD);
		Registry.register(TOOL, "tinkersloom:lumber", LUMBER);
		Registry.register(TOOL, "tinkersloom:mattock", MATTOCK);
		Registry.register(TOOL, "tinkersloom:pickaxe", PICKAXE);
		Registry.register(TOOL, "tinkersloom:rapier", RAPIER);
		Registry.register(TOOL, "tinkersloom:scythe", SCYTHE);
		Registry.register(TOOL, "tinkersloom:shovel", SHOVEL);

		Registry.register(TRAIT, "tinkersloom:fractured", FRACTURED);
		Registry.register(TRAIT, "tinkersloom:splintering", SPLINTERING);
	}

}
