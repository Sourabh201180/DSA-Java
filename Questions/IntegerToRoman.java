public class IntegerToRoman {
    // O(N)
    public String intToRomanSubtraction(int num) {
        String roman = "";

        String[] notations = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        for(int i=0; num>0; i++) {
            while(num >= values[i]) {
                roman += notations[i];
                num -= values[i];
            }
        }

        return roman;
    }

    // O(1)
    public String intToRomanDivision(int num) {
        String[] thousands = {"", "M", "MM", "MMM"};
        String[] hundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] units = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

        return thousands[num/1000] + hundreds[(num%1000)/100] + tens[(num%100)/10] + units[num%10];
    }

    public static void main(String[] args) {
        IntegerToRoman iTR = new IntegerToRoman();

        int n = 2856;
        System.out.println(iTR.intToRomanSubtraction(n));
        System.out.println(iTR.intToRomanDivision(n));
    }   
}