package subsystems;

public class Screen {
    private String description;
    private boolean isDown;

    public Screen(String description) {
        this.description = description;
        this.isDown = false;
    }

    public void up() {
        isDown = false;
        System.out.println(description + " 올리기");
    }

    public void down() {
        isDown = true;
        System.out.println(description + " 내리기");
    }

    @Override
    public String toString() {
        return description + " [상태: " + (isDown ? "내려감" : "올라감") + "]";
    }
}