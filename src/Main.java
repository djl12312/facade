import config.TheaterPresets;
import facade.HomeTheaterFacade;
import subsystems.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("🏠 스마트 홈 시어터 시스템 데모 시작\n");

        setupSubsystems();
    }

    private static HomeTheaterFacade homeTheater;
    private static TheaterPresets presets;

    private static void setupSubsystems() {
        System.out.println("=== 시스템 초기화 ===");

        Amplifier amp = new Amplifier("소니 5.1채널 앰프");
        DvdPlayer dvd = new DvdPlayer("삼성 DVD 플레이어");
        BluerayPlayer blueray = new BluerayPlayer("LG 4K 블루레이 플레이어");
        StreamingDevice streaming = new StreamingDevice("Apple TV 4K");
        Projector projector = new Projector("벤큐 4K 프로젝터");
        TheaterLights lights = new TheaterLights("필립스 스마트 조명");
        Screen screen = new Screen("120인치 전동 스크린");
        PopcornPopper popper = new PopcornPopper("웨스트벤드 팝콘기");
        AirConditioner aircon = new AirConditioner("LG 인버터 에어컨");

        homeTheater = new HomeTheaterFacade(amp, dvd, blueray, streaming, projector, lights, screen, popper, aircon);
        presets = new TheaterPresets(homeTheater);

        System.out.println("모든 시스템이 준비되었습니다!\n");
    }
}