import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class StandardDeviationTest{

@Test
public void TestThatStandardDeviationExist(){
    int[] array = {4,6,8,10,12};
    StandardDeviation.sum(array);
}

@Test
public void TestThatStandardDeviationSumofArrayIsAccurate(){
    int [] array = {4,6,8,10,12};
    double expected = 40;
    double actual = StandardDeviation.sum(array);
    assertEquals(actual, expected);
}

@Test
public void TestThatGetMeanOfTheStandardDeviationIsAccurate(){
    int [] array = {4,6,8,10,12};
    double expected = 4;
    double actual = StandardDeviation.mean(array);
    assertEquals(actual,expected);
}

@Test
public void TestThatGetMeanDeviationOfTheStandardDeviationIsAccurate(){
    int [] array = {4,6,8,10,12};
    double expected = 40;
    double actual = StandardDeviation.meanDeviation(array);
    assertEquals(actual, expected);
    
}


@Test
public void TestThatGetvarianceOfTheStandardDeviationIsAccurate(){
    int [] array = {4,6,8,10,12};
    double expected = 8;
    double actual = StandardDeviation.variance(array);
    assertEquals(actual, expected);
    }
    
    
    @Test
    public void TestThatGetStandardDeviationIsAccurate(){
    int [] array = {4,6,8,10,12};
    double expected = 2;
    double actual = StandardDeviation.standardDeviation(array);
    assertEquals(actual, expected);
    }
    
}
