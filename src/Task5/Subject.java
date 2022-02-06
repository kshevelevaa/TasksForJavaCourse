package Task5;

public class Subject {
    private int volume;
    private int value;
    private float ratio;
    private String name;

    public String getName() {
        return name;
    }

    public float getRatio() {
        return ratio;
    }

    public Subject(int va, int vo, String n){
        value=va;
        volume=vo;
        name=n;
        ratio=volume/value;
    }

    public int getVolume() {
        return volume;
    }

    public int getValue() {
        return value;
    }
}
