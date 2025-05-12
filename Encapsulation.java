class Book{
    private int PgNo;
    
    public void setPgNo(int x){
        if(x>0){
         PgNo = x;
        }
        else{
            System.out.println("Invalid value for property");
        }
    }

    public int getPgNo(){
         return(PgNo);
    }
}


public class Encapsulation {
    public static void main(String[] args) {
        Book b = new Book();
        b.setPgNo(100);
        System.out.println(b.getPgNo()); 
    }
}
