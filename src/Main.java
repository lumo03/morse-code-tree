public class Main {
    Tree tree;

    public Main() {
       tree = new Tree();

       System.out.printf("Willkommen beim Baum-Morsecode-Dekodierer!%n%n");

       String input = Utils.getInput();
       MorseSymbol[] code = Utils.convertStringToMorseSymbols(input);
       char letter = tree.traverse(code);

       System.out.println("Der gesuchte Buchstabe für den Morsecode \""+input+"\" ist '"+letter+"'.");

        System.out.printf("%nBis zum nächsten mal!");
    }

    public static void main(String[] args) {
        new Main();
    }
}
