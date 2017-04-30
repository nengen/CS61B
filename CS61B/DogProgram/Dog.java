public class Dog {
  public int size;

  /*This is a constructor. It explains
    * How to construct dogs.
    *In this case, each dog must be
    * created with an integer, and it is
    * used as the size
    *
    *def _init_(self, startSize):
  */
  public Dog(int startSize){
    size = startSize;
  }
  //Why did static go away?
  public void makeNoise() {
    if(size < 10){
      System.out.println("horrific yapping");
    }else if (size < 30) {
      System.out.println("bark.");
    }else {
      System.out.println("woof woofity");
    }
  }
}
