import java.util.*;

class MiddleChar
{
  public static void main (String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a word with no spaces: ");
    while (true)
    {
      String word = input.next();

      String middle = findMiddle(word);

      System.out.println("The middle character is: " + middle);
      System.out.println("Enter a word: ");
    }
    //System.exit(0);
  }
  public static String findMiddle(String input)
  {
    String result;
    int strLength = input.length();
    boolean even = false;
    if (strLength % 2 == 0)
      even = true;
    if (even)
    {
      result = input.substring((strLength / 2) - 1, (strLength / 2) + 1);
    }
    else
      result = String.valueOf(input.charAt(strLength / 2));

    return result;

  }
}
