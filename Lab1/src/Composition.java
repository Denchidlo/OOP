import jdk.jfr.Timespan;

public abstract class Composition{

    private Timespan Duration;

    private String Author;

    private String Title;

    public abstract String Play();

    public void setAuthor(String author) {
        Author = author;
    }

    public void setDuration(Timespan duration) {
        Duration = duration;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getAuthor(){
        return this.Author;
    }

    public String getTitle(){
        return this.Title;
    }

    public Timespan getDuration(){
        return this.Duration;
    }
}
