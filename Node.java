/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dbms;

/**
 *
 * @author Piyush
 */
public class Node {
    public int data;
    public int local_depth;
    public Node next;
    public int index;
    public void displayNodeData() {
		System.out.println("{ " + data + " } ");
	}
    
}
