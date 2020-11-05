package calculoiptu;

public class DefinirValorSemEdificacao implements DefinirValorComportamento{
    private float definirValor;
   public float definirValor(char local, float esp, int comodo){
       int valorLocal = 0;
        if (local == 'A') {
            valorLocal = 1500;

        } else if (local == 'B') {
            valorLocal = 750;

        } else if (local == 'C') {
            valorLocal = 200;

        }

        float aux = (valorLocal * esp);
        return aux;
    }

}
