package tree;
// import java.util.LinkedList;
// import java.util.Queue;
public class BinarySearchTree
{
    Node root;
    Node insertNode(Node root, int data)
    {
        if(root==null)
        {
            root=new Node(data);
            return root;
        }
        if(data<root.data)
        {
            root.left=insertNode(root.left,data);
        }
        else
        {
            root.right=insertNode(root.right, data);
        }
        return root;
    }
    Node searchValue(Node root, int val)
    {
        if(root==null || root.data==val)
        {
            return root;
        }
        if(val<root.data)
        {
            return searchValue(root.left, val);
        }
        else
        {
            return searchValue(root.right, val);
        }
    }

    // void preOrder(Node root)
    // {
    //     if(root==null)
    //     {
    //         return;
    //     }
    //     System.out.print(root.data+" ");
    //     preOrder(root.left);
    //     preOrder(root.right);
    // }
    // void inOrder(Node root)
    // {
    //     if(root==null)
    //     {
    //         return;
    //     }
    //     inOrder(root.left);
    //     System.out.print(root.data+" ");
    //     inOrder(root.right);
    // }
    // void postOrder(Node root)
    // {
    //     if(root==null)
    //     {
    //         return;
    //     }
    //     postOrder(root.left);
    //     postOrder(root.right);
    //     System.out.print(root.data+" ");
    // }

    // void levelOrder(Node root)
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
}