import static org.junit.jupiter.api.Assertions.*;

class TreeTest {

    @org.junit.jupiter.api.Test
    void traverseNode() {
        Tree t = new Tree();
        Node n = t.traverseNode(t.root, MorseSymbol.DOT);
        assertEquals('E', n.getLetter());
    }

    @org.junit.jupiter.api.Test
    void traverse1() {
        Tree t = new Tree();
        MorseSymbol[] symb = new MorseSymbol[]{MorseSymbol.DOT, MorseSymbol.HYPHEN, MorseSymbol.DOT};
        assertEquals('R', t.traverse(symb));
    }

    @org.junit.jupiter.api.Test
    void traverse2() {
        Tree t = new Tree();
        MorseSymbol[] symb = new MorseSymbol[]{MorseSymbol.HYPHEN, MorseSymbol.DOT, MorseSymbol.HYPHEN, MorseSymbol.DOT};
        assertEquals('C', t.traverse(symb));
    }

    @org.junit.jupiter.api.Test
    void traverse3() {
        Tree t = new Tree();
        MorseSymbol[] symb = new MorseSymbol[]{MorseSymbol.HYPHEN};
        assertEquals('T', t.traverse(symb));
    }
}