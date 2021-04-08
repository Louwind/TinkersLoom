package github.Louwind.TinkersLoom.common.material;

import github.Louwind.TinkersLoom.common.util.serializable.MaterialSerializableType;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
public class Material {

    protected final Integer tier;

    protected final String textColor;

    protected final MaterialSerializableType type;

}
