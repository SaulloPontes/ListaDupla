public class Main {


    public static void main(String[] args) {
        ListaDuplamenteEncadeada l = new ListaDuplamenteEncadeada();
        l.Adicionar_inicio(100);
        l.inserirPosicao(10,1);

        System.out.println(l.pegarPosicao(1));

        System.out.println(l.mostarListaInversa());
    }
}
