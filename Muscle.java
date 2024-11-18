public class Muscle extends Car implements Manual,Automatic  {
    
    public void manual() {

        System.out.println("This car has a manual transmission");

    }


    public void automatic() {

        System.out.println("This car has an automatic transmission");

    }

    public final String Engine;

    Muscle(String Engine, Int Horsepwr, Int TopSpeed, String brand){
    super(Horsepwr, TopSpeed, brand);
    this.Engine = Engine;

}



}
