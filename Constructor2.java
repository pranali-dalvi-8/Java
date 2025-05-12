import java.lang.String;

class Fan{
    private String name;
    
    public Fan(){
        System.out.println("************************** WEL COME ****************************");
        System.out.println();
        System.out.println();
        System.out.println("This is the example of default class");
    }
    public void setName(String name){
           this.name=name;
    }
    public String getName(){
        return name;
    }
  
}

public class Constructor2 {
    public static void main(String[] args) {
        Fan f= new Fan();
        f.setName("pranali");
        System.out.println(f.getName());
    }
    
}
