import java.util.ArrayList;
import java.util.Arrays;


public class Main{
  public static void main(String[] args)
  {
    Delimiters test = new Delimiters( "(" , ")");
    Delimiters test2 = new Delimiters( "<q>" , "</q>");

    String[] tests1 = {"(" ,"x+y",")" ,"*5" };
    test.getDelimitersList(tests1);
    String[] tests2= {"<q>", "yy" ,"</q>","zz" ,"</q>" };
    test2.getDelimitersList(tests2);

    Delimiters test3 = new Delimiters( "<sup>" , "</sup>");
    ArrayList<String> exampleI = new ArrayList<>(Arrays.asList("<sup>","<sup>","</sup>","<sup>", "</sup>", "</sup>" ));
    ArrayList<String> exampleII = new ArrayList<>(Arrays.asList("<sup>","</sup>","</sup>","<sup>" ));
    ArrayList<String> exampleIII = new ArrayList<>(Arrays.asList("</sup>"));
    ArrayList<String> exampleIV = new ArrayList<>(Arrays.asList("<sup>","<sup>","</sup>" ));

    System.out.println(test3.isBalanced(exampleI));
    System.out.println(test3.isBalanced(exampleII));
    System.out.println(test3.isBalanced(exampleIII));
    System.out.println(test3.isBalanced(exampleIV));
  }
}
