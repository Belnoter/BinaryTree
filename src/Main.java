import java.util.Stack;

class Node{

    int data;
    Node left;
    Node right;

    Node(int data){
        this.data = data;
    }

}




public class Main {

    public static void iterativeBts(Node node){
        if(node == null)
            return;

        Stack<Node> stack = new Stack<>();
        stack.push(node);
        while(!stack.isEmpty()){
            Node temp = stack.pop();
            System.out.println(temp.data);

            if(temp.right != null)
                stack.push(temp.right);

            if(temp.left!=null)
                stack.push(temp.left);


        }

    }

    public static void iterativeInOrder(Node node){

        if(node == null)
            return;

        Stack<Node> stack = new Stack<>();
        Node temp = node;

        while(!stack.isEmpty() || temp !=null){
            if(temp != null){
                stack.push(temp);
                temp = temp.left;

            }else{
                temp = stack.pop();
                System.out.println(temp.data);
                temp = temp.right;
            }



        }



    }

    public static void inOrderBts(Node node){

        if(node == null)
            return;

        inOrderBts(node.left);
        System.out.println(node.data);
        inOrderBts(node.right);




    }
    public static void bts(Node node, Node nodeTwo){
        if(node == null)
            return;

        if(nodeTwo == null){
            System.out.println("Trees don't have the same structure");
            return;
        }



       if(node.data != nodeTwo.data)
           System.out.println("Trees not equal");

        bts(node.left,nodeTwo.left);
        bts(node.right,nodeTwo.right);

    }
    public static void main(String[] args) {

        Node root = new Node(2);
        Node second = new Node(6);
        Node third = new Node(3);
        Node fourth = new Node(1);
        Node fifth = new Node(2);
        Node sixth = new Node(6);
        Node seventh = new Node(6);
        root.left = second;
        root.right = third;
        second.left = fourth;
        second.right = fifth;
        third.left = sixth;
       third.right = seventh;

        Node rootTwo = new Node(2);
        Node secondTwo = new Node(6);
        Node thirdTwo = new Node(3);
        Node fourthTwo = new Node(1);
        Node fifthTwo = new Node(2);
        Node sixthTwo = new Node(6);
        Node seventhTwo = new Node(7);

        rootTwo.left = secondTwo;
        rootTwo.right = thirdTwo;
        secondTwo.left = fourthTwo;
        secondTwo.right = fifthTwo;
        thirdTwo.left = sixthTwo;
        thirdTwo.right = seventhTwo;


      iterativeBts(root);
       // bts(root,rootTwo);
       //inOrderBts(root);
       //iterativeInOrder(root);

    }
}