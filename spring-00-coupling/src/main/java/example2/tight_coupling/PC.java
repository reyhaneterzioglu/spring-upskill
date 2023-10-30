package example2.tight_coupling;

public class PC {

    private DellCase theCase;
    private AcerMonitor monitor;

    public void powerUp() {
        theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo() {
        monitor.drawPixelAt(1200, 50, "yellow");
    }

    public PC(DellCase theCase, AcerMonitor monitor) {
        this.theCase = theCase;
        this.monitor = monitor;
    }

    public DellCase getTheCase() {
        return theCase;
    }

    public void setTheCase(DellCase theCase) {
        this.theCase = theCase;
    }

    public AcerMonitor getMonitor() {
        return monitor;
    }

    public void setMonitor(AcerMonitor monitor) {
        this.monitor = monitor;
    }
}
