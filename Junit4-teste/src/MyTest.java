import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MyTest {

    @Test
    public void test1() {
        System.out.println("Executing test1");
    }

    @Test
    public void test2() {
        System.out.println("Executing test2");
    }
}
