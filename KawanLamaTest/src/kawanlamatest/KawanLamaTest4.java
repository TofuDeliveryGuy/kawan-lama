package kawanlamatest;
import java.util.HashMap;
import java.util.LinkedList;
public class KawanLamaTest4 {
    public static void main(String[] args) {
        int rubyQty = 5;
        int topazQty = 3;
        int permataQty = 1;
        int rubyPrc = 1000000;
        int topazPrc = 1250000;
        int permataPrc = 3000000;
        int maxProfit=0;
        
        //get the qty and price in order
        //then push to linkedlist array to pop 2 at a time
        LinkedList<Integer> finalList = new LinkedList<Integer>();
        if(rubyPrc>topazPrc){
            if(rubyPrc>permataPrc){
                for(int i = 0; i< rubyQty; i++){
                    finalList.add(rubyPrc);
                }
                if(topazPrc>permataPrc){
                    for(int i = 0; i< topazQty; i++){
                        finalList.add(topazPrc);
                    }
                    for(int i = 0; i< permataQty; i++){
                        finalList.add(permataPrc);
                    }
                }
                else{
                    for(int i = 0; i< permataQty; i++){
                        finalList.add(permataPrc);
                    }
                    for(int i = 0; i< topazQty; i++){
                        finalList.add(topazPrc);
                    }
                }
            }
            else{
                for(int i = 0; i< permataQty; i++){
                    finalList.add(permataPrc);
                }
                for(int i = 0; i< rubyQty; i++){
                    finalList.add(rubyPrc);
                }
                for(int i = 0; i< topazQty; i++){
                    finalList.add(topazPrc);
                }
            }
        }
        else{
            if(topazPrc>permataPrc){
                for(int i = 0; i< topazQty; i++){
                    finalList.add(topazPrc);
                }
                if(rubyPrc>permataPrc){
                    for(int i = 0; i< rubyQty; i++){
                        finalList.add(rubyPrc);
                    }
                    for(int i = 0; i< permataQty; i++){
                        finalList.add(permataPrc);
                    }
                }
                else{
                    for(int i = 0; i< permataQty; i++){
                        finalList.add(permataPrc);
                    }
                    for(int i = 0; i< rubyQty; i++){
                        finalList.add(rubyPrc);
                    }
                }
            }
            else{
                for(int i = 0; i< permataQty; i++){
                    finalList.add(permataPrc);
                }
                for(int i = 0; i< topazQty; i++){
                    finalList.add(topazPrc);
                }
                for(int i = 0; i< rubyQty; i++){
                    finalList.add(rubyPrc);
                }
            }
        }
        while(finalList.size()/2 != 0){
            for(int i = 0; i < 2; i++){
                maxProfit += finalList.pop();
            }
        }
        System.out.println(maxProfit);
    }
}
