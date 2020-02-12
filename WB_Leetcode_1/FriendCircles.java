class Solution {
    public int findCircleNum(int[][] M) {
      int r = M.length;
      int c = M[0].length; 
        if(r == 0) return r;
        
        UnionFind uf = new UnionFind(r*c);
        uf.setCounter(r);
        
      for(int i=0;i<r;i++){
          for(int j=0;j<c;j++){
              if(M[i][j]==1 &&i!=j){
                  uf.unionFind(i,j);
              }
          }
      }
        return uf.getCounter();
    }
}

class UnionFind{
    private int [] friends;
    private int counter;
    
    public UnionFind(int n){
        friends = new int [n];
        for(int i=0;i<friends.length;i++){
            friends[i]=i;
        }
    }
    
    public int find(int n){
        if(friends[n] == n) return n;
        return friends[n] = find(friends[n]);
    }
    
    public void unionFind(int num1, int num2){
        int group1 = find(num1);
        int group2 = find(num2);
        
        if(group1!=group2){
            friends[group1]=group2;
            counter--;
        }
    }
    
    public void setCounter(int counter){
        this.counter=counter;
    }
    
    public int getCounter(){
        return counter;
    }
}