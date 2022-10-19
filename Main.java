public class Main {


    public static void main(String[] args) throws Exception {
        ListaDuplamenteEncadeada l = new ListaDuplamenteEncadeada();


        l.adicionarInicio(5);
        l.adicionarInicio(500);
        l.adicionarFinal(5000);
        l.adicionarFinal(5);
        l.adicionarInicio(0);

        System.out.println(l.mostrarLista());
        System.out.println(l.mostarListaInversa());
        System.out.println(l.buscarElemento(5000));
        System.out.println(l.buscarElemento(50000));
        l.removerMeio();
        l.adicionarInicio(5);
        System.out.println(l.possuiRepetidos());
        System.out.println(l.excluirPosicao(0));
        System.out.println(l.mostrarLista());





    }
}
