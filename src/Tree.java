public class Tree {
    Node root;

    public Tree() {
        root = new SampleTree().getAllNodes();
    }

    public Node traverseNode(Node node, MorseSymbol symbol) {
        if (symbol == MorseSymbol.DOT) {
            return node.leftChild;
        } else {
            return node.rightChild;
        }
    }

    public String traverse(MorseSymbol[] array) {
        String out = "";
        Node runner = root;
        out += runner.getLetter();

        for (MorseSymbol symbol : array) {
            if (runner != null) {
                runner = traverseNode(runner, symbol);
                out += runner.getLetter();
            }
        }

        return out;
    }
}g
