class Animal {
    public void Eat(){
        System.out.println("Animal : Eat");
    }
    public void Sleep(){
        System.out.println("Animal : Sleep ");
    }
}
class Tiger extends Animal {
    public void Eat(){
        System.out.println("Tiger : Eat");
    }
    public void Sleep(){
        System.out.println("Tiger : Sleep ");
    }
}
class Monkey extends Animal {
    public void Eat(){
        System.out.println("Monkey : Eat");
    }
    public void Sleep(){
        System.out.println("Monkey : Sleep ");
    }
}
class Deer extends Animal {
    public void Eat(){
        System.out.println("Deer : Eat");
    }
    public void Sleep(){
        System.out.println("Deer : Sleep ");
    }
}


public class Polymorphism {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.Eat();
        a.Sleep();
        Animal a1 = new Tiger();
        a1.Eat();
        a1.Sleep();
        Animal a2 = new Monkey();
        a2.Eat();
        a2.Sleep();
        Animal a3 = new Deer();
        a3.Eat();
        a3.Sleep();
    }
}
