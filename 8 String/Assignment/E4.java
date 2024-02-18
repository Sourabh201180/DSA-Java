/*
    1773. Count Items Matching a Rule

    Input: items = [["phone","blue","pixel"],["computer","silver","lenovo"],["phone","gold","iphone"]], ruleKey = "color", ruleValue = "silver"
    Output: 1
    Explanation: There is only one item matching the given rule, which is ["computer","silver","lenovo"].


    Input: items = [["phone","blue","pixel"],["computer","silver","phone"],["phone","gold","iphone"]], ruleKey = "type", ruleValue = "phone"
    Output: 2
    Explanation: There are only two items matching the given rule, which are ["phone","blue","pixel"] and ["phone","gold","iphone"]. Note that the item ["computer","silver","phone"] does not match.
*/

import java.util.ArrayList;
import java.util.List;

class Solution {
    public static void main(String[] args) {
        Solution s = new Solution();

        List<List<String>> alist = new ArrayList<>();
        // alist.add("phone", "blue", "pixel");
        // // ArraysList items = [["phone","blue","pixel"],["computer","silver","lenovo"],["phone","gold","iphone"]];
        
        String ruleKey = "color";
        String ruleValue = "silver";

        System.out.println(s.countMatches(alist, ruleKey, ruleValue));
    }

    public int countMatches(List<List<String>> alist, String ruleKey, String ruleValue) {
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