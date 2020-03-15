class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int [] coursesNeeded = new int [numCourses];
        HashMap<Integer, List<Integer>>map = new HashMap<>();
        for(int[] pre : prerequisites){
            int course = pre[0];
            int precourse = pre[1];
            coursesNeeded[precourse]++;
            if(!map.containsKey(course)){
                map.put(course, new ArrayList<Integer>());
            }
               map.get(course).add(precourse);
        }
                      
        
        Queue<Integer>classes = new LinkedList<>();
        for(int i=0;i<coursesNeeded.length;i++){
            if(coursesNeeded[i]==0){
                classes.add(i);
            }
        }
        
        int counter=0;
        while(!classes.isEmpty() ){
            int courseToComplete = classes.remove();
            if(map.containsKey(courseToComplete)){
                for(int thisCourseReq : map.get(courseToComplete)){
                    if(--coursesNeeded[thisCourseReq] == 0){
                        classes.add(thisCourseReq);
                    }
                }
            }
            counter++;
        }
        return counter == numCourses;
    }
}