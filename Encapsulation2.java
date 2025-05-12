class Fan{

    private int cost;
    private String brand;

    public void setValues(int x, String y){
        cost = x;
        brand=y;
    }

    public void GetValues(){
        System.out.println("cost of fan is : " + cost + " & brand is : " + brand);
    }
}

public class Encapsulation2 {
    public static void main(String[] args) {
        Fan f = new Fan();
        f.setValues(1200, "Usha");
        f.GetValues();
    }
}
