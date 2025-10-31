package subsystems;

public class StreamingDevice {
    private String description;
    private boolean power;
    private String currentService;
    private String currentContent;

    public StreamingDevice(String description) {
        this.description = description;
        this.power = false;
    }

    public void on() {
        power = true;
        System.out.println(description + " 전원 켜기");
    }

    public void off() {
        power = false;
        System.out.println(description + " 전원 끄기");
    }

    public void playNetflix(String content) {
        currentService = "Netflix";
        currentContent = content;
        System.out.println(description + " Netflix에서 \"" + content + "\" 스트리밍");
    }

    public void playYouTube(String content) {
        currentService = "YouTube";
        currentContent = content;
        System.out.println(description + " YouTube에서 \"" + content + "\" 스트리밍");
    }

    public void stop() {
        System.out.println(description + " 스트리밍 중지");
        currentService = null;
        currentContent = null;
    }

    @Override
    public String toString() {
        return description + " [전원: " + (power ? "ON" : "OFF") +
                ", 스트리밍: " + (currentService != null ? currentService + " - " + currentContent : "없음") + "]";
    }
}