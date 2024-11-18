public class Sports extends Car implements Manual,Automatic {
    
    public void manual() {

        System.out.println("This car has a manual transmission");

    }


    public void automatic() {

        System.out.println("This car has an automatic transmission");

    }

    public final String Handling;

    Sports(String Handling, Int Horsepwr, Int TopSpeed, String brand){

        super(Horsepwr, TopSpeed, brand);
        this.Handling = Handling;

    }

}
