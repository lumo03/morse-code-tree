public enum MorseSymbol {
    DOT("."), HYPHEN("-");

    String symbol;

    MorseSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }
}