package calculoiptu;

public class CalculoIPTU {

    public static void main(String[] args) {
       Casa casa = new Casa('A', 1, 1);
        System.out.println(casa.performDefinirValor());
        casa.setValor(new DefinirValorSemEdificacao());
        System.out.println(casa.performDefinirValor());
        System.out.println("");
        Apartamento apto = new Apartamento('C', 3, 2);
        System.out.println(apto.performDefinirValor());
        Terreno terreno = new Terreno('B', 1, 0);
        System.out.println("");
        System.out.println(terreno.performDefinirValor());
    }

}
