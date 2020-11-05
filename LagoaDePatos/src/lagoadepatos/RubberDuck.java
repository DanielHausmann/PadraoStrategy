package lagoadepatos;

public class RubberDuck extends Pato{
     
    public RubberDuck() {
		
		quack = new Squeak();
		voo = new NaoVoar();
	}
    
    public void display(){
          System.out.println("Pato de Borracha...");
      }
}
