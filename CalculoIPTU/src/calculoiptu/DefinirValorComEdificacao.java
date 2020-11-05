package calculoiptu;

public class DefinirValorComEdificacao implements DefinirValorComportamento {

    public float definirValor(char local, float esp, int comodo) {
        int valorLocal = 0;
        if (local == 'A') {
            valorLocal = 3000;

        } else if (local == 'B') {
            valorLocal = 1000;

        } else if (local == 'C') {
            valorLocal = 500;

        }

        float aux = (valorLocal * esp) + (comodo * 1000);
        return aux;
    }
}
