public class Combination{

    public static void main(String[]args ){
        int count = 0;
        
        for (int num = 1; num <=7; num++){
            for (int comb = num +1; comb <=7; comb++){
            
                System.out.println("(" + num + "," + comb + ")");
                count++;
            
            }
        }
        System.out.println ("the total combination is : " + count);
    }
    }
