package example2.casefactory;

public class DellCase extends Case {

    @Override
    public void pressPowerButton() {
        System.out.println("Power button pressed");
    }

    public DellCase(String model, String manufacturer, String powerSupply) {
        super(model, manufacturer, powerSupply);
    }

}
