package projecttest;

public class Item
{
    private String title;
    private int playingTime;
    private boolean gotIt;
    private String comment;

    public Item(String theTitle, int time)
    {
        title = theTitle;
        playingTime = time;
        gotIt = false;
        comment = "";
    }

    public void setComment(String comment)
    {
        this.comment = comment;
    }

    public String getComment()
    {
        return comment;
    }

    public void setOwn(boolean ownIt)
    {
        gotIt = ownIt;
    }

    public boolean getOwn()
    {
        return gotIt;
    }

    public String toString()
    {  
        
        String  a;
          if(gotIt) {
                   a="*";
                    } 
          else
                   a=" ";
    return "title: " + title + " (" + playingTime + " mins)" + a +" "+comment;
         
    }
}

