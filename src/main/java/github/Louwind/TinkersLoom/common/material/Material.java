package github.Louwind.TinkersLoom.common.material;

import github.Louwind.TinkersLoom.common.util.serializable.MaterialType;
import lombok.Data;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Data
public class Material {

    @Nullable
    private final Boolean craftable;

    @Nullable
    private final Integer tier;

    @Nullable
    private final Integer sortOrder;

    @Nullable
    private final Identifier fluid;

    @Nullable
    private final Integer fluidPerUnit;

    @Nullable
    private final String textColor;

    @Nullable
    private final Integer temperature;

    @NotNull
    private final MaterialType type;
}
