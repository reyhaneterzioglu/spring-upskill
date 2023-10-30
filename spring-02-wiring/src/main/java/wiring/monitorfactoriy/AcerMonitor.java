package wiring.monitorfactoriy;

public class AcerMonitor extends Monitor {

    @Override
    public void drawPixelAt(int x, int y, String color) {
        System.out.println("Drawing pixel at " + x + "," + y + " in colour " + color + " with Acer");
    }

    public AcerMonitor(String model, String manufacturer, int size) {

        super(model, manufacturer, size);
    }

}
