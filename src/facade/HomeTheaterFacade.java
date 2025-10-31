package facade;

import subsystems.*;

public class HomeTheaterFacade {
    private Amplifier amp;
    private DvdPlayer dvd;
    private BluerayPlayer blueray;
    private StreamingDevice streaming;
    private Projector projector;
    private TheaterLights lights;
    private Screen screen;
    private PopcornPopper popper;
    private AirConditioner aircon;

    public HomeTheaterFacade(Amplifier amp, DvdPlayer dvd, BluerayPlayer blueray,
                             StreamingDevice streaming, Projector projector,
                             TheaterLights lights, Screen screen,
                             PopcornPopper popper, AirConditioner aircon) {
        this.amp = amp;
        this.dvd = dvd;
        this.blueray = blueray;
        this.streaming = streaming;
        this.projector = projector;
        this.lights = lights;
        this.screen = screen;
        this.popper = popper;
        this.aircon = aircon;
    }
}