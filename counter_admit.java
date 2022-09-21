/*Simulate a tally counter that can be used to admit a limited number of people. First,
the limit is set with a call public void setLimit(int maximum) If the click button is
clicked more often than the limit, it has no effect. (Hint: The call Math.min(n, limit)
returns n if n is less than limit, and limit otherwise.*/

public class counter_admit {
    private int value;
    int Limit;

    void setLimit(int maximum)
    {
         Limit=maximum;                 //change 1
    }

    public void click()
    {
        value = value + 1;
        if (value>Limit)               //change 2
            value--;
    }

    public int getValue()
    {
        return value;
    }


    public void reset()
    {
        value = 0;
    }

}
