import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        //write your code here
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word or phrase to check: ");
        String whip = scan.nextLine();
        whip = punc(whip);

        String imlazy = "";
        for (int i = whip.length()-1; i>=0; i--) {
            String blargh = whip.substring(i, i+1);
            imlazy = imlazy + blargh;
        }

        if (whip.equalsIgnoreCase(imlazy)) {
            System.out.println("ISSA PALINDROME");


        }
        else System.out.println("not a palindrome. Hit or miss?? looks like you missed");

    }

        public static String punc(String whip) {
            String naenae = "";
            for (int i = 0; i < whip.length(); i++) {
                if ((whip.charAt(i) == ';')||(whip.charAt(i) == '?')||(whip.charAt(i) == ',')||(whip.charAt(i) == '.')||(whip.charAt(i) == '!')||(whip.charAt(i) == ':')||(whip.charAt(i) == ' ')){
                    naenae = naenae;
                }
                else naenae += whip.charAt(i);
            }
            return naenae;
    }
}
