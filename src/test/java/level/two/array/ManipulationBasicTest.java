package level.two.array;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ManipulationBasicTest {
    ManipulationBasic manipulationBasic;

    @Before
    public void setUp() {
        manipulationBasic = new ManipulationBasic();
    }

    @Test
    public void biggesstElementTest1() {
        int[] array = {-10, 10, 8, 10};
        assertEquals(10, manipulationBasic.biggesstElement(array));
    }

    @Test
    public void biggesstElementTest2() {
        int[] array = {-10, -10, -8, -10};
        assertEquals(-8, manipulationBasic.biggesstElement(array));
    }

    @Test
    public void biggesstElementTest3() {
        int[] array = {0};
        assertEquals(0, manipulationBasic.biggesstElement(array));
    }

    @Test
    public void smallestElementTest1() {
        int[] array = {0};
        assertEquals(0, manipulationBasic.smallestElement(array));
    }

    @Test
    public void smallestElementTest2() {
        int[] array = {-10, -10, -8, -10};
        assertEquals(-10, manipulationBasic.smallestElement(array));
    }

    @Test
    public void countEvenElementTest1() {
        int[] array = {2, 2, 2, 2, 4};
        assertEquals(5, manipulationBasic.countEvenElement(array));
    }

    @Test
    public void countEvenElementTest2() {
        int[] array = {1, 3, 5, 7, 9, -2};
        assertEquals(1, manipulationBasic.countEvenElement(array));
    }

    @Test
    public void countEvenElementTest3() {
        int[] array = {5};
        assertEquals(0, manipulationBasic.countEvenElement(array));
    }

    @Test
    public void countOddElementtest1() {
        int[] array = {2, 2, 2, 2, 4};
        assertEquals(0, manipulationBasic.countOddElement(array));
    }

    @Test
    public void countOddElementTest2() {
        int[] array = {1, 3, 5, 7, 9, -2};
        assertEquals(5, manipulationBasic.countOddElement(array));
    }

    @Test
    public void countOddElementtest3() {
        int[] array = {5};
        assertEquals(1, manipulationBasic.countOddElement(array));
    }


    @Test
    public void sumEvenElementtest1() {
        int[] array = {2, 2, 2, 2, 4};
        assertEquals(16, manipulationBasic.sumEvenElement(array));
    }

    @Test
    public void sumEvenElementtest2() {
        int[] array = {1, 3, 5, 7, 9, -2};
        assertEquals(-2, manipulationBasic.sumEvenElement(array));
    }

    @Test
    public void sumEvenElementtest3() {
        int[] array = {5, 5, 6, 6, 0};
        assertEquals(12, manipulationBasic.sumEvenElement(array));
    }

    @Test
    public void sumAllElementstest1() {
        int[] array = {23};
        assertEquals(23, manipulationBasic.sumAllElements(array));
    }

    @Test
    public void sumAllElementstest2() {
        int[] array = {-1, 2, -1};
        assertEquals(0, manipulationBasic.sumAllElements(array));
    }

    @Test
    public void sumAllElementstest3() {
        int[] array = {10, 8, 0, 0, 0};
        assertEquals(18, manipulationBasic.sumAllElements(array));
    }

    @Test
    public void bossMethodTest1() {
        int[] array = {23};
        assertEquals(-23, manipulationBasic.bossMethod(array));
    }

    @Test
    public void bossMethodTest2() {
        int[] array = {0, 2, 4, 6};
        assertEquals(3, manipulationBasic.bossMethod(array));
    }

    @Test
    public void bossMethodtest3() {
        int[] array = {10, 8, 0, 0, 0, 14};
        assertEquals(4, manipulationBasic.bossMethod(array));
    }

    @Test
    public void bossMethodtest4() {
        int[] array = {-1, -3, -5, 0, 0};
        assertEquals(9, manipulationBasic.bossMethod(array));
    }

}