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
    EzyTestUtils.assertFieldExists(clazz, "personAge");
    EzyTestUtils.assertFieldExists(clazz, "cityPopulation");
    EzyTestUtils.assertFieldExists(clazz, "distanceBetweenPlanets");
    EzyTestUtils.assertFieldExists(clazz, "gender");
    EzyTestUtils.assertFieldExists(clazz, "flag");
    EzyTestUtils.assertFieldExists(clazz, "pi");

    // Check for required data types of the fields
    assertEquals("byte", clazz.getDeclaredField("personAge").getType().getSimpleName(), "Invalid data type for the variable 'personAge'");
    assertEquals("int", clazz.getDeclaredField("cityPopulation").getType().getSimpleName(), "Invalid data type for the variable 'cityPopulation'");
    assertEquals("long", clazz.getDeclaredField("distanceBetweenPlanets").getType().getSimpleName(), "Invalid data type for the variable 'distanceBetweenPlanets'");
    assertEquals( "char", clazz.getDeclaredField("gender").getType().getSimpleName(), "Invalid data type for the variable 'gender'");
    assertEquals( "boolean", clazz.getDeclaredField("flag").getType().getSimpleName(), "Invalid data type for the variable 'flag'");
    assertEquals( "double", clazz.getDeclaredField("pi").getType().getSimpleName(), "Invalid data type for the variable 'pi'");

    
  }
}