class Solution {
    public int hammingDistance(int x, int y) {
    //    int bits = x^y;
     //   return Integer.bitCount(bits);
    int counter =0;
    int mod1=0, mod2 =0;
    while(x!=0||y!=0){
        mod1=x%2;
        mod2=y%2;
        if(mod1!=mod2) counter++;
        
        x/=2;
        y/=2;
    }
        return counter;
    }
}