public class CoinFlip{

    public static void main(String[]arg ){
    
    int head = 0;
    int tail = 0;
    
    for (int coin = 0; coin < 1000000; coin++) {
        if (Math.random() < 0.5){
        head++;
         } else {
            tail++;
            
         
         }
    
    }
    System.out.print("coin flipped 1,000,000 times: ");
    System.out.print("head: " + head);
    System.out.print("tail: " + tail);
    }
}
