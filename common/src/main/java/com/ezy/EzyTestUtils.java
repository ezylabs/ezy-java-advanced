package com.ezy;

import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.*;

public class EzyTestUtils {
    public static void assertFieldExists(Class<?> clazz, String fieldName) {
        try {
            clazz.getDeclaredField(fieldName); // Get the field by name
        } catch (NoSuchFieldException e) {
            fail("Field '" + fieldName + "' is missing in class " + clazz.getSimpleName());
        }
    }

    public static void assertFieldNotNull(Class<?> clazz, String fieldName) {
        try {
            Field field = clazz.getDeclaredField(fieldName); // Get the field by name
            assertNotNull(field, "Field '" + fieldName + "' is null");
        } catch (NoSuchFieldException e) {
            fail("Field '" + fieldName + "' is missing in class " + clazz.getSimpleName());
        }
    }


}
