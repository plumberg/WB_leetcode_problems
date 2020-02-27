class Solution {
   public boolean lemonadeChange(int[] bills) {
        if(bills.length == 1) return false;
        int five =0;
        int tens =0;
        for(int i=0;i<bills.length;i++) {
        	if(bills[i]==5) five++;
            else if (bills[i] == 10){
                if(five>0){
                    five--;
                    tens++;
                }
                else return false;
            }else if(bills[i] == 20){
                if(five>0 && tens>0){
                    five--;
                    tens--;
                }
                else if(five >2){
                    five -=3;    
                }else return false;
            }
        }
        return true;
    }

}