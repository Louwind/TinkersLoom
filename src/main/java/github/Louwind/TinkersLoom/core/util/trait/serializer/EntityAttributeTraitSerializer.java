package github.Louwind.TinkersLoom.core.util.trait.serializer;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import github.Louwind.TinkersLoom.common.util.TinkersJsonHelper;
import github.Louwind.TinkersLoom.core.tool.material.trail.LevelingAttributeTrait;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.util.JsonHelper;
import net.minecraft.util.JsonSerializer;

import static net.minecraft.util.registry.Registry.ATTRIBUTE;

public class EntityAttributeTraitSerializer implements JsonSerializer<LevelingAttributeTrait> {

    @Override
    public void toJson(JsonObject json, LevelingAttributeTrait object, JsonSerializationContext context) {
        json.addProperty("trait", "tinkersloom:leveling_attribute");
        json.addProperty("attribute", ATTRIBUTE.getId(object.getAttribute()).toString());
        json.addProperty("multiplier", object.getMultiplier());
        json.addProperty("name", object.getName());
        json.addProperty("operation", object.getOperation().toString().toLowerCase());
    }

    @Override
    public LevelingAttributeTrait fromJson(JsonObject json, JsonDeserializationContext context) {
        EntityAttributeModifier.Operation operation = TinkersJsonHelper.getOperation(json, "operation");
        EntityAttribute attribute = TinkersJsonHelper.getEntityAttribute(json, "attribute");
        float multiplier = JsonHelper.getFloat(json, "multiplier", 1F);
        String name = JsonHelper.getString(json, "name");

        return new LevelingAttributeTrait(name, attribute, multiplier, operation);
    }

}
