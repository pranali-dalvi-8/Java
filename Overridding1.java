class Telusko{
    public void Disp(){
        System.out.println(" This is parent class Telusko");
    }
}
class Alien extends Telusko{
    public void Disp(){
        System.out.println(" This is child class Alien");
    }
}


public class Overridding1 {
    public static void main(String[] args) {
        Telusko t = new Alien();
        t.Disp();
        Telusko tp = new Telusko();
        tp.Disp();
    }
}
