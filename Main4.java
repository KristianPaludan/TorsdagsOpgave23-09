public class Main4{

public static void main(String[] args) {

  int[] intArray = {1,2,3,4,5};
  String[] stringArray = {"en", "to", "tre"};
  boolean[] booleanArray = {true, true, false, false};
  printerArr(stringArray);
}

public static void printerArr(String[] numbs){
  for(int i=0; i<numbs.length; i++){
    System.out.println(numbs[i]);
  }
}

}
