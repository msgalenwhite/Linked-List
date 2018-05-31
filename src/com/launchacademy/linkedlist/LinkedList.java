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
  }
  
  public void insertAfter(Node prevNode, Node newNode) {
    //Insert newNode into the LinkedList after prevNode
  }
  
  public Node deleteNode(Node nodeToDelete) {
    //Remove nodeToDelete from the LinkedList
    //nullify its next reference
    //Note: be sure to handle what happens if we delete the head
  }
  
  public void pushNode(Node nodeToPush) {
    //Make nodeToPush the head
    //Move the old head
  }
  
  public int length() {
    //return the length of the linked list
    return 0;
  }
  
  //Extra credit:
  public void deleteWordsStartingWith(char letter) {
    //eliminate all words starting with the specified letter
  }
  
  public void makeUnique() {
    //eliminate all duplicate words in the list
  }
}
