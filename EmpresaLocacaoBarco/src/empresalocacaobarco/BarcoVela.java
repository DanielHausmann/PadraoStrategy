package empresalocacaobarco;

public class BarcoVela extends Barco{
    
    public BarcoVela(){
        movimento = new Vela();
    }
    
    public void display(){
        System.out.println("Barco a Vela...");
    }
}
