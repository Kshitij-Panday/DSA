package StackQueue;

public class DynamicStack extends CustomStack{

  public DynamicStack(){
    super();

  }

  public DynamicStack(int size){
    super();
  }

  @Override
  public boolean push(int item){
    //this takes care of the array being full.
    if (this.isFull()){
      //double the array
      int[] temp = new int[data.length * 2];

//copy all previous items in the new array.
    for (int i =0; i<data.length;i++) {
    temp[i] = data[i];
    }
    data=temp;
    }
    //at this point we know that the array is not full
    //insert item
    return super.push(item);


  }




}
