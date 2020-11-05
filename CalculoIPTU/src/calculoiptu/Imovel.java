package calculoiptu;

public abstract class Imovel {

    private int comodos;
    private float espaco;
    private char localizacao;
    private DefinirValorComportamento valor;

    public Imovel(char localizacao, float espaco, int comodos) {
        this.comodos = comodos;
        this.espaco = espaco;
        this.localizacao = localizacao;
    }

    public void setValor(DefinirValorComportamento valor) {
        this.valor = valor;
    }
    
    public float performDefinirValor(){
        return this.valor.definirValor(localizacao, espaco, comodos);
        
    }

}
