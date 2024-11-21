// Madeup Disease        A+CR
class Main {
    //Main method
  
  //public class ClassTester
  //{
     public static void main(String[] args)
     {
        MadeUpDisease test = new MadeUpDisease();
        System.out.println(test + "\n");
        //write your code below the line
        MadeUpDisease newTest = new MadeUpDisease("Ten", 10);
        System.out.println(newTest);
        newTest.changeVal();
        System.out.println(newTest.getName() + "'s new value is " + newTest.getVal() + ".");
      //   test.name = "Two";
      //   test.val = 13;
        //write your code above this line
        System.out.println("\n" + test);
     }
  }