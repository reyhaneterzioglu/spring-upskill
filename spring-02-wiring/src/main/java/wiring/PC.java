package wiring;

import wiring.casefactory.Case;
import wiring.monitorfactoriy.Monitor;

public class PC {

    private Case theCase;
    private Monitor monitor;

    public void powerUp() {
        theCase.pressPowerButton();
        drawLogo();
    }


    private void drawLogo() {
        monitor.drawPixelAt(1200, 50, "yellow");
    }

    public PC(Case theCase, Monitor monitor) {
        this.theCase = theCase;
        this.monitor = monitor;
    }

    public Case getTheCase() {
        return theCase;
    }

    public void setTheCase(Case theCase) {
        this.theCase = theCase;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }
}
