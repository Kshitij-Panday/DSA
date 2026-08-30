package StackQueue;

public class CustomStack {
protected int[] data;
private static final int DEFAULT_SIZE = 10;

int pointer = -1;



public CustomStack(int size){
  this.data=new int [size];
}
public CustomStack(){
  this(DEFAULT_SIZE);
}

public boolean push(int item){
  if (isFull()){
    System.out.println("Stack is full");
    return false;
  }
  pointer++;
  data[pointer] = item;
  return true;
}

public int pop() throws Exception {
  if (isEmpty()){
    throw new Exception("Cannot pop from an empty stack");
  }
//  int removed = data[pointer];
//  pointer--;
//  return removed;
  return data[pointer--];
}

public int peek() throws Exception{
  if (isEmpty()){
    throw new Exception("Cannot peek from an empty stack");
  }
  return data[pointer];
}



public boolean isFull(){
  return pointer == data.length-1; //pointer is at the last place; if you do pointer++ it will go out of bounds
}

  public boolean isEmpty(){
    return pointer == -1;
  }

}
