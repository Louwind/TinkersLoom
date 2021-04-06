package github.Louwind.TinkersLoom.common.registry;

import com.mojang.serialization.Lifecycle;
import github.Louwind.TinkersLoom.common.tool.TinkerTool;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.util.registry.SimpleRegistry;

public class TinkerRegistry {

    public static final SimpleRegistry<TinkerTool> TINKER_TOOL = new SimpleRegistry<>(RegistryKey.ofRegistry(new Identifier("tinkersloom:tool")), Lifecycle.experimental());

}
