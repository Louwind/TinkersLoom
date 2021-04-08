package github.Louwind.TinkersLoom.common.material;

import lombok.Getter;
import lombok.experimental.SuperBuilder;
import net.minecraft.util.Identifier;

@Getter
@SuperBuilder
public class SmeltableMaterial extends Material {

    protected final Identifier fluid;

    protected final Integer fluidPerUnit;

    protected final Integer temperature;

}
