import java.util.List;

public class ClassicComposition extends Composition{
    private String CreationTime;

    private List<String> PlayedInstruments;

    public List<String> getPlayedInstruments() {
        return PlayedInstruments;
    }

    public String getCreationTime() {
        return CreationTime;
    }

    public void setCreationTime(String creationTime) {
        CreationTime = creationTime;
    }

    public void setPlayedInstruments(List<String> playedInstruments) {
        PlayedInstruments = playedInstruments;
    }

    @Override
    public String Play() {
        return "Awesome melody";
    }
}
