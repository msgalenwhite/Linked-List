package com.launchacademy.linkedlist;

public class LinkedList {
  @SuppressWarnings("unused")
  private Node head;

  LinkedList(Node head) {
    this.head = head;
  }
  
  public String toString() {
    String sentence = "";
    Node node = head;
    while(node != null) {
      sentence += node.getWord() + " ";
      node = node.next;
    }
    return sentence.trim();
  }
  
  public void appendNode(Node nodeToAppend) {
    //Add node to the end of the list
	  
	Node node = head;
	while (node.next != null) {
	  node = node.next;
	}
	node.next = nodeToAppend;
  }
  
  public void insertAfter(Node prevNode, Node newNode) {
    //Insert newNode into the LinkedList after prevNode

	Node oldNext = prevNode.next;
	prevNode.next = newNode;
	newNode.next = oldNext;
  }
  
  public Node deleteNode(Node nodeToDelete) {
    //Remove nodeToDelete from the LinkedList
    //nullify its next reference
    //Note: be sure to handle what happens if we delete the head
	  
	if (head == nodeToDelete) {
	  return deleteHead();
	}
	
	Node node = head.next;
	Node nodeToSave = head;
	
	while (node != nodeToDelete) {
	  nodeToSave = node;
	  node = node.next;
	}

	nodeToSave.next = nodeToDelete.next;
	nodeToDelete.next = null;
	return nodeToDelete;
  }
  
  public void pushNode(Node nodeToPush) {
    //Make nodeToPush the head
    //Move the old head
	nodeToPush.next = head;
	head = nodeToPush;
  }
  
  public int length() {
    //return the length of the linked list
	  
	// if there is only 1 node, we will never enter the while loop
	// so length had to be initialized at one
	  
	int length = 1;
	Node node = head;
	
	while (node.next != null) {
	  length += 1;
	  node = node.next;
	}

    return length;
  }
  
  //Extra credit:
  public void deleteWordsStartingWith(char letter) {
    //eliminate all words starting with the specified letter


  }
  
  public void makeUnique() {
    //eliminate all duplicate words in the list
	
  }
  
  private Node deleteHead() {
	Node newHead = head.next;
	Node nodeToDelete = head;
	
	head = newHead;
	nodeToDelete.next = null;
	return nodeToDelete;
  }
}
