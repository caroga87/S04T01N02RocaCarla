package n1exercici1;

public class Agencies implements Observer {

    private String name;

    public Agencies(String name) {
        this.name = name;
    }

    @Override
    public void update(boolean marketGoesUp) {
        if (marketGoesUp) {
            System.out.println("Hey " +name +"!" +" The stock market has gone up");
        }else {
            System.out.println("Hey " +name +"!" +" The stock market has gone down");
        }
    }
}
