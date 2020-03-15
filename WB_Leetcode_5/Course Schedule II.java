class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        HashMap<Integer, List<Integer>>map = new HashMap<>();
        int [] needCourses = new int[numCourses];
        for(int []pre: prerequisites){
            int course = pre[0];
            int precourse = pre[1];
            needCourses[precourse]++;
            if(!map.containsKey(course)){
                map.put(course, new ArrayList<Integer>() );
            }
            map.get(course).add(precourse); // add precourse to the course. Because it's a hashmap, one course(key) can have                                              //few precourses (values)
        }
        
        Queue<Integer>q = new LinkedList<>();
        for(int i=0;i<needCourses.length;i++){
            if(needCourses[i]==0){ // add the ones that don't need precourses
                q.add(i);
            }
        }
        ArrayList<Integer>list = new ArrayList<>();
        while(!q.isEmpty()){
            int course = q.remove();
          //  System.out.println("course in queue"+ course);
            list.add(course);
            if(map.containsKey(course)) {
                for (int neigh : map.get(course)) {
                 //   System.out.println("Neightbor of the course int hashmap: "+ neigh);
                    if (--needCourses[neigh] == 0) {
                        q.add(neigh);
                    }
                }
            }
        }
        
        
        Collections.reverse(list);
        return list.size()==numCourses?list.stream().mapToInt(i->i).toArray():new int[] {};
        
        
        
    }
}