package github.Louwind.TinkersLoom.core.util.trait.serializer;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import github.Louwind.TinkersLoom.common.util.TinkersJsonHelper;
import github.Louwind.TinkersLoom.core.tool.material.trail.IncreasingAttributeTrait;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.util.JsonHelper;
import net.minecraft.util.JsonSerializer;

import static net.minecraft.util.registry.Registry.ATTRIBUTE;

public class IncreasingAttributeTraitSerializer implements JsonSerializer<IncreasingAttributeTrait> {

    @Override
    public void toJson(JsonObject json, IncreasingAttributeTrait object, JsonSerializationContext context) {
        json.addProperty("trait", "tinkersloom:increasing_attribute_on_attack");
        json.addProperty("attribute", ATTRIBUTE.getId(object.getAttribute()).toString());
        json.addProperty("amount", object.getAmount());
        json.addProperty("name", object.getName());
        json.addProperty("operation", object.getOperation().toString().toLowerCase());
    }

    @Override
    public IncreasingAttributeTrait fromJson(JsonObject json, JsonDeserializationContext context) {
        EntityAttributeModifier.Operation operation = TinkersJsonHelper.getOperation(json, "operation");
        EntityAttribute attribute = TinkersJsonHelper.getEntityAttribute(json, "attribute");
        int stacks = JsonHelper.getInt(json, "stacks", 1);
        float amount = JsonHelper.getFloat(json, "amount");
        String name = JsonHelper.getString(json, "name");

        return new IncreasingAttributeTrait(name, attribute, stacks, amount, operation);
    }

}
