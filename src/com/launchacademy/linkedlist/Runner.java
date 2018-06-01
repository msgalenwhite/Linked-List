package com.launchacademy.linkedlist;

public class Runner {

  public static void main(String[] args) {
    Node theNode = new Node("The");
    Node orangeNode = new Node("Orange");
    Node catNode = new Node("Cat");
    
    LinkedList sentence = new LinkedList(theNode);
    theNode.next = orangeNode;
    orangeNode.next = catNode;
    
    //output "The Orange Cat"
    System.out.println(sentence.toString());
    
    //output "The Orange Furry Cat"  
    Node furryNode = new Node("Furry");
    sentence.insertAfter(orangeNode, furryNode);
    System.out.println(sentence.toString());
    
    //output "The Orange Furry Dog"
    sentence.deleteNode(catNode);
    sentence.appendNode(new Node("Dog"));
    System.out.println(sentence.toString());
    
    
    //output "An Orange Furry Dog"
    sentence.deleteNode(theNode);
    sentence.pushNode(new Node("An"));
    System.out.println(sentence.toString());
    
    //output 4
    System.out.println(sentence.length());
    
    //output "An Orange Furry Dog"
    sentence.pushNode(new Node("Dog"));
    sentence.pushNode(new Node("Furry"));
    sentence.pushNode(new Node("Orange"));
    sentence.pushNode(new Node("An"));
    sentence.makeUnique();
    System.out.println(sentence.toString());
    
    //output "An Orange"
    sentence.deleteWordsStartingWith('F');
    sentence.deleteWordsStartingWith('d');
    System.out.println(sentence.toString());
  }
}
