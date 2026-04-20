public class LeapYear{

    public static void main(String[]args){
    int count = 0;
    
    for (int year = 2000; year <= 2100; year++){
        if (isLeapYear(year)) {
            
            System.out.printf("%5d", year);
            count++;
            if(count %10 == 0){
                System.out.println();
            }
        
        }
    
    }
    
    }

}
