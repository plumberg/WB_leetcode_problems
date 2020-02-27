class Solution {
    public double myPowRecursive(double x, int n) {
        if(n == Integer.MIN_VALUE && x > 1)
            return 0;
        if(n == 0)
            return 1;
        if(n<0){
            n = -n;
            x = 1/x;
        }
        return n%2 == 0 ? myPow(x*x, n/2) : x*myPow(x*x, n/2);
    }
    
    public double myPow(double x, int n) {
        if(n == 0) return 1;
        if(x == 1) return 1;
        if(x == -1)return n%2==0?1:-1;
        if(n<0){
            if(n==Integer.MIN_VALUE){
                n = -(n+1);
                x = 1/x;
            }else{
                n=Math.abs(n);
                x = 1/x;
            }
        }
        double y =1;
        while(n>1){
            if(n%2==0){
                x = x*x;
                n = n/2;
            }else{
                y = y*x;
                x = x*x;
                n = n-1;
                n/=2;
            }
        }
        return x*y;
    }
}