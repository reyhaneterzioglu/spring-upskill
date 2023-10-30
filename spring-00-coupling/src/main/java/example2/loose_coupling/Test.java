package example2.loose_coupling;

import example2.loose_coupling.casefactory.Case;
import example2.loose_coupling.casefactory.DellCase;
import example2.loose_coupling.monitorfactory.AcerMonitor;
import example2.loose_coupling.monitorfactory.Monitor;

public class Test {

    public static void main(String[] args) {

        Monitor monitor = new AcerMonitor("27inch Beast", "Acer", 27);
        Case theCase = new DellCase("220B", "Dell", "240");


        PC thePC = new PC(theCase, monitor);

        thePC.powerUp();

    }
}
