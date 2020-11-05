package empresalocacaobarco;

public class Bateira extends Barco{
    
    public Bateira(){
        movimento = new Motor();
    }
    
    public void display(){
        System.out.println("Barco Bateira...");
    }
}
