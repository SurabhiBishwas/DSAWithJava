package tree;

public class Main 
{
    public static void main(String[] args)
    {
        BinaryTree tree1 = new BinaryTree();
        // tree1.root=new Node(2);
        // tree1.root.left=new Node(3);
        // tree1.root.right=new Node(7);
        // tree1.root.left.left=new Node(9);
        // tree1.root.left.right=new Node(5);
        tree1.root=new Node(1);
        Node tree1Root=tree1.root;
        Node second=new Node(2);
        Node third=new Node(3);
        Node fourth=new Node(4);
        Node fifth=new Node(6);
        Node sixth=new Node(7);
        tree1Root.left=second;
        tree1Root.right=third;
        second.left=fourth;
        second.right=fifth;
        third.left=sixth;

        System.out.print("PreOrder is : " );
        BinaryTree.preOrder(tree1Root);
        System.out.println();

        System.out.print("InOrder is : " );
        BinaryTree.inOrder(tree1Root);
        System.out.println();

        System.out.print("PostOrder is : " );
        BinaryTree.postOrder(tree1Root);
        System.out.println();

        System.out.print("LevelOrder is : " );
        BinaryTree.levelOrder(tree1Root);
        System.out.println();

        System.out.print("Maximum element is : " );
        System.out.println(BinaryTree.maxValue(tree1Root));

        System.out.print("Minimum element is : " );
        System.out.println(BinaryTree.minValue(tree1Root));

        BinarySearchTree bst=new BinarySearchTree();
        bst.root=new Node(8);
        Node bstRoot=bst.root;
        bst.insertNode(bstRoot, 5);
        bst.insertNode(bstRoot, 18);
        bst.insertNode(bstRoot, 25);
        bst.insertNode(bstRoot, 16);
        bst.insertNode(bstRoot, 6);
        bst.insertNode(bstRoot, 3);
        bst.insertNode(bstRoot, 9);

        System.out.print("PreOrder for bst is : " );
        BinaryTree.preOrder(bstRoot);
        System.out.println();

        System.out.print("InOrder is : " );
        BinaryTree.inOrder(bstRoot);
        System.out.println();

        System.out.print("PostOrder is : " );
        BinaryTree.postOrder(bstRoot);
        System.out.println();

        System.out.print("LevelOrder is : " );
        BinaryTree.levelOrder(bstRoot);
        System.out.println();

        System.out.print("Maximum element is : " );
        System.out.println(BinaryTree.maxValue(bstRoot));

        System.out.print("Minimum element is : " );
        System.out.println(BinaryTree.minValue(bstRoot));

        System.out.println("sum is "+BinaryTree.treeSum(tree1Root));
        System.out.println("diff is "+BinaryTree.diffEvenOddLevel(tree1Root));
        System.out.println("Total nodes are "+BinaryTree.totalNodes(tree1Root));
        System.out.println("Total leaf nodes are "+BinaryTree.totalLeafNodes(tree1Root));
        System.out.println("Height is "+BinaryTree.height(tree1Root));
        BinaryTree.printLevel(tree1Root, 4);

        BinaryTree tree= new BinaryTree();
        int[] arr= {-1,0,0,1,2,2};
        tree.root=new Node(arr[0]);
        Node treeRoot=tree.root;
        Node newRoot=BinaryTree.insertLevelOrder(arr, treeRoot,0);
        BinaryTree.levelOrder(newRoot);
    }
}