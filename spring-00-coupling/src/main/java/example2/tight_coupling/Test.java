package example2.tight_coupling;

public class Test {

    public static void main(String[] args) {

        AcerMonitor theMonitor = new AcerMonitor("27inch Beast", "Acer", 27);
        DellCase theCase = new DellCase("220B", "Dell", "240");


        PC thePC = new PC(theCase, theMonitor);

        thePC.powerUp();

    }
}
