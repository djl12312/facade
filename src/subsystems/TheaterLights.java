package subsystems;

public class TheaterLights {
    private String description;
    private int brightness; // 0-100

    public TheaterLights(String description) {
        this.description = description;
        this.brightness = 100;
    }

    public void on() {
        brightness = 100;
        System.out.println(description + " 켜기 (100% 밝기)");
    }

    public void off() {
        brightness = 0;
        System.out.println(description + " 끄기");
    }

    public void dim(int level) {
        brightness = level;
        System.out.println(description + " 밝기를 " + level + "%로 조절");
    }

    @Override
    public String toString() {
        return description + " [밝기: " + brightness + "%]";
    }
}