package com.list;
import java.util.Arrays;

public class ExecuteList {

    public static void main(String[]args){

        Linkedlist list = new Linkedlist();
        
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addFirst(5);
        list.addFirst(3);
        
//        list.addFirst(2);
//        System.out.println(list.size());
 //       System.out.println(list);
  //      System.out.println(list.indexOf(20));
   //     System.out.println(list.contains(30));
    //    list.removeFirst();
     //   System.out.println(list);
      //  list.removeLast();
       // System.out.println(list);
        //list.isEmpty();
          //System.out.println(list.isEmpty());
          /**
          list.removeFirst();
          list.removeLast();
          list.removeFirst();
          **/
          System.out.println(list.size());
          System.out.println(list.contains(30));

          System.out.println(Arrays.toString(list.toArray()));
//        Linkedlist.Node current = list.reverse();
 //         System.out.println(current.getData());//valid

/**
          while(current !=null){
              System.out.print(current.getData()+" ");
              current = current.getNext();
          }
          System.out.println();
**/

/*
        System.out.println(list.toString());
          System.out.println(list.getKthFromLast(2));

*/
    
    //find middle element.
    System.out.println(list.middle());
    }
}
