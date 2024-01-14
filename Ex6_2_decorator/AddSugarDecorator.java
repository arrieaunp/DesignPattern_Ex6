public class AddSugarDecorator implements Beverage{
    private Beverage beverage;

    public AddSugarDecorator(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public int getCost() {
        return beverage.getCost() + 1;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " sugar ";
    }
}
