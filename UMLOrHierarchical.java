class Plane{
    public void fly(){
        System.out.println("plane is flying");

    }
    public void takeoff(){
        System.out.println("plane is Takeoffing");
        
    }
}


class CargoPlane extends Plane
{
    public void fly(){
        System.out.println("Cargo plane is flying");

    }
    public void takeoff(){
        System.out.println(" Cargo plane is Takeoffing");
        
    }
    public void carryGoods()                                   // spacialixe method
    {
        System.out.println("carry Goods");
    }
}

class PassengerPlane extends Plane
{
    public void fly(){
        System.out.println("Passenger plane is flying");

    }
    public void takeoff(){
        System.out.println("Passenger plane is Takeoffing");
        
    }
}


public class UMLOrHierarchical {
    public static void main(String[] args) {
         CargoPlane cp = new CargoPlane();
         PassengerPlane pp = new PassengerPlane();

         cp.fly();
         cp.takeoff();
         cp.carryGoods();

         pp.fly();
         pp.takeoff();
    }
}
