package github.Louwind.TinkersLoom.core;

import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static github.Louwind.TinkersLoom.common.registry.TinkerRegistry.*;
import static github.Louwind.TinkersLoom.core.init.Tools.*;

public class TinkersLoom implements ModInitializer {

	@Override
	public void onInitialize() {
		Registry.register(TINKER_TOOL, new Identifier("tinkersloom:axe"), AXE);
		Registry.register(TINKER_TOOL, new Identifier("tinkersloom:battleaxe"), BATTLEAXE);
		Registry.register(TINKER_TOOL, new Identifier("tinkersloom:battlesign"), BATTLESIGN);
		Registry.register(TINKER_TOOL, new Identifier("tinkersloom:broadsword"), BROADSWORD);
		Registry.register(TINKER_TOOL, new Identifier("tinkersloom:cleaver"), CLEAVER);
		Registry.register(TINKER_TOOL, new Identifier("tinkersloom:dagger"), DAGGER);
		Registry.register(TINKER_TOOL, new Identifier("tinkersloom:excavator"), EXCAVATOR);
		Registry.register(TINKER_TOOL, new Identifier("tinkersloom:flying_pan"), FLYING_PAN);
		Registry.register(TINKER_TOOL, new Identifier("tinkersloom:hammer"), HAMMER);
		Registry.register(TINKER_TOOL, new Identifier("tinkersloom:hatchet"), HATCHET);
		Registry.register(TINKER_TOOL, new Identifier("tinkersloom:longsword"), LONGSWORD);
		Registry.register(TINKER_TOOL, new Identifier("tinkersloom:lumber"), LUMBER);
		Registry.register(TINKER_TOOL, new Identifier("tinkersloom:mattock"), MATTOCK);
		Registry.register(TINKER_TOOL, new Identifier("tinkersloom:pickaxe"), PICKAXE);
		Registry.register(TINKER_TOOL, new Identifier("tinkersloom:rapier"), RAPIER);
		Registry.register(TINKER_TOOL, new Identifier("tinkersloom:scythe"), SCYTHE);
		Registry.register(TINKER_TOOL, new Identifier("tinkersloom:shovel"), SHOVEL);
	}

}
