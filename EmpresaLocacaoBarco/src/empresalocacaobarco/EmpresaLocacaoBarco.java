package empresalocacaobarco;

public class EmpresaLocacaoBarco {

    public static void main(String[] args) {
        Bateira bateira = new Bateira();
        bateira.display();
        bateira.performedMovimento();
        System.out.println("");
        Iate iate = new Iate();
        iate.display();
        iate.performedMovimento();
        System.out.println("");
        Canoa canoa = new Canoa();
        canoa.display();
        canoa.performedMovimento();
        System.out.println("");
        Jangada jangada = new Jangada();
        jangada.display();
        jangada.performedMovimento();
        System.out.println("");
        BarcoVela barcoVela = new BarcoVela();
        barcoVela.display();
        barcoVela.performedMovimento();
      
        
    }

}
