package calculoiptu;

public class Casa extends Imovel {

    public Casa(char local, float espaco, int comodo) {
        super(local, espaco, comodo);
        this.setValor(new DefinirValorComEdificacao());
    }

    

    
}
