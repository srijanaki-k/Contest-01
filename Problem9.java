
/*node class of the linked list
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}*/

class Solution
{
    public static int count(Node head, int key)
    {
        //code 
        if(head==null)
        return 0;
        Node temp = head;
        int count = 0;
        while(temp!=null){
            if(temp.data==key) count++;
            temp = temp.next;
        }
        return count;
        
    }
}
