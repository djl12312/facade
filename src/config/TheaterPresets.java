package config;

import facade.HomeTheaterFacade;

import java.util.HashMap;
import java.util.Map;

public class TheaterPresets {
    private HomeTheaterFacade homeTheater;
    private Map<String, Runnable> presets;

    public TheaterPresets(HomeTheaterFacade homeTheater) {
        this.homeTheater = homeTheater;
        this.presets = new HashMap<>();
        initializeDefaultPresets();
    }

    private void initializeDefaultPresets() {
        presets.put("ACTION", () -> {
            System.out.println("🎬 액션 영화 프리셋 적용");
            homeTheater.watch4KMovie("액션 영화");
        });

        presets.put("ROMANCE", () -> {
            System.out.println("💕 로맨스 영화 프리셋 적용");
            homeTheater.watchDvdMovie("로맨스 영화");
        });

        presets.put("DOCUMENTARY", () -> {
            System.out.println("📚 다큐멘터리 프리셋 적용");
            homeTheater.watchNetflix("다큐멘터리 시리즈");
        });

        presets.put("WEEKEND_MORNING", () -> {
            System.out.println("☀️ 주말 아침 프리셋 적용");
            homeTheater.partyMode();
        });
    }
}