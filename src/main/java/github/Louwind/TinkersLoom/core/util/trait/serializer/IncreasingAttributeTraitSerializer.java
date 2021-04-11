package github.Louwind.TinkersLoom.core.util.trait.serializer;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import github.Louwind.TinkersLoom.core.tool.material.trail.IncreasingAttributeTrait;
import net.minecraft.util.JsonSerializer;

public class IncreasingAttributeTraitSerializer implements JsonSerializer<IncreasingAttributeTrait> {

    @Override
    public void toJson(JsonObject json, IncreasingAttributeTrait object, JsonSerializationContext context) {
        // TODO toJson
    }

    @Override
    public IncreasingAttributeTrait fromJson(JsonObject json, JsonDeserializationContext context) {
        // TODO fromJson
        return null;
    }

}
