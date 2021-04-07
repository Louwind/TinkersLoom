package github.Louwind.TinkersLoom.core.init;

import github.Louwind.TinkersLoom.common.tool.stats.TinkersToolStats;

public class Stats {

    public static final TinkersToolStats AXE = new TinkersToolStats.Builder()
            .setDamageBonus(6.0f)
            .setAttackSpeed(0.9f)
            .build();

    public static final TinkersToolStats BROADSWORD = new TinkersToolStats.Builder()
            .setDamageBonus(3f)
            .setAttackSpeed(1.6f)
            .setMiningSpeedModifier(0.5f)
            .setDurabilityModifier(1.1f)
            .build();

    public static final TinkersToolStats EXCAVATOR = new TinkersToolStats.Builder()
            .setDamageBonus(1.5f)
            .setDamageModifier(1.25f)
            .setAttackSpeed(0.7f)
            .setMiningSpeedModifier(0.3f)
            .setDurabilityModifier(3.75f)
            .setKnockbackBonus(1f)
            .setDefaultUpgrades(2)
            .build();

    public static final TinkersToolStats KAMA = new TinkersToolStats.Builder()
            .setDamageBonus(1.25f)
            .setAttackSpeed(1.3f)
            .build();

    public static final TinkersToolStats MATTOCK = new TinkersToolStats.Builder()
            .setDamageBonus(1.5f)
            .setAttackSpeed(1f)
            .build();

    public static final TinkersToolStats PICKAXE = new TinkersToolStats.Builder()
            .setDamageBonus(1f)
            .setAttackSpeed(1.2f)
            .build();

    public static final TinkersToolStats SLEDGE_HAMMER = new TinkersToolStats.Builder()
            .setDamageBonus(5f)
            .setDamageModifier(1.5f)
            .setAttackSpeed(0.5f)
            .setMiningSpeedModifier(0.4f)
            .setDurabilityModifier(4f)
            .setPrimaryHeadWeight(2)
            .setDefaultUpgrades(2)
            .build();

}
