package github.Louwind.TinkersLoom.core.item;

import com.google.common.collect.Multimap;
import github.Louwind.TinkersLoom.common.tool.TinkersTool;
import net.fabricmc.fabric.api.tool.attribute.v1.DynamicAttributeTool;
import net.minecraft.block.BlockState;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tag.Tag;
import org.jetbrains.annotations.Nullable;

public class TinkersToolItem extends Item implements DynamicAttributeTool {

    protected final TinkersTool tool;

    public TinkersToolItem(TinkersTool tool, Settings settings) {
        super(settings);

        this.tool = tool;
    }

    @Override
    public Multimap<EntityAttribute, EntityAttributeModifier> getDynamicModifiers(EquipmentSlot slot, ItemStack stack, @Nullable LivingEntity user) {
        return DynamicAttributeTool.EMPTY;
    }

    @Override
    public int getMiningLevel(Tag<Item> tag, BlockState state, ItemStack stack, @Nullable LivingEntity user) {
        return 0;
    }

    @Override
    public float getMiningSpeedMultiplier(Tag<Item> tag, BlockState state, ItemStack stack, @Nullable LivingEntity user) {
        return 0;
    }

}
