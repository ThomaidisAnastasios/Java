package projecttest;

public class CD extends Item
{
    private String artist;
    private int numberOfTracks;

    public CD(String theTitle, String theArtist, int tracks, int time)
    {
        super(theTitle, time);
        artist = theArtist;
        numberOfTracks = tracks;
    }

    public String getArtist()
    {
        return artist;
    }

    public int getNumberOfTracks()
    {
        return numberOfTracks;
    }
    
        public String toString()
    {
         return super.toString()+" "+ artist + " "+ numberOfTracks +"tracks";
       
    }
}
