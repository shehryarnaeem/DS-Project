/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listnde;

import java.util.Arrays;

/**
 *
 * @author User
 */
public class lists1 
{
     protected Node head;
     protected Node tail ;
     public int size ;
     
     public static class Node 
     {
        protected String data;
        protected Node next;
        protected ListNode head1;
        protected ListNode tail1;
        public int sizing=0;
       /*  Constructor  */

       public Node()
       {   tail1=null;
           head1 = null;
           next = null;
           data = null;
       }    
       /*  Constructor  */

       public Node(String d,Node n)
       {
           data = d;
           next = n;
       }    

       /*  Function to set next to next Node  */

       public void setNext(Node n)
       {
           next = n;
       }    

       /*  Function to set data to current Node  */

       public void setWordrd(String d)
       {
           data = d;
       }    

       /*  Function to get next to next node  */

       public Node getNext()
       {
           return next;
       }    

       /*  Function to get data from current Node  */

       public String getData()
       {
           return data;
   }
    }
    
     public lists1()
     {
        head = null;
        tail = null;
        size = 0;
    }
    
    /*  Function to check if list is empty  */
    
    public boolean isEmpty()
    {
        return head == null;
    }
    
    /*  Function to get size of list  */
    
    public int getSize()
    {
        return size;
    }    
    
    /*  Function to insert an element at begining  */
    
    public void insertAtStart(String val)
    {
        Node newNode = new Node(val, null);    
        size++ ;    
        if(head == null) 
        {
            head = newNode;
            tail = head;
        }
        else 
        {
            newNode.setNext(head);
            head = newNode;
        }
    }
    
    /*  Function to insert an element at tail  */
    
    public void insertAtEnd(String val)
    {
        Node newNode = new Node(val,null);    
        size++ ;    
        if(head == null) 
        {
            head = newNode;
            tail = head;
        }
        else 
        {
            tail.setNext(newNode);
            tail = newNode;
        }
    }
    
    /*list node class for the next words to be stored*/
    
    public static class ListNode
    {
        ListNode next;
        
        String data;
        public ListNode()
        {
            next=null;
        }
        
    }
    
    /*function to insert a value at a position*/ 
   
    public void insertAtPos(String val , int pos)
    {
        Node newNode = new Node(val, null);                
        Node ptr = head;
        pos = pos - 1 ;
        for (int i = 1; i < size; i++) 
        {
            if (i == pos) 
            {
                Node tmp = ptr.getNext() ;
                ptr.setNext(newNode);
                newNode.setNext(tmp);
                break;
            }
            ptr = ptr.getNext();
        }
        size++ ;
    }
    
    /*  Function to delete an element at position  */
    
    public Node deleteAtPos(int pos)
    {                      Node temp1 = null;
        if (pos == 1) 
        {
            Node temp=head;
            head = head.getNext();
            size--; 
            return temp;
        }
        if (pos == size) 
        {
            Node s = head;
            Node t = head;
            while (s != tail)
            {
                t = s;
                s = s.getNext();
            }
            tail = t;
            tail.setNext(null);
            size --;
            return s;
        }
      
        Node ptr = head;
        pos = pos - 1 ;
        for (int i = 1; i < size - 1; i++) 
        {
            if (i == pos) 
            {
                Node tmp = ptr.getNext();
                tmp = tmp.getNext();
                ptr.setNext(tmp);
                break;
            }
           temp1=ptr;
            ptr = ptr.getNext();
        }
        size-- ;
   return temp1;
    }    
    
    /*  Function to display elements  */
    
    public void display()
    {
        System.out.print("Linked List is");
        System.out.println("");
        if (size == 0) 
        {
            System.out.print("empty\n");
            return;
        }    
        Node ptr=head;
        ListNode ptr1=new ListNode();
        for(int i=0;i<size;i++)
        {
            System.out.print(ptr.data);
            System.out.print("=");
            if(ptr.head1!=null)
            {
                ptr1=ptr.head1;
                while(ptr1!=null)
                {
                    System.out.print(ptr1.data+",");
                    ptr1=ptr1.next;
                }
            }
          //  System.out.println("size of associated word list is "+ptr.sizing);
            System.out.println("");
            ptr=ptr.next;
        }
    }
    
    /* function to add elements to a particular node*/
   
    public void insertAtright(String val,int pos)
    {
      
      ListNode newNode=new ListNode();
      newNode.data=val;
      Node ptr=head;
      
        for (int i = 0; i < pos-1; i++)
        {
            ptr=ptr.next;
        }
        ptr.sizing++;
        if(ptr.head1 == null) 
        {
            ptr.head1 = newNode;
            ptr.tail1 = ptr.head1;
        }
        else 
        {
            ptr.tail1.next=newNode;
            ptr.tail1 = newNode;
        }
    
    }
    
    /*function too check weather an element exists in the word list or not*/
    
    int findInlist(String str)
    {
        int i=1;
        Node ptr=head;
        while(ptr.next!=null)
        {
            if(ptr.data.equals(str))
            {
                return i;
            }
            else
            {
                i++;
                ptr=ptr.next;
            }
        }
         return -1;
    }
    
    /* function too add a particular node at a pos*/
    
    public void insertAtPosNode(Node temp , int pos)
    {
        Node newNode = temp;                
        Node ptr = head;
        pos = pos - 1 ;
        for (int i = 1; i < size; i++) 
        {
            if (i == pos) 
            {
                Node tmp = ptr.getNext() ;
                ptr.setNext(newNode);
                newNode.setNext(tmp);
                break;
            }
            ptr = ptr.getNext();
        }
        size++ ;
    } 
}
