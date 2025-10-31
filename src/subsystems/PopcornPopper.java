package subsystems;

public class PopcornPopper {
    private String description;
    private boolean power;

    public PopcornPopper(String description) {
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

    public void pop() {
        if (power) {
            System.out.println(description + " 팝콘 만들기... 톡톡톡!");
        } else {
            System.out.println(description + " 전원이 꺼져있어 팝콘을 만들 수 없습니다.");
        }
    }

    @Override
    public String toString() {
        return description + " [전원: " + (power ? "ON" : "OFF") + "]";
    }
}