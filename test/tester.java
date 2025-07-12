package test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
import TwoSumActivity.twoSum;


public class tester{

@Test
void sampleTest1() {
    int[] result = TwoSumActivity.twoSum(5 ,new int[]{1,4,11,15});
    assertArrayEquals(new result[]{0,1},5,"GG");
}
@Test
void sampleTest2() {
    List<Integer> numbers = Arrays.asList(1, 2, 3);
    assertTrue((numbers.get(1)==2),"GOOD");
}
}
