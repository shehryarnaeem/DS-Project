/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds.ui;

/**
 *
 * @author User
 */
public class question<E> {
        protected Node head;
        protected Node tail ;
       private int sizeer=0;
      public static class Node <E>{
    protected E data;
    protected Node next;
 
    /*  Constructor  */
    public Node()
    {
        next = null;
        
    }    
    /*  Constructor  */
    public Node(E d,Node n)
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
    public void setData(E d)
    {
        data = d;
    }    
    /*  Function to get next to next node  */
    public Node getNext()
    {
        return next;
    }    
    /*  Function to get data from current Node  */
    public E getData()
    {
        return data;
}
}
  public void enqueue(E d)
  {     sizeer++;
      Node newNode=new Node(d,null);
      if(head==null)
      {
          head = newNode;
          tail=head;
      }
      else
      {
          tail.setNext(newNode);
          tail=newNode;
      }
      
  }
  public E dequeue()
  {
      E ret=(E)head.data;
      head=head.getNext();
      sizeer--;
      return ret;

  }
  void display()
  {if (sizeer>1){
      Node ptr=head;
      System.out.print("queue is = {"+ptr.data+",");
      ptr=ptr.getNext();
      
      while(ptr.getNext()!=null)
      {
          System.out.print(ptr.data+",");
          ptr=ptr.getNext();
      }
       System.out.println(ptr.data+"}");
  }
  else System.out.println(head.data);
  }
Boolean isEmpty(){
         return sizeer==0;
}
E peek(){
    if(!isEmpty())
    return(E) head.data;
    else {
        System.out.println("q is empty");
        return null;
    }
    }
int size(){
    return sizeer;
}
}
