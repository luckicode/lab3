import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);

    int[] oddArray2 = { 1, 2, 3 };
    ArrayExamples.reverseInPlace(oddArray2);
    assertArrayEquals(new int[]{ 3, 2, 1 }, oddArray2);

    int[] evenArray2 = { 1, 2, 3, 4 };
    ArrayExamples.reverseInPlace(evenArray2);
    assertArrayEquals(new int[]{ 4, 3, 2, 1 }, evenArray2);

    int[] evenArrayNeg = { 1, 2, -3, 4 };
    ArrayExamples.reverseInPlace(evenArrayNeg);
    assertArrayEquals(new int[]{ 4, -3, 2, 1 }, evenArrayNeg);


	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{}, ArrayExamples.reversed(input1));

    int[] oddArray = { 1, 2, 3};
    assertArrayEquals(new int[]{ 3, 2, 1 }, ArrayExamples.reversed(oddArray));

    int[] evenArray = { 1, 2, 3, 4,};
    assertArrayEquals(new int[]{ 4, 3, 2, 1 }, ArrayExamples.reversed(evenArray));

    int[] evenArrayNeg = { 1, 2, -3, 4,};
    assertArrayEquals(new int[]{ 4, -3, 2, 1}, ArrayExamples.reversed(evenArrayNeg));

    }

  

  @Test
  public void testAverageWithoutLowest(){
    double[] input1 = {1.0, 1.0, 2.0, 3.0, 4.0};
    assertEquals(3.0, ArrayExamples.averageWithoutLowest(input1),0);
  }
}

