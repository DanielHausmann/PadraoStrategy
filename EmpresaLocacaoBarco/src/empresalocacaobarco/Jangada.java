package empresalocacaobarco;

public class Jangada extends Barco{
    
    public Jangada(){
        movimento = new Remos();
    }
    
    public void display(){
        System.out.println("Barco Jangada...");
    }
}
