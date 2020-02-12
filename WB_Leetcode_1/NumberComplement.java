class Solution {
    public int findComplement(int num) {
        int out = 0;
        int pow = 1;
        while(num>0){
            out += (num%2 ^1) * pow;
            pow <<=1;
            num >>=1;
        }
        return out;
        
     /*   if(num==1)return 0;
        if(num==0)return 1;
        String s = Integer.toBinaryString(num);
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                sb.append("0");
            }else sb.append("1");
        }
        return Integer.parseInt(sb.toString(),2);*/
    }
}