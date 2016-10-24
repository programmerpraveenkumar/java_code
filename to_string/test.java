import java.util.*;
class test{

  public static void main(String args[]){
    ArrayList <to_string_test> tmp = new ArrayList();
    tmp.add(new to_string_test(1,"praveen"));
    tmp.add(new to_string_test(2,"kumar"));
    Iterator itr = tmp.iterator();
    int i =0;
    while(itr.hasNext()){
      itr.next();      
      System.out.println(""+tmp.get(i++));
    }

    //System.out.println("value of string test is "+tmp.get(0));
  }

}

class to_string_test{
  private int id;
  private String name;
  public to_string_test(int id,String name){
    this.id = id;
    this.name = name;
  }
  public String toString(){
    return this.id +" -- "+this.name;
  }
}
