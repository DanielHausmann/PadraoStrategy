package lagoadepatos;

public class RedHeadDuck extends Pato {

    public RedHeadDuck() {
        quack = new Quack();
        voo = new VoarComAsas();
    }

    public void display() {
        System.out.println("Pato de Cabeça Vermelha...");
    }
}
