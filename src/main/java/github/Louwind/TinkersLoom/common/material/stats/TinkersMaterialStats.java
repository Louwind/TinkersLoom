package github.Louwind.TinkersLoom.common.material.stats;

import lombok.Builder;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
public class TinkersMaterialStats {

    @Builder.Default
    private final float attackDamage = 0F;

    @Builder.Default
    private final float attackSpeed = 1F;

    @Builder.Default
    private final float miningSpeed = 0F;

    @Builder.Default
    private final int durability = 0;

    @Builder.Default
    private final int miningLevel = 1;

    @Builder.Default
    private final float attackDamageModifier = 1F;

    @Builder.Default
    private final float durabilityModifier = 1F;

    @Builder.Default
    private final float miningSpeedModifier = 1F;

}
