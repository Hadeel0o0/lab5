/*We want to add a button to the tally counter in Section 3.1 that allows an operator
 to undo an accidental button click. Provide a method public void undo() that
 simulates such a button. As an added precaution, make sure that clicking the undo
  button more often than the click button has no effect. (Hint: The call Math.max(n, 0)
  returns n if n is greater than zero, zero otherwise.)
*/
public class counter_undo {
    private int value; int n=0;

    public void undo()                     //The change (undo Method)
    {
        n++;
        if( n < value ) {click();}
    }

    public int getValue()
    {
        return value;
    }

    public void click()
    {
        value = value + 1;
    }

    public void reset()
    {
        value = 0;
    }




}
