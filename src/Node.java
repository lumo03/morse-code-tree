public class Node {
    Node leftChild, rightChild;
    char letter;

    public Node(char letter) {
        leftChild = null;
        rightChild = null;
        this.letter = letter;
    }

    public Node(char letter, Node leftChild, Node rightChild) {
        this.leftChild = leftChild;
        this.rightChild = rightChild;
        this.letter = letter;
    }

    public char getLetter() {
        return letter;
    }

    public void setLeftChild(Node node) {
        leftChild = node;
    }

    public void setRightChild(Node node) {
        rightChild = node;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }
}
