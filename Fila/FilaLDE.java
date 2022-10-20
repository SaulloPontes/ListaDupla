public class FilaLDE {


    Nó inicioLista, finalLista;
    int quantidade_nos;


    public FilaLDE() {
        inicioLista = null;
        finalLista = null;
        quantidade_nos = 0;

    }

    public  boolean listaVazia(){
        if(inicioLista == null && finalLista ==null){
            return  true;
        }else{
            return false;
        }
    }





    public  void  adicionarFinal(int e){
        Nó novo = new Nó(e);
        novo.proximo_no = null;
        novo.anterior_no=null;

        if(listaVazia()){
            inicioLista = novo;
        }else{
            finalLista.proximo_no = novo;
            novo.anterior_no = finalLista;
        }
        finalLista = novo;
        quantidade_nos++;
    }



    public  Nó removerInicio() throws Exception {
        Nó removido = null;
        if (listaVazia()){
            throw new  Exception("lista vazia") ;
        }else {
            removido = inicioLista;
            inicioLista = inicioLista.proximo_no;
            inicioLista.anterior_no=null;
            removido.proximo_no = null;
        }
        quantidade_nos--;
        return removido;
    }




    public  String mostrarLista(){
        int i = 0;
        Nó novo = inicioLista;
        String msg = "";
        while (novo!=null){
            msg = msg + "Posição:" + i + ", valor: " + novo.elemento_armazenado + "\n";
            novo = novo.proximo_no;
            i++;
        }
        return msg;
    }



}
