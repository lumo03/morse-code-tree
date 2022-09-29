import java.util.Scanner;

public class Utils {
    static Scanner scanner = new Scanner(System.in);
    public static MorseSymbol[] convertStringToMorseSymbols(String input) {
        MorseSymbol[] out = new MorseSymbol[input.length()];

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == MorseSymbol.DOT.getSymbol()) {
                out[i] = MorseSymbol.DOT;
            } else {
                out[i] = MorseSymbol.HYPHEN;
            }
         }

        return out;
    }

    public static boolean inputIsValid(String input) {
        for (char c : input.toCharArray()) {
            if (c != '.' && c != '-') {
                return false;
            }
        }
        return true;
    }

    public static String getInput() {
        String input = "";
        boolean isValid = false;

        while(isValid == false) {
            System.out.println("Gib den Morsecode eines Buchstabens ein.");
            System.out.println("Der Morsecode darf nur aus '.' und '-' bestehen (max. 4 Zeichen)!");
            String in = scanner.nextLine();
            input = in.length() <= 4 ? in : in.substring(0, 4);
            isValid = inputIsValid(input);
        }

        return input;
    }
}
