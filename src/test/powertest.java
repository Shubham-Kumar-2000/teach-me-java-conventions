package powerpackage;


import org.junit.Test;

public class PowerFinderTest {
    @Test
    public void test1Power1Is1() {
        assert PowerFinder.getPower(1,1) == 1;
    }

    @Test
    public void test2Power1Is2() {
        assert PowerFinder.getPower(2,1) == 2;
    }

    @Test
    public void test2Power2Is4() {
        assert PowerFinder.getPower(2, 2) == 4;
    }

    @Test
    public void test3Power2Is9() {
        assert PowerFinder.getPower(3, 2) == 3*3;
    }
}