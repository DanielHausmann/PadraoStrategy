package lagoadepatos;

public class LagoaDePatos {

    public static void main(String[] args) {
        MallardDuck mallard = new MallardDuck();
        mallard.display();
        mallard.tipoQuack();
        mallard.tipoVoo();
        System.out.println("");
        RubberDuck rubber = new RubberDuck();
        rubber.display();
        rubber.tipoQuack();
        rubber.tipoVoo();
        System.out.println("");
        RedHeadDuck redHead = new RedHeadDuck();
        redHead.display();
        redHead.tipoQuack();
        redHead.tipoVoo();
        System.out.println("");
        DecoyDuck decoy = new DecoyDuck();
        decoy.display();
        decoy.tipoQuack();
        decoy.tipoVoo();
        decoy.setQuack(new Squeak());
        
        
}

}
