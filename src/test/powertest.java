package powerpackage;


import org.junit.Test;

public class PowerFinderTest {
    @Test
    public void shouldReturn1When1IsRaisedToPower1() {
        assert PowerFinder.getPower(1,1) == 1;
    }

    @Test
    public void shouldReturn2When2IsRaisedToPower1() {
        assert PowerFinder.getPower(2,1) == 2;
    }

    @Test
    public void shouldReturn4When2IsRaisedToPower2() {
        assert PowerFinder.getPower(2, 2) == 4;
    }

    @Test
    public void shouldReturn9When3IsRaisedToPower2() {
        assert PowerFinder.getPower(3, 2) == 3*3;
    }
}
