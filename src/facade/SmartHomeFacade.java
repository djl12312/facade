package facade;

public class SmartHomeFacade {
    private HomeTheaterFacade homeTheater;
    private SecuritySystem security;
    private SmartLighting smartLights;
    private ClimateControl climate;

    public SmartHomeFacade(HomeTheaterFacade homeTheater) {
        this.homeTheater = homeTheater;
        this.security = new SecuritySystem();
        this.smartLights = new SmartLighting();
        this.climate = new ClimateControl();
    }

    public void movieNightMode(String movie) {
        System.out.println("🌙 영화의 밤 모드 활성화");

        security.setHomeMode();
        security.lockAllDoors();

        smartLights.dimAllLights(20);
        smartLights.setColorTemperature("warm");

        climate.setOptimalMovieTemperature();

        homeTheater.watchDvdMovie(movie);

        System.out.println("완벽한 영화의 밤 준비 완료! 🎬✨\n");
    }

    public void awayMode() {
        System.out.println("🚗 외출 모드 활성화");

        homeTheater.endEntertainment();

        security.setAwayMode();
        security.armAllSensors();

        smartLights.turnOffAllLights();

        climate.setEcoMode();

        System.out.println("안전한 외출 준비 완료! 🔒\n");
    }

    private static class SecuritySystem {
        public void setHomeMode() { System.out.println("보안: 재택 모드"); }
        public void setAwayMode() { System.out.println("보안: 외출 모드"); }
        public void lockAllDoors() { System.out.println("보안: 모든 문 잠금"); }
        public void armAllSensors() { System.out.println("보안: 모든 센서 활성화"); }
    }

    private static class SmartLighting {
        public void dimAllLights(int level) { System.out.println("조명: 전체 " + level + "% 밝기"); }
        public void setColorTemperature(String temp) { System.out.println("조명: " + temp + " 색온도"); }
        public void turnOffAllLights() { System.out.println("조명: 전체 끄기"); }
    }

    private static class ClimateControl {
        public void setOptimalMovieTemperature() { System.out.println("온도: 영화 시청 최적 온도 설정"); }
        public void setEcoMode() { System.out.println("온도: 절약 모드"); }
    }
}