class Main2{
  public static boolean happy = true;

public static void main(String [] args) {
   if (iAmHappy())
   {
     System.out.println("I clap my hands");
   }
   else
   {
     System.out.println("I don't clap my hands");

   }
   System.out.println(mySum(88, 2));
   System.out.println(upperCase("Ost"));
   System.out.println(iCry("Fisk"));
}


public static boolean iAmHappy()
{
  // fill out what is missing here:
  if(happy == true){
  return true;
  }else{
    return false;
  }
}

public static int mySum(int a, int b) {
return a + b;
}

public static String upperCase(String myString) {
return myString.toUpperCase();
}

public static boolean iCry(String firstUpper) {
  char firstChar = firstUpper.charAt(0);
  if (Character.isUpperCase(firstChar)) {
    return true;
  }else{
    return false;
  }
}


}
