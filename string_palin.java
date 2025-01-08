public class string_palin{
  public static void main (String [] args){
    String org = "silver";
    String rev = new StringBuilder(org).reverse().toString();

    System.out.println("reverse of the string is "+rev);

    if(org.equals(rev)){
      System.out.println("string is palindrome");
    }else{
      System.out.println("the string is not palindrome");
    }
  }
}
