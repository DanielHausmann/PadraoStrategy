package empresalocacaobarco;

public abstract class Barco {

    ComportamentoDeMovimento movimento;
    
    public Barco() {

    }
    
    public abstract void display();
    
    public void performedMovimento(){
        movimento.tipoMovimento();
    }

    public void setMovimento(ComportamentoDeMovimento movimento) {
        this.movimento = movimento;
    }
    
    
}
