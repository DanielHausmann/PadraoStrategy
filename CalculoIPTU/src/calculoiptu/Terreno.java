package calculoiptu;

public class Terreno extends Imovel{
    
   public Terreno(char local, float espaco, int comodo) {
        super(local, espaco, comodo);
        this.setValor(new DefinirValorSemEdificacao());
    }
}
