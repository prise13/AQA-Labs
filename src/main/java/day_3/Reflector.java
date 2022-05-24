package day_3;

import java.lang.reflect.Field;

public class Reflector {
    public static void main(String[] args) {
        ReflectorModel model = new ReflectorModel(1, "Value", true);
        System.out.println(get(model, "name"));
        System.out.println(get(model, "id"));
        System.out.println(get(model, "isActive"));
        put(model, "id", 2);
        clear(model, "name");

    }

    private static Object get(Object object, String fieldName) {
        try {
            Field field = object.getClass().getDeclaredField(fieldName);
            field.setAccessible(true);
            return field.get(object);
        }
        catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static void put(Object object, String fieldName, Object value) {
        try {
            Field field = object.getClass().getDeclaredField(fieldName);
            field.setAccessible(true);
            field.set(object, value);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    private static void clear(Object object, String fieldName) {
        try {
            Field field = object.getClass().getDeclaredField(fieldName);
            field.setAccessible(true);
            field.set(object, null);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }

}
