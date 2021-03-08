public class RockSong extends Composition{
    private String GroupTitle;

    private boolean isAgressive;

    private String Lyrics;

    @Override
    public String Play(){
        return "HAHAHA that is " + this.Lyrics;
    }

    public void setAgressive(boolean agressive) {
        isAgressive = agressive;
    }

    public void setGroupTitle(String groupTitle) {
        GroupTitle = groupTitle;
    }

    public void setLyrics(String lyrics) {
        Lyrics = lyrics;
    }

    public boolean isAgressive() { return this.isAgressive; }

    public String getGroupTitle() {
        return GroupTitle;
    }

    public String getLyrics() {
        return Lyrics;
    }
}
