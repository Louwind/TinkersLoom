package github.Louwind.TinkersLoom.core.util.material.serializer;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import github.Louwind.TinkersLoom.common.material.Material;
import net.minecraft.util.JsonHelper;
import net.minecraft.util.JsonSerializer;

import static github.Louwind.TinkersLoom.common.registry.TinkersRegistry.MATERIAL;
import static github.Louwind.TinkersLoom.core.init.MaterialTypes.NON_METALLIC;

public class NonMetallicMaterialSerializer implements JsonSerializer<Material> {

    @Override
    public void toJson(JsonObject json, Material object, JsonSerializationContext context) {
        json.addProperty("material", MATERIAL.getId(NON_METALLIC).toString());
        json.addProperty("tier", object.getTier());
        json.addProperty("textColor", object.getTextColor());
    }

    @Override
    public Material fromJson(JsonObject json, JsonDeserializationContext context) {
        String textColor = JsonHelper.getString(json, "textColor");
        int tier = JsonHelper.getInt(json, "tier");

        return Material.builder()
                .textColor(textColor)
                .tier(tier)
                .type(NON_METALLIC)
                .build();
    }

}