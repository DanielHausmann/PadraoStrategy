package empresalocacaobarco;

public class Canoa extends Barco{
    
    public Canoa(){
        movimento = new Remos();
    }
    
    public void display(){
        System.out.println("Barco Canoa...");
    }
}
