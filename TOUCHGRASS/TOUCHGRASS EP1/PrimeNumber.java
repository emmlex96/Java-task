public class PrimeNumber{

    public static void main(String[]args){
    int count = 0;
    
    for (int digit = 2; digit <= 1200; digit++){
        
        
           System.out.printf("%5d",digit);
           count++;
           
           if (count % 8 ==0){
              System.out.println();
           }
        }
    
    if (count % 8 != 0) 
    System.out.println();
    }

}
