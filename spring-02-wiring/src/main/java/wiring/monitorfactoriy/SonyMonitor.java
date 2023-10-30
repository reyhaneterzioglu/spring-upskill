package wiring.monitorfactoriy;

public class SonyMonitor extends Monitor {

    @Override
    public void drawPixelAt(int x, int y, String color) {
        System.out.println("Drawing pixel at " + x + "," + y + " in colour " + color + " with Sony");
    }


    public SonyMonitor(String model, String manufacturer, int size) {
        super(model, manufacturer, size);
    }
}
