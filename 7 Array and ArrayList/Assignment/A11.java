// Count Items Matching a Rule

import java.util.ArrayList;

class A {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> alist = new ArrayList<>();

        ArrayList<String> a1 = new ArrayList<>();
        a1.add("phone");
        a1.add("blue");
        a1.add("pixel");
        alist.add(a1);

        ArrayList<String> a2 = new ArrayList<>();
        a2.add("computer");
        a2.add("silver");
        a2.add("lenovo");
        alist.add(a2);

        ArrayList<String> a3 = new ArrayList<>();
        a3.add("phone");
        a3.add("gold");
        a3.add("iphone");
        alist.add(a3);

        String ruleKey = "color";
        // String ruleValue = "silver";
        String ruleValue = "purple";

        System.out.println(countMatches(alist, ruleKey, ruleValue));
    }

    public static int countMatches(ArrayList<ArrayList<String>> alist, String ruleKey, String ruleValue) {
        int count = 0;

        for(int i=0; i<alist.size(); i++) {
            if(ruleKey.equals("type") && alist.get(i).get(0).equals(ruleValue)) 
                count++;
            if(ruleKey.equals("color") && alist.get(i).get(1).equals(ruleValue)) 
                count++;
            if(ruleKey.equals("name") && alist.get(i).get(2).equals(ruleValue)) 
                count++;            
        }

        return count;
    }
}