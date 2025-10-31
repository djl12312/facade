package subsystems;

public class DvdPlayer {
    private String description;
    private boolean power;
    private String currentMovie;

    public DvdPlayer(String description) {
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

    public void play(String movie) {
        currentMovie = movie;
        System.out.println(description + " \"" + movie + "\" 재생 시작");
    }

    public void stop() {
        System.out.println(description + " 재생 중지");
        currentMovie = null;
    }

    public void pause() {
        System.out.println(description + " 일시 정지");
    }

    public void eject() {
        System.out.println(description + " 디스크 배출");
        currentMovie = null;
    }

    @Override
    public String toString() {
        return description + " [전원: " + (power ? "ON" : "OFF") +
                ", 재생 중: " + (currentMovie != null ? currentMovie : "없음") + "]";
    }
}