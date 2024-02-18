/* 
    1108. Defanging an IP Address

    Input: address = "1.1.1.1"
    Output: "1[.]1[.]1[.]1"

    Input: address = "255.100.50.0"
    Output: "255[.]100[.]50[.]0"
*/

class Solution {
    public static void main(String[] args) {
        Solution s = new Solution();

        String address = "1.1.1.1";
        System.out.println(s.defangIPaddr(address));
    }

    public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
}