package lagoadepatos;

public abstract class Pato {

    ComportamentoVoo voo;
    ComportamentoQuack quack;

    public Pato() {
    }

    public abstract void display();

    public void tipoQuack() {
        quack.quack();
    }

    public void tipoVoo() {
        voo.voar();
    }

    public void nadar() {
        System.out.println("Nadando...");
    }

    public void setVoo(ComportamentoVoo voo) {
        this.voo = voo;
    }

    public void setQuack(ComportamentoQuack quack) {
        this.quack = quack;
    }
    
    
}
