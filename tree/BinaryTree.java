package tree;

// import java.util.LinkedList;
// import java.util.Queue;

public class BinaryTree
{
    Node root;
    static void preOrder(Node root)
    {
        if(root==null)
        {
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    static void inOrder(Node root)
    {
        if(root==null)
        {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    static void postOrder(Node root)
    {
        if(root==null)
        {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }

    // static void levelOrder(Node root)
    // {
    //     if(root==null)
    //     {
    //         return;
    //     }
    //     Queue<Node> queue =new LinkedList<>();
    //     queue.offer(root);
    //     while(!queue.isEmpty())
    //     {
    //         Node temp=queue.poll();
    //         System.out.print(temp.data+" ");
    //         if(temp.left!=null)
    //         {
    //             queue.offer(temp.left);
    //         }
    //         if(temp.right!=null)
    //         {
    //             queue.offer(temp.right);
    //         }
    //     }
    // }
    // static void maxValue(Node root)
    // {
    //     int max=0;
    //     if(root==null)
    //     {
    //         return;
    //     }
    //     Queue<Node> queue =new LinkedList<>();
    //     queue.offer(root);
    //     while(!queue.isEmpty())
    //     {
    //         Node temp=queue.poll();
    //         max=Math.max(max,temp.data);
    //         if(temp.left!=null)
    //         {
    //             queue.offer(temp.left);
    //         }
    //         if(temp.right!=null)
    //         {
    //             queue.offer(temp.right);
    //         }
    //     }
    //     System.out.println(max);
    // }

    static int maxValue(Node root)
    {
        if(root==null)
        {
            return Integer.MIN_VALUE;
        }
        int result=root.data;
        int left=maxValue(root.left);
        int right=maxValue(root.right);
        if(left>result)
        {
            result=left;
        }
        if(right>result)
        {
            result=right;
        }
        return result;
    }
    // static void minValue(Node root)
    // {
    //     int min=Integer.MAX_VALUE;
    //     if(root==null)
    //     {
    //         return;
    //     }
    //     Queue<Node> queue =new LinkedList<>();
    //     queue.offer(root);
    //     while(!queue.isEmpty())
    //     {
    //         Node temp=queue.poll();
    //         min=Math.min(min,temp.data);
    //         if(temp.left!=null)
    //         {
    //             queue.offer(temp.left);
    //         }
    //         if(temp.right!=null)
    //         {
    //             queue.offer(temp.right);
    //         }
    //     }
    //     System.out.print(min);
    // }
    static int minValue(Node root)
    {
        if(root==null)
        {
            return Integer.MAX_VALUE;
        }
        int result=root.data;
        int left=minValue(root.left);
        int right=minValue(root.right);
        if(left<result)
        {
            result=left;
        }
        if(right<result)
        {
            result=right;
        }
        return result;
    }

    static int treeSum(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        return root.data + treeSum(root.left) + treeSum(root.right);
    }

    static int diffEvenOddLevel(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        return root.data - diffEvenOddLevel(root.left) - diffEvenOddLevel(root.right);
    }

    static int totalNodes(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        return 1 + totalNodes(root.left) + totalNodes(root.right);
    }

    static int totalLeafNodes(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        if(root.left==null && root.right==null)
        {
            return 1;
        }
        return totalLeafNodes(root.left) + totalLeafNodes(root.right);
    }

    static int height(Node root)
    {
        if(root==null)
        {
            return -1 ;
        }
        return Math.max(height(root.left), height(root.right))+1;
    }

    static void printLevel(Node root, int level)
    {
        if(root==null)
        {
            return;
        }
        if(level==1)
        {
            System.out.print(root.data+" ");
            return;
        }
        printLevel(root.left, level-1);
        printLevel(root.right, level-1);
    }

    static void levelOrder(Node root)
    {
        if(root==null)
        {
            return;
        }
        int height=height(root);
        for(int i=0;i<=height;i++)
        {
            printLevel(root, i+1);
        }
    }

    static Node insertLevelOrder(int[] arr, Node root, int i)
    { 
        // Base case for recursion
        if (i < arr.length)
        {
            Node temp = new Node(arr[i]);
            root = temp;
 
            // insert left child
            root.left = insertLevelOrder(arr, root.left,
                                             2 * i + 1);
 
            // insert right child
            root.right = insertLevelOrder(arr, root.right,
                                               2 * i + 2);
        }
        return root;
    }
}
