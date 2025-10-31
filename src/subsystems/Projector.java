package subsystems;

public class Projector {
    private String description;
    private boolean power;
    private String inputDevice;

    public Projector(String description) {
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

    public void setInput(Object device) {
        inputDevice = device.getClass().getSimpleName();
        System.out.println(description + " 입력을 " + inputDevice + "로 설정");
    }

    public void wideScreenMode() {
        System.out.println(description + " 와이드스크린 모드 (16:9)");
    }

    public void tvMode() {
        System.out.println(description + " TV 모드 (4:3)");
    }

    @Override
    public String toString() {
        return description + " [전원: " + (power ? "ON" : "OFF") +
                ", 입력: " + (inputDevice != null ? inputDevice : "없음") + "]";
    }
}