//  instance vaiable

// class Demo{
//     int age;
//     void DemoMethod(){
//         System.out.println(age);
//     }
// }

// public class LocalOrInstanceVari {
//     public static void main(String args[]){
//         Demo obj = new Demo();
//         obj.DemoMethod();
//     }  
// }



// Local variable 

class Demo{
    
    void DemoMethod(){
        int age=10;
        System.out.println(age);
    }
}

public class LocalOrInstanceVari {
    public static void main(String args[]){
        Demo obj = new Demo();
        obj.DemoMethod();
    }  
}

