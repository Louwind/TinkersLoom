package github.Louwind.TinkersLoom.common.tool.stats;

import lombok.AccessLevel;
import lombok.Builder;

@Builder(access = AccessLevel.PUBLIC)
public class TinkersToolStats {

    @Builder.Default
    private final float attackSpeed = 1F;

    @Builder.Default
    private final float damageBonus = 0F;

    @Builder.Default
    private final float damageCutoff = 15F;

    @Builder.Default
    private final float damageModifier = 1F;

    @Builder.Default
    private final float durabilityModifier = 1F;

    @Builder.Default
    private final float knockbackBonus = 0F;

    @Builder.Default
    private final float miningSpeedModifier = 1F;

    @Builder.Default
    private final int defaultAbilities = 1;

    @Builder.Default
    private final int defaultTraits = 0;

    @Builder.Default
    private final int defaultUpgrades = 3;

    @Builder.Default
    private final int primaryHeadWeight = 1;

}
