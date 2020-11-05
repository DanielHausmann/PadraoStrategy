package lagoadepatos;

public class MallardDuck extends Pato {

    public MallardDuck() {

        quack = new Quack();
        voo = new VoarComAsas();
    }

    public void display() {
        System.out.println("Pato Mallard...");
    }
}
