import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SearchNumberTest {
    SearchNumber searchNumber = new SearchNumber();
    int[] numbers = {1001,999,843,777,543,439,430, 325, 324,292,111,110, 93, 84, 74,43,40,23,12,10,1,0,-1,-13,-123,-432,-567,-954,-1009};

    @Test
    public void testAssertTrue() {
        assertTrue(searchNumber.doSearch(1001, numbers));
        assertTrue(searchNumber.doSearch(999, numbers));
        assertTrue(searchNumber.doSearch(843, numbers));
        assertTrue(searchNumber.doSearch(777, numbers));
        assertTrue(searchNumber.doSearch(543, numbers));
        assertTrue(searchNumber.doSearch(439, numbers));
        assertTrue(searchNumber.doSearch(430, numbers));
        assertTrue(searchNumber.doSearch(325, numbers));
        assertTrue(searchNumber.doSearch(324, numbers));
        assertTrue(searchNumber.doSearch(292, numbers));
        assertTrue(searchNumber.doSearch(111, numbers));
        assertTrue(searchNumber.doSearch(110, numbers));
        assertTrue(searchNumber.doSearch(93, numbers));
        assertTrue(searchNumber.doSearch(84, numbers));
        assertTrue(searchNumber.doSearch(74, numbers));
        assertTrue(searchNumber.doSearch(43, numbers));
        assertTrue(searchNumber.doSearch(40, numbers));
        assertTrue(searchNumber.doSearch(23, numbers));
        assertTrue(searchNumber.doSearch(12, numbers));
        assertTrue(searchNumber.doSearch(10, numbers));
        assertTrue(searchNumber.doSearch(1, numbers));
        assertTrue(searchNumber.doSearch(0, numbers));
        assertTrue(searchNumber.doSearch(-1, numbers));
        assertTrue(searchNumber.doSearch(-13, numbers));
        assertTrue(searchNumber.doSearch(-123, numbers));
        assertTrue(searchNumber.doSearch(-432, numbers));
        assertTrue(searchNumber.doSearch(-567, numbers));
        assertTrue(searchNumber.doSearch(-954, numbers));
        assertTrue(searchNumber.doSearch(-1009, numbers));
    }

    @Test
    public void testAssertFalse() {
        assertFalse(searchNumber.doSearch(1000, numbers));
        assertFalse(searchNumber.doSearch(500, numbers));
        assertFalse(searchNumber.doSearch(300, numbers));
        assertFalse(searchNumber.doSearch(2, numbers));
        assertFalse(searchNumber.doSearch(-100000, numbers));
        assertFalse(searchNumber.doSearch(-100, numbers));
        assertFalse(searchNumber.doSearch(-943, numbers));
        assertFalse(searchNumber.doSearch(888, numbers));
        assertFalse(searchNumber.doSearch(9, numbers));

    }
}
