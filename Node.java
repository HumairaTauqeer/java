 
 public class Node{
    double value; // a field to hold the value of sub-expression
    Node Next; // a variable to point to the next field
    
    
    public Node(double value){
        this.value=value;
        this.Next = null;
    }
}