package empresalocacaobarco;

public class Iate extends Barco{
    
    public Iate(){
        movimento = new Motor();
    }
    
    public void display(){
        System.out.println("Barco Iate...");
    }
}
