import com.ezy.EzyTestUtils;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class Tests {

    @Test
    void testIdentifyVariableTypes() throws NoSuchFieldException {
        // Get the SampleClass class reference
        Class<?> clazz = Task.class;

        // Check for required fields
        EzyTestUtils.assertFieldExists(clazz, "name");
        EzyTestUtils.assertFieldExists(clazz, "age");
        EzyTestUtils.assertFieldExists(clazz, "height");
        EzyTestUtils.assertFieldExists(clazz, "isJavaFun");

        // Check for required data types of the fields
        assertEquals("String", clazz.getDeclaredField("name").getType().getSimpleName(), "Invalid data type for the variable 'name'");
        assertEquals("int", clazz.getDeclaredField("age").getType().getSimpleName(), "Invalid data type for the variable 'age'");
        assertEquals("double", clazz.getDeclaredField("height").getType().getSimpleName(), "Invalid data type for the variable 'height'");
        assertEquals( "boolean", clazz.getDeclaredField("isJavaFun").getType().getSimpleName(), "Invalid data type for the variable 'isJavaFun'");
    }
}