package calculoiptu;

public class Apartamento extends Imovel {
   
   public Apartamento(char local, float espaco, int comodo) {
        super(local, espaco, comodo);
        this.setValor(new DefinirValorComEdificacao());
    }
}
