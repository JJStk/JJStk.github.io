public class Car {
    Int Horsepwr;
    Int TopSpeed;
    String brand;

    Car(Int Horsepwr, Int TopSpeed, String brand){

        this.Horsepwr = Horsepwr;
        this.TopSpeed = TopSpeed;
        this.brand = brand;
    
}


    void CarShow(){
        System.out.print(brand + Horsepwr + TopSpeed);
    }
    
}
