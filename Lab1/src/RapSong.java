public class RapSong extends Composition {

    private String Lyrics;

    private boolean isAuthorGangsta;

    private int bitRate;

    public int getBitRate() {
        return bitRate;
    }

    public boolean isAuthorGangsta() {
        return isAuthorGangsta;
    }

    public String getLyrics() {
        return Lyrics;
    }

    @Override
    public String Play() {
        return "Eshhhhhhhhhketiiiiiiiiiittttt!";
    }
}
