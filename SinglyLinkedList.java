/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dbms;

import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Piyush
 */
public class SinglyLinkedList {
	private Node head;
 
	public boolean isEmpty() {
		return (head == null);
	}
	// used to insert a node at the start of linked list
	// public void insertFirst(int data) {
	// 	Node newNode = new Node();
	// 	newNode.data = data;
	// 	newNode.next = head;
	// 	head = newNode;
	// }
 
	// used to delete node from start of linked list
	public Node deleteFirst() {
		Node temp = head;
		head = head.next;
		return temp;
	}
        public void deleteLast() {
		Node temp = head;
                while(temp.next.next!=null)
                    temp = temp.next;
                temp.next = null;
                
	}
 
	// Use to delete node after particular node
	public void deleteAfter(Node after) {
		Node temp = head;
		while (temp.next != null && temp.data != after.data) {
			temp = temp.next;
		}
		if (temp.next != null)
			temp.next = temp.next.next;
	}
 
	// used to insert a node at the start of linked list
	public void insertLast(int data) {
    //    Node current = head;
        if(head == null){
            Node newNode = new Node();
            newNode.data = data;
            head = newNode;
			head.local_depth = 1;
        }
        else{
            Node current = head;
		while (current.next != null) {
			current = current.next; // we'll loop until current.next is null
		}
		Node newNode = new Node();
		newNode.data = data;
        current.next = newNode;
        }
	}
 
	// For printing Linked List
	public void printLinkedList() {
	//	System.out.println("Printing LinkedList (head --> last) ");
		Node current = head;
		while (current != null) {
			current.displayNodeData();
			current = current.next;
		}
		System.out.println();
    }
    // Size of Linked List
    public int size() {
		int c = 0;
		Node current = head;
		while (current != null) {
			c = c + 1;
			current = current.next;
		}
		return c;
    }
    public int getlocaldepth(){
		if(head!=null)
			return head.local_depth;
		else
			return 1;
	}
	public int getIndex(){
		if(head!=null)
			return head.index;
		else
			return -1;
	}
	public void setLocalDepth(int ld){
		if(head == null){
            Node newNode = new Node();
            newNode.local_depth = ld;
            head = newNode;
        }
	}
	public void setIndex(int i){
		if(head == null){
            Node newNode = new Node();
            newNode.index = i;
            head = newNode;
		}
		else{
			head.index = i;
		}
	}
	public String search(int val){
		if(head==null)
			return "NOT FOUND";
		else{
			Node current = head;
			while(current!=null){
				if(current.data==val)
					return "FOUND";
				current = current.next;
			}
			return "NOT FOUND";
		}
	}
	public int getHead(){
		if(head!=null)
			return head.data;
		else	
			return -1;
	}
        
        public int at(int index){
            if(index>=size())
                return -1;
            else{
                Node current = head;
                int counter = 0;
                while(current!=null&&counter!=index){
                    counter++;
                    current = current.next;
                }
                return current.data;
            }
                
        }
	public void split(SinglyLinkedList sll1, SinglyLinkedList sll2, int first_index, int second_index, int global_depth,HashMap<SinglyLinkedList,Integer> index_track,HashMap<SinglyLinkedList,Integer> LocalDepth_track){

		// sll1.setIndex(first_index);
		// sll2.setIndex(second_index);
		// sll1.head.index = first_index;
		// sll2.head.index = second_index;
		Node current = head;
               
                index_track.put(sll1, first_index);
                index_track.put(sll2, second_index);
		while(current!=null){
			if(getLastBits(hashfunction(current.data),global_depth)==first_index){
				sll1.insertLast(current.data);
				 sll1.setIndex(first_index);
			}
			else{
				sll2.insertLast(current.data);
				sll2.setIndex(second_index);
			}
			current = current.next;
		}
                sll1.printLinkedList();
                sll2.printLinkedList();
                if(!sll1.isEmpty())
                    sll1.head.local_depth = this.head.local_depth+1;
//                System.out.println(sll1.getIndex()+"/////");
//                System.out.println("dddd");
                if(!sll2.isEmpty())
                    sll2.head.local_depth = this.head.local_depth+1;
 //               System.out.println(sll2.getIndex()+">>>>>>");
            //    LocalDepth_track.put(sll1, LocalDepth_track.get(S))
                
	}
//            int getLocalDepthBF(SinglyLinkedList sll,List<SinglyLinkedList> Directory){
//        int pointer = 0;
//        for(int i = 0; i < Directory.size(); i++){
//            if(Directory.get(i)==sll)
//                pointer++;
//        }
//        int ans = (int)(Math.log(Directory.size()/pointer) / Math.log(2));
//        return ans;
//    }
	static int getLastBits(int num,int d){        
            int number=(int)(Math.pow(2.00000,d)); 
            number--;
            return num&number;     // bitwise and 
	}
        int hashfunction(int val){
            return val%10;
         //   return val;
        }
    
}
