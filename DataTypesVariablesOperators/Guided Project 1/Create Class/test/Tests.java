import org.junit.jupiter.api.Test;
import java.lang.reflect.Field;
import static org.junit.jupiter.api.Assertions.*;

public class Tests {

  @Test
  void testCustomerClassAndNameProperty() {
    try {
      // Check if the class exists
      Class<?> clazz = Class.forName("Customer");
      assertNotNull(clazz, "Customer class should exist.");

      // Check if 'name' field exists
      Field field = clazz.getDeclaredField("name");
      assertNotNull(field, "Field 'name' should exist in Customer class.");
      assertEquals(String.class, field.getType(), "Field 'name' should be of type String.");

    } catch (ClassNotFoundException e) {
      fail("Customer class is missing!");
    } catch (NoSuchFieldException e) {
      fail("Field 'name' is missing in Customer class!");
    }
  }
}