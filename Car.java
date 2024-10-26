public class Car {
    Int Horsepwr;
    Int TopSpeed;
    String name;

    Car(Int Horsepwr, Int TopSpeed, String name){

        this.Horsepwr = Horsepwr;
        this.TopSpeed = TopSpeed;
        this.name = name;
    
}


    void CarShow(){
        System.out.print(name + Horsepwr);
    }
    
}
