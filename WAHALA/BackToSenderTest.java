public class BackToSenderTest {
    public static void main(String[] args) { 
     
    int result1 = BackToSender.calculateWage(25); 
    assert result1 == 9000 : "Test 1 Failed: Expected 9000 but got " + result1;        
    System.out.println("Test 1 Passed: 25 deliveries → " + result1);
    
    
    int result2 = BackToSender.calculateWage(55);
    assert result2 == 16000 : "Test 2 Failed: Expected 16000 but got " + result2;        
    System.out.println("Test 2 Passed: 55 deliveries → " + result2);
    
    
    int result3 = BackToSender.calculateWage(65);
    assert result3 == 21250 : "Test 3 Failed: Expected 21250 but got " + result3;        
    System.out.println("Test 3 Passed: 65 deliveries → " + result3);
    
    
    int result4 = BackToSender.calculateWage(80);        
    assert result4 == 45000 : "Test 4 Failed: Expected 45000 but got " + result4;        
    System.out.println("Test 4 Passed: 80 deliveries → " + result4);        System.out.println("\nAll tests passed!");    } }
