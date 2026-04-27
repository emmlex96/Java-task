public class BackToSender {    
public static int calculateWage(int successfulDeliveries) {        
int basePay = 5000;        
int totalPackages = 100;        
double collectionRate = ((double) successfulDeliveries / totalPackages) * 100;        
int amountPerParcel;        
if (collectionRate < 50) {            
    amountPerParcel = 160;        
    } else if (collectionRate <= 59) {            
        amountPerParcel = 200;        
        } else if (collectionRate <= 69) {            
            amountPerParcel = 250;        
            } else {            
                amountPerParcel = 500;        
                }        
        return (successfulDeliveries * amountPerParcel) + basePay;    } }
