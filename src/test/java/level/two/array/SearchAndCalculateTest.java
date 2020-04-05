package level.two.array;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SearchAndCalculateTest {

    SearchAndCalculate searchAndCalculate;

    @Before
    public void setUp() {
        searchAndCalculate = new SearchAndCalculate();
    }

    @Test
    public void sumBiggestAndSmallestElementTest1() {
        int[] array = {1, 0, 7, 9};
        assertEquals(9, searchAndCalculate.sumBiggestAndSmallestElement(array));
    }

    @Test
    public void sumBiggestAndSmallestElementTest2() {
        int[] array = {1, 0, 7, 9, 9};
        assertEquals(9, searchAndCalculate.sumBiggestAndSmallestElement(array));
    }

    @Test
    public void sumBiggestAndSmallestElementTest3() {
        int[] array = {9};
        assertEquals(18, searchAndCalculate.sumBiggestAndSmallestElement(array));
    }


    @Test
    public void sumAllElementsExceptBiggestAndSmallestTest1() {
        int[] array = {1, 0, 7, 9};
        assertEquals(8, searchAndCalculate.sumAllElementsExceptBiggestAndSmallest(array));
    }

    @Test
    public void sumAllElementsExceptBiggestAndSmallestTest2() {
        int[] array = {0, 0, 7, 9};
        assertEquals(7, searchAndCalculate.sumAllElementsExceptBiggestAndSmallest(array));
    }

    @Test
    public void sumAllElementsExceptBiggestAndSmallestTest3() {
        int[] array = {9};
        assertEquals(0, searchAndCalculate.sumAllElementsExceptBiggestAndSmallest(array));
    }


    @Test
    public void sumEvenElementTest1() {
        int[] array = {1, 0, 7, 9};
        assertEquals(0, searchAndCalculate.sumEvenElement(array));
    }

    @Test
    public void sumEvenElementTest2() {
        int[] array = {1, 0, 7, 8};
        assertEquals(8, searchAndCalculate.sumEvenElement(array));
    }

    @Test
    public void sumEvenElementTest3() {
        int[] array = {1, 2, 2, 8};
        assertEquals(12, searchAndCalculate.sumEvenElement(array));
    }

    @Test
    public void sumEvenElementTest4() {
        int[] array = {1, 3, 3, 9};
        assertEquals(0, searchAndCalculate.sumEvenElement(array));
    }


    @Test
    public void sumSmallerElementRepeatedTest1() {
        int[] array = {1, 1, 1, 9, 2, 10};
        assertEquals(3, searchAndCalculate.sumSmallerElementRepeated(array));
    }

    @Test
    public void sumSmallerElementRepeatedTest2() {
        int[] array = {1, 1, 0, 0, 2, 10};
        assertEquals(0, searchAndCalculate.sumSmallerElementRepeated(array));
    }

    @Test
    public void sumSmallerElementRepeatedTest3() {
        int[] array = {0, 1, 1, 9, 2, 10};
        assertEquals(0, searchAndCalculate.sumSmallerElementRepeated(array));
    }

    @Test
    public void sumSmallerElementRepeatedTest4() {
        int[] array = {10, 9, 8, 7, 7};
        assertEquals(14, searchAndCalculate.sumSmallerElementRepeated(array));
    }

    @Test
    public void sumSmallerElementRepeatedTest5() {
        int[] array = {2, 2, 1, 1, 1, 3, 4};
        assertEquals(3, searchAndCalculate.sumSmallerElementRepeated(array));
    }

    @Test
    public void sumSmallerElementRepeatedTest6() {
        int[] array = {0, 0, 0, 0, 1, 1, 1, 1, -1, -1, 2, 2, 2, 2};
        assertEquals(-2, searchAndCalculate.sumSmallerElementRepeated(array));
    }

    /**
     * ### Yellow Devil ####
     */
    @Test
    public void bigBossMethodTest1() {
        int[] array1 = {1, 2, 2, 4, 5, 6, 6}; // 16
        int[] array2 = {1, 2, 2, 4, 5, 6, 6}; // 10
        assertEquals(26, searchAndCalculate.bigBossMethod(array1, array2));
    }

    @Test
    public void bigBossMethodTest2() {
        int[] array1 = {1, 2, 2, 4, 5, 6, 6, 2}; // 16
        int[] array2 = {1, 2, 2, 4, 5, 6, 6, 2}; // 10
        assertEquals(26, searchAndCalculate.bigBossMethod(array1, array2));
    }

    @Test
    public void bigBossMethodTest3() {
        int[] array1 = {1, 2, 3, 3, 3, 0, 6}; // 0
        int[] array2 = {1, 2, 1, 4, 1, 0, 1}; // 7
        assertEquals(7, searchAndCalculate.bigBossMethod(array1, array2));
    }

    @Test
    public void bigBossMethodTest4() {
        int[] array1 = {1, 1, 2, 3, 4, 4}; // 8
        int[] array2 = {1, 1, 2, 2, 3}; // 3
        assertEquals(11, searchAndCalculate.bigBossMethod(array1, array2));
    }

    @Test
    public void bigBossMethodTest5() {
        int[] array1 = {-1, -1, -3, 3, 3, 5, 5, 6}; // 0
        int[] array2 = {1, 2, 3}; // 5
        assertEquals(5, searchAndCalculate.bigBossMethod(array1, array2));
    }

    @Test
    public void bigBossMethodTest6() {
        int[] array1 = new int[0];
        int[] array2 = new int[0];
        assertEquals(0, searchAndCalculate.bigBossMethod(array1, array2));
    }

    @Test
    public void bigBossMethodTest7() {
        int[] array1 = {2, 2, 3, 2, 2, 2};
        int[] array2 = new int[0];
        assertEquals(6, searchAndCalculate.bigBossMethod(array1, array2));
    }
}