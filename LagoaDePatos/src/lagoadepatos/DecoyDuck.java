package lagoadepatos;

public class DecoyDuck extends Pato {

    public DecoyDuck() {
        quack = new MuteQuack();
        voo = new NaoVoar();
    }

    public void display() {
        System.out.println("Decoy Duck...");
    }
}
