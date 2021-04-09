package github.Louwind.TinkersLoom.common.material;

import github.Louwind.TinkersLoom.common.util.serializable.MaterialSerializableType;
import lombok.Getter;
import lombok.experimental.SuperBuilder;
import org.jetbrains.annotations.NotNull;

@Getter
@SuperBuilder
public class Material implements Comparable<Material> {

    protected final int tier;

    protected final String textColor;

    protected final MaterialSerializableType type;

    @Override
    public int compareTo(@NotNull Material other) {

        if (this.getTier() != other.getTier())
            return Integer.compare(this.getTier(), other.getTier());

        return 0;
    }

}
