public class Main {
    Tree tree;

    public Main() {
       tree = new Tree();

       String input = Utils.getInput();
       MorseSymbol[] code = Utils.convertStringToMorseSymbols(input);
       char letter = tree.traverse(code);

       System.out.println("Der gesuchte Buchstabe für den Morsecode \""+input+"\" ist '"+letter+"'.");
    }

    public static void main(String[] args) {
        new Main();
    }
}
