import java.util.ArrayList;

public class Delimiters
{
/** The open and close delimiters. */
private String openDel;
private String closeDel;
/** Constructs a Delimiters object where open is the open delimiter and close is the
* close delimiter.
* Precondition: open and close are non-empty strings.
*/
public Delimiters(String open, String close)
{
openDel = open;
closeDel = close;
}
/** Returns an ArrayList of delimiters from the array tokens, as described in part (a). */
public ArrayList<String> getDelimitersList(String[] tokens)
{ 
    ArrayList<String> product = new ArrayList<>();
    for(int x =0; x<tokens.length; x++)
    {
        if(tokens[x].equals(openDel)) 
        {product.add(openDel);
        System.out.println(openDel+" ");}
        if(tokens[x].equals(closeDel)) 
        {product.add(closeDel);
            System.out.println(closeDel+" ");}
    }
    return product;
}



/** Returns true if the delimiters are balanced and false otherwise, as described in part (b).
* Precondition: delimiters contains only valid open and close delimiters.
*/
public boolean isBalanced(ArrayList<String> delimiters)
{ 
    int ocount = 0;
    int ccount = 0;
    for(int x =0; x<delimiters.size(); x++)
    {
        if(delimiters.get(x).equals(openDel)) ocount++;
        if(delimiters.get(x).equals(closeDel)) ccount++;

        if(ccount>ocount) return false;
    }
  
    return ocount==ccount;
}
// There may be instance variables, constructors, and methods that are not shown.
}