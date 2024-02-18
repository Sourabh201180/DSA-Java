// Check if the Sentence Is Pangram

class A {
    public static void main(String[] args) {
        // String str = "thequickbrownfoxjumpsoverthelazydog";
        // String str = "golubholuweregoodfriends";
        // String str = "abcdefghijklmnopqrstuvwxyz";
        String str = "arunpanwar";
        String abc = "abcdefghijklmnopqrstuvwxyz";

        System.out.println(checkPangram(str, abc));
    }

    public static boolean checkPangram(String str, String abc) {
        boolean flag = false;
        char[] arr1 = str.toCharArray();
        char[] arr2 = abc.toCharArray();
        int count = 0;

        for(int i=0; i<arr2.length; i++) {
            for(int j=0; j<arr1.length; j++) {
                if(arr2[i] == arr1[j]) {
                    System.out.println(arr1[j]);
                    count++;
                    break;
                }
            }
        }

        if(count == 26) {
            flag = true;
        }
        
        System.out.println(count);
        return flag;
    } 
}