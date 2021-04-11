package github.Louwind.TinkersLoom.common.util;

import com.google.gson.JsonObject;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.util.Identifier;
import net.minecraft.util.JsonHelper;

import java.util.function.UnaryOperator;

import static net.minecraft.util.registry.Registry.ATTRIBUTE;

public class TinkersJsonHelper {

    public static EntityAttribute getEntityAttribute(JsonObject object, String name) {
        Identifier id = TinkersJsonHelper.getIdentifier(object , name);

        return ATTRIBUTE.get(id);
    }

    public static <T extends Enum> T getEnum(JsonObject object, Class<T>  clazz, String name) {
        return TinkersJsonHelper.getEnum(object, clazz, name, String::toUpperCase);
    }

    @SuppressWarnings("unchecked")
    public static <T extends Enum> T getEnum(JsonObject object, Class<T>  clazz, String name, UnaryOperator<String> operator) {
        String string = JsonHelper.getString(object, name);

        return (T) Enum.valueOf(clazz, operator.apply(string));
    }

    public static Identifier getIdentifier(JsonObject object, String name) {
        String id = JsonHelper.getString(object, name);

        return new Identifier(id);
    }

    public static EntityAttributeModifier.Operation getOperation(JsonObject object, String name) {
        return TinkersJsonHelper.getEnum(object, EntityAttributeModifier.Operation.class, name);
    }

}
