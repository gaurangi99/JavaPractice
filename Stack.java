package com.example;

public class Stack {

  LinkedList list;

  public Stack() {
    list = new LinkedList();
  }

  public void push(int id) {
    list.insert(id);
  }

  public int pop() {
    Node tmp;
    int val =  -1;
    if (list.head != null) {
       tmp=list.head;
      if (tmp != null) {
        val = tmp.id;
        list.head = tmp.next;
      }
      return val;
    }
    else{
      System.out.println("stack is empty!!");
    }
    return -1;
  }

  public static void main(String[] args) {
    Stack s = new Stack();
    s.push(1);
    s.push(2);
    s.push(12);
    s.pop();
    s.list.Display();
  }

}
