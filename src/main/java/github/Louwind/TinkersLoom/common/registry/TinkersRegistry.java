package github.Louwind.TinkersLoom.common.registry;

import com.mojang.serialization.Lifecycle;
import github.Louwind.TinkersLoom.common.util.serializable.MaterialType;
import github.Louwind.TinkersLoom.common.material.Trait;
import github.Louwind.TinkersLoom.common.tool.TinkersTool;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.util.registry.SimpleRegistry;

public class TinkersRegistry {

    public static final SimpleRegistry<MaterialType> MATERIAL = new SimpleRegistry<>(RegistryKey.ofRegistry(new Identifier("tinkersloom:material")), Lifecycle.stable());

    public static final SimpleRegistry<TinkersTool> TINKER_TOOL = new SimpleRegistry<>(RegistryKey.ofRegistry(new Identifier("tinkersloom:tool")), Lifecycle.stable());

    public static final SimpleRegistry<Trait> TRAIT = new SimpleRegistry<>(RegistryKey.ofRegistry(new Identifier("tinkersloom:trait")), Lifecycle.stable());

}
