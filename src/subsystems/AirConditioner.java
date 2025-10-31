package subsystems;

public class AirConditioner {
    private String description;
    private boolean power;
    private int temperature;

    public AirConditioner(String description) {
        this.description = description;
        this.power = false;
        this.temperature = 24;
    }

    public void on() {
        power = true;
        System.out.println(description + " 전원 켜기");
    }

    public void off() {
        power = false;
        System.out.println(description + " 전원 끄기");
    }

    public void setTemperature(int temp) {
        temperature = temp;
        System.out.println(description + " 온도를 " + temp + "°C로 설정");
    }

    @Override
    public String toString() {
        return description + " [전원: " + (power ? "ON" : "OFF") +
                ", 온도: " + temperature + "°C]";
    }
}