
import org.junit.jupiter.api.Test;
import java.lang.reflect.Field;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class  L1_3_StatsTest {

    @Test
    public void testVariablesDeclared() throws NoSuchFieldException {
        // Get the class
        Class<?> clazz = L1_3_Statistics.class;

        // Check if the fields exist
        boolean hasByte = false, hasShort = false, hasInt = false, hasSum = false, hasAvg = false, hasVariance = false;

        for (Field field : clazz.getDeclaredFields()) {
            String typeName = field.getType().getSimpleName();
            String fieldName = field.getName();

            if (typeName.equals("byte")) hasByte = true;
            if (typeName.equals("short")) hasShort = true;
            if (typeName.equals("int") && fieldName.equals("sum")) hasSum = true;
            if (typeName.equals("int")) hasInt = true;
            if (typeName.equals("double") && fieldName.equals("average")) hasAvg = true;
            if (typeName.equals("double") && fieldName.equals("variance")) hasVariance = true;
        }

        // Assert that the required variables are declared
        assertTrue(hasByte, "Byte variable for grade is missing.");
        assertTrue(hasShort, "Short variable for grade is missing.");
        assertTrue(hasInt, "Int variable for grade is missing.");
        assertTrue(hasSum, "Sum variable is missing.");
        assertTrue(hasAvg, "Average variable is missing.");
        assertTrue(hasVariance, "Variance variable is missing.");
    }
}
