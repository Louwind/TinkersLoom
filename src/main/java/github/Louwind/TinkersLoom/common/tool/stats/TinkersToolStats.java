package github.Louwind.TinkersLoom.common.tool.stats;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
public class TinkersToolStats {

    private final float attackSpeed;
    private final float damageBonus;
    private final float damageCutoff;
    private final float damageModifier;
    private final float durabilityModifier;
    private final float knockbackBonus;
    private final float miningSpeedModifier;

    private final int defaultAbilities;
    private final int defaultTraits;
    private final int defaultUpgrades;
    private final int primaryHeadWeight;

    public TinkersToolStats(float attackSpeed, float damageBonus, float damageCutoff, float durabilityModifier, float knockbackBonus, float miningSpeedModifier, float damageModifier, int defaultAbilities, int defaultTraits, int defaultUpgrades, int primaryHeadWeight) {
        this.attackSpeed = attackSpeed;
        this.damageBonus = damageBonus;
        this.damageCutoff = damageCutoff;
        this.durabilityModifier = durabilityModifier;
        this.knockbackBonus = knockbackBonus;
        this.miningSpeedModifier = miningSpeedModifier;
        this.damageModifier = damageModifier;
        this.defaultAbilities = defaultAbilities;
        this.defaultTraits = defaultTraits;
        this.defaultUpgrades = defaultUpgrades;
        this.primaryHeadWeight = primaryHeadWeight;
    }

    @Setter @Accessors(chain = true)
    public static class Builder {

        // Modifiers
        private float attackSpeed = 1F;
        private float damageCutoff = 15F;
        private float damageModifier = 1F;
        private float durabilityModifier = 1F;
        private float miningSpeedModifier = 1F;
        // Bonus
        private float damageBonus = 0F;
        private float knockbackBonus = 0F;
        // Extras
        private int defaultAbilities = 1;
        private int defaultTraits = 0;
        private int defaultUpgrades = 3;
        private int primaryHeadWeight = 1;

        public TinkersToolStats build() {
            return new TinkersToolStats(this.attackSpeed, this.damageBonus, this.damageCutoff, this.damageModifier, this.durabilityModifier, this.knockbackBonus, this.miningSpeedModifier, this.defaultAbilities, this.defaultTraits, this.defaultUpgrades, this.primaryHeadWeight);
        }

    }

}
