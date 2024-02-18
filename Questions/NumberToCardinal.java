import java.util.Scanner;

public class NumberToCardinal {
    private static final String[] units = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};

    private static final String[] teens = {"", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};

    private static final String[] tens = {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

    private static String convertToWords(int num) {
        if(num == 0) {
            return "Zero";
        }

        if(num < 0 || num > 50000000) {
            return "Number out of range";
        }

        String words = "";

        if(num >= 10000000) {
            words += convertToWords(num / 10000000) + " Crore ";
            num %= 10000000;
        }

        if (num >= 100000) {
            words += convertToWords(num / 100000) + " Lakh ";
            num %= 100000;
        }

        if (num >= 1000) {
            words += convertToWords(num / 1000) + " Thousand ";
            num %= 1000;
        }

        if (num >= 100) {
            words += convertToWords(num / 100) + " Hundred ";
            num %= 100;
        }

        if(num > 0) {
            if (num >= 20) {
                words += tens[num / 10] + " ";
                num %= 10;
            } else if (num >= 10) {
                if(num == 10) {
                    words += tens[1] + " ";
                } else {
                    words += teens[num - 10] + " ";
                }
                num = 0;
            }

            if (num > 0) {
                words += units[num] + " ";
            }
        }

        return words.trim();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 27049235
        System.out.print("Enter a number (up to 5 crore): ");
        int number = sc.nextInt();
        sc.close();

        String words = convertToWords(number);
        System.out.println("Cardinal Equivalent: " + words);
    }
}
