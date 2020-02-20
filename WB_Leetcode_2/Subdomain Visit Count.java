class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        HashMap<String, Integer> map = new HashMap<>();
        
        for(String domain:cpdomains){
            String [] domains = domain.split(" "); // split amount and domain
            int number = Integer.parseInt(domains[0]); //retrieve the amount
            String [] subDomain = domains[1].split("\\."); //separate domain by dot
            String st = "";
            
            //Start from the last subdomain (for example, "com")
            for(int i = subDomain.length-1;i>=0;i--){
                st = subDomain[i]+st; //add new subdomain to the left, before the previous
                if(map.containsKey(st)) map.put(st,map.get(st)+number);
                else map.put(st, number);
                st = "."+st; //add dot before the last subdomain
            }
        }
        
        ArrayList<String>list = new ArrayList<>();
        for(Map.Entry<String, Integer>entry:map.entrySet()){
            list.add(entry.getValue() + " " + entry.getKey());
        }
        
        return list;
    }
}