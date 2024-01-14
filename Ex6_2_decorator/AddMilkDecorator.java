public class AddMilkDecorator implements Beverage{
    private Beverage beverage;

    public AddMilkDecorator(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public int getCost() {
        return beverage.getCost() + 3;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription() + " milk ";
    }
    
}
