public class SampleTree {
    Node root;

    public SampleTree() {
        root = new Node(
                ' ',
                new Node(
                        'E',
                        new Node(
                                'I',
                                new Node(
                                        'S',
                                        new Node('H'),
                                        new Node('V')
                                ),
                                new Node(
                                        'U',
                                        new Node('F'),
                                        null
                                )
                        ),
                        new Node(
                                'A',
                                new Node(
                                        'R',
                                        new Node('L'),
                                        null
                                ),
                                new Node(
                                        'W',
                                        new Node('P'),
                                        new Node('J')
                                )
                        )
                ),
                new Node(
                        'T',
                        new Node(
                                'N',
                                new Node(
                                        'D',
                                        new Node('B'),
                                        new Node('X')
                                ),
                                new Node(
                                        'K',
                                        new Node('C'),
                                        new Node('Y')
                                )
                        ),
                        new Node(
                                'M',
                                new Node(
                                        'G',
                                        new Node('Z'),
                                        new Node('Q')
                                ),
                                new Node('O')
                        )
                )
        );
    }

    public Node getAllNodes() {
        return root;
    }
}
