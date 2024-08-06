import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder( MethodSorters.NAME_ASCENDING ) // force name ordering
public class SampleTest {
        @Test
        public void stage1_prepareAndTest(){};

        @Test
        public void stage2_checkSomething(){};

        @Test
        public void stage2_checkSomethingElse(){};

        @Test
        public void stage3_thisDependsOnStage2(){};

        @Test
        public void callTimeDoesntMatter(){}
    }


