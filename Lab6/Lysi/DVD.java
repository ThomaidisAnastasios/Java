package projecttest;

public class DVD extends Item 
{
    private String director;

    public DVD(String theTitle, String theDirector, int time)
    {
        super(theTitle, time);
        director = theDirector;
    }

    public String getDirector()
    {
        return director;
    }

     public String toString()
    {
       return super.toString()+" "+director;
    }
}
