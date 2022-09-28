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

    public char traverse(MorseSymbol[] array) {
        Node runner = root;

        for (MorseSymbol symbol : array) {
            runner = traverseNode(runner, symbol);
        }

        return runner.getLetter();
    }
}
