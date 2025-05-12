class ConstructorDemo{
    private int age;
    private String name;

     public ConstructorDemo(int age, String name){
        System.out.println("*************************** WEL-COME ********************************");
        this.age=age;
        this.name = name;
     }

     public int GetAge(){
        return age;
     }
     public String Getname()
     {
           return name;
     }
}

public class Constructor {
    public static void main(String args[]){
        ConstructorDemo cd = new ConstructorDemo(21, "pranali");
        System.out.println(cd.GetAge());  
        System.out.println(cd.Getname());

    }
}
