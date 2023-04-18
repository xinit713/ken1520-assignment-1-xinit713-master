class StringManipulation {

  /**
   * Reverses the end of a string.
   *
   *                          012345                     012345
   * For example: reverseEnd("Hello, world", 5) returns "Hellodlrow ,"
   *                               <----->                    <----->
   *
   * With start == 0, reverses the entire text.
   * With start == text.length(), reverses nothing.
   *
   * @param text    non-null String that will have its end reversed
   * @param start   the index at which the remainder of the input is reversed,
   *                requires 0 <= start <= text.length()
   * @return input text with the substring from start to the end of the string reversed
   */
  public static String reverseEnd(String text, int start) {
    
    String front = "";
    String end = "";
    char ci, cj;

    if(start>text.length())
    {
      return null;
    }

    for(int i=0;i<start;i++)
    {
      ci = text.charAt(i);
      front = front + ci;
    }

    for(int j=text.length()-1;j>=0&&j>front.length()-1;j--)
    {
      cj = text.charAt(j);
      end = end + cj;
    }
      
    String reverseEnded = front + end;
    return(reverseEnded);
  }
    public static void main(String[] args) {
      
      System.out.println(reverseEnd("dog",3));
    }
}
