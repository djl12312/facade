package subsystems;

public class Amplifier {
    private String description;
    private boolean power;
    private int volume;
    private String input;

    public Amplifier(String description) {
        this.description = description;
        this.power = false;
        this.volume = 0;
        this.input = "";
    }

    public void on() {
        power = true;
        System.out.println(description + " 전원 켜기");
    }

    public void off() {
        power = false;
        System.out.println(description + " 전원 끄기");
    }

    public void setDvd(DvdPlayer dvd) {
        input = "DVD";
        System.out.println(description + " DVD 입력으로 설정");
    }

    public void setBlueray(BluerayPlayer blueray) {
        input = "Blueray";
        System.out.println(description + " 블루레이 입력으로 설정");
    }

    public void setStreaming(StreamingDevice streaming) {
        input = "Streaming";
        System.out.println(description + " 스트리밍 입력으로 설정");
    }

    public void setStereoSound() {
        System.out.println(description + " 스테레오 사운드 모드");
    }

    public void setSurroundSound() {
        System.out.println(description + " 서라운드 사운드 모드");
    }

    public void setVolume(int level) {
        this.volume = level;
        System.out.println(description + " 볼륨을 " + level + "로 설정");
    }

    @Override
    public String toString() {
        return description + " [전원: " + (power ? "ON" : "OFF") +
                ", 볼륨: " + volume + ", 입력: " + input + "]";
    }
}