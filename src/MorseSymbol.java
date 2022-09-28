public enum MorseSymbol {
    DOT('.'), HYPHEN('-');

    char symbol;

    MorseSymbol(char symbol) {
        this.symbol = symbol;
    }

    public char getSymbol() {
        return symbol;
    }
}