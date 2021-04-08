package github.Louwind.TinkersLoom.core.util.material.serializer;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import github.Louwind.TinkersLoom.common.material.SmeltableMaterial;
import github.Louwind.TinkersLoom.common.util.TinkersJsonHelper;
import net.minecraft.util.Identifier;
import net.minecraft.util.JsonHelper;
import net.minecraft.util.JsonSerializer;

import static github.Louwind.TinkersLoom.common.registry.TinkersRegistry.MATERIAL;
import static github.Louwind.TinkersLoom.core.init.MaterialTypes.SMELTABLE;

public class SmeltableMaterialSerializer implements JsonSerializer<SmeltableMaterial> {

    @Override
    public void toJson(JsonObject json, SmeltableMaterial object, JsonSerializationContext context) {
        json.addProperty("material", MATERIAL.getId(SMELTABLE).toString());
        json.addProperty("tier", object.getTier());
        json.addProperty("textColor", object.getTextColor());
        json.addProperty("fluid", object.getFluid().toString());
        json.addProperty("fluidPerUnit", object.getFluidPerUnit());
        json.addProperty("temperature", object.getTemperature());
    }

    @Override
    public SmeltableMaterial fromJson(JsonObject json, JsonDeserializationContext context) {
        Identifier fluid = TinkersJsonHelper.getIdentifier(json, "fluid");
        String textColor = JsonHelper.getString(json, "textColor");
        int fluidPerUnit = JsonHelper.getInt(json, "fluidPerUnit");
        int temperature = JsonHelper.getInt(json, "temperature");
        int tier = JsonHelper.getInt(json, "tier");

        return SmeltableMaterial.builder()
                .fluid(fluid)
                .fluidPerUnit(fluidPerUnit)
                .tier(tier)
                .temperature(temperature)
                .textColor(textColor)
                .type(SMELTABLE)
                .build();
    }

}
