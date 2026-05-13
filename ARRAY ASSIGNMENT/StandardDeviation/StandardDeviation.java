public class StandardDeviation{
    public static double sum(int[]array){
    
        int sum = 0;
        for(int count:array){
            sum = sum + count;
            }
            return sum;
            }
            
            
            public static double mean(int[]array){
                double mean = sum(array)/array.length;
                return mean;
                
            }
            
            public static double meanDeviation(int[] array){
                double number = 0;
                double total = 0;
                for(int count:array){
                    number = ((count - mean(array))*(count - mean(array)));
                    total = total + number;
                    
                    }
                            return total;
                     }
                     
                     public static double variance(int[] array){
                        double variance = meanDeviation(array) / array.length;
                        return variance;
                    }
                    
                     public static double standardDeviation(int[] array){
                        double standardDeviation = Math.sqrt(variance(array));
                        return standardDeviation;
                    }
                    }
                    
