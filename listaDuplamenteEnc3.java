public class ListaDuplamenteEncadeada {


    Nó inicioLista, finalLista;
    int quantidade_nos;


    public ListaDuplamenteEncadeada() {
        inicioLista = null;
        finalLista = null;
        quantidade_nos = 0;

    }

/*

    public boolean Lista_vazia() {
        if (this.inicioLista == null && this.finalLista == null) {
            return true;
        } else {
            return false;
        }
    }

    public void Adicionar_inicio(int e) {
        Nó novo = new Nó(e);
        if (!Lista_vazia()) {
            novo.anterior_no = finalLista;
            novo.proximo_no = inicioLista;
        } else if (inicioLista == null) {
            finalLista = novo;
        } else {
            novo.proximo_no = inicioLista;
            inicioLista.anterior_no = novo;
        }
        inicioLista = novo;
        quantidade_nos++;
    }


    public  void  Adicionar_final(int e){
        Nó novo = new Nó(e);
        novo.proximo_no = null;
        novo.anterior_no=null;

        if(Lista_vazia()){
            inicioLista = novo;
        }else{
            finalLista.proximo_no = novo;
            novo.anterior_no = finalLista;
        }
        finalLista = novo;
        quantidade_nos++;
    }

    public  void inserirPosicao(int e ,int pos){
        Nó novo = new Nó(e);
        Nó aux ;
        if(pos==0){
            Adicionar_inicio(e);
        }else if(pos>=quantidade_nos){
            Adicionar_final(e);
        }else{
            aux = pegarPosicao(pos);
            novo.proximo_no = aux;
            novo.anterior_no = aux.anterior_no;
            aux.anterior_no.proximo_no  = novo;
            aux.anterior_no = novo;
            quantidade_nos++;
        }

    }


    public Nó pegarPosicao(int pos){
        Nó posNó = inicioLista;
        int i = 0;
        if(Lista_vazia()){
            System.out.println("lista vazia");
        }else{
            while (posNó !=null &&  i<pos){
                posNó = posNó.proximo_no;
                i++;
            }
        }
        return  posNó;
    }



    public  String excluirPosicao  (int pos){
        String msg ="";
        Nó novo = pegarPosicao(pos);
        if (Lista_vazia()){
            msg = "Posição não existe";
        }else if(pos==0){
            if(novo.proximo_no==null){
                inicioLista = finalLista = null;
                msg = "Excluida posição:" + pos +", valor:"+novo.elemento_armazenado;
            }else{
                inicioLista = novo.proximo_no;
                inicioLista.anterior_no = null;
                msg = "Excluida posição:"+pos+", valor: "+novo.elemento_armazenado;
            }
        }else if(pos==quantidade_nos-1){
            finalLista =novo.anterior_no;
            finalLista.proximo_no=null;
            msg = "Excluida posição:"+pos+", valor: "+ novo.elemento_armazenado;
        }else{
            novo.anterior_no.proximo_no = novo.proximo_no;
            novo.proximo_no.anterior_no = novo.anterior_no;
            msg = "excluida posição: " + pos + ", valor: " + novo.elemento_armazenado;
        }
        quantidade_nos--;
        return msg;
    }



    public  String mostarListaInversa(){
        int i = quantidade_nos - 1;
        Nó novo = finalLista;
        String msg = "";
        while (novo !=null){
            msg = msg + "posição:" + i + ", valor: " + novo.elemento_armazenado + "\n";
            novo = novo.anterior_no;
            i--;
        }

        return  msg;
    }



*/


    //-------------------------------- teste ------------------------------//

    public  boolean listaVazia(){
        if(inicioLista == null && finalLista ==null){
            return  true;
        }else{
            return false;
        }
    }


    public  void adicionarInicio(int e){
        Nó novo = new Nó(e);
        if(!listaVazia()){
            inicioLista.anterior_no = novo;
            novo.proximo_no = inicioLista;
        }else{
            finalLista = novo;
        }
        inicioLista = novo;
        quantidade_nos++;
    }

    public void adicionarFinal(int e){
        Nó novo = new Nó(e);
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


    public Nó removerFinal() throws Exception {
        Nó removido = null;
        Nó aux ;
        if(listaVazia()){
            throw  new Exception("lista vazia");
        }else {
            removido = aux = inicioLista;
            while (removido.proximo_no!=null){
                aux = removido;
                removido = removido.proximo_no;
            }
            removido.anterior_no=null;
            aux.proximo_no=null;
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

    public  String mostarListaInversa(){
        int i = quantidade_nos - 1;
        Nó novo = finalLista;
        String msg = "";
        while (novo !=null){
            msg = msg + "posição:" + i + ", valor: " + novo.elemento_armazenado + "\n";
            novo = novo.anterior_no;
            i--;
        }

        return  msg;
    }

    public  String excluirPosicao  (int pos){
        String msg ="";
        Nó novo = pegarPosicao(pos);
        if (listaVazia()){
            msg = "Posição não existe";
        }else if(pos==0){
            if(novo.proximo_no==null){
                inicioLista = finalLista = null;
                msg = "Excluida posição:" + pos +", valor:"+novo.elemento_armazenado;
            }else{
                inicioLista = novo.proximo_no;
                inicioLista.anterior_no = null;
                msg = "Excluida posição:"+pos+", valor: "+novo.elemento_armazenado;
            }
        }else if(pos==quantidade_nos-1){
            finalLista =novo.anterior_no;
            finalLista.proximo_no=null;
            msg = "Excluida posição:"+pos+", valor: "+ novo.elemento_armazenado;
        }else{
            novo.anterior_no.proximo_no = novo.proximo_no;
            novo.proximo_no.anterior_no = novo.anterior_no;
            msg = "excluida posição: " + pos + ", valor: " + novo.elemento_armazenado;
        }
        quantidade_nos--;
        return msg;
    }

    public Nó pegarPosicao(int pos){
        Nó posNó = inicioLista;
        int i = 0;
        if(listaVazia()){
            System.out.println("lista vazia");
        }else{
            while (posNó !=null &&  i<pos){
                posNó = posNó.proximo_no;
                i++;
            }
        }
        return  posNó;
    }

    public  void inserirPosicao(int e ,int pos){
        Nó novo = new Nó(e);
        Nó aux ;
        if(pos==0){
            adicionarInicio(e);
        }else if(pos>=quantidade_nos){
            adicionarFinal(e);
        }else{
            aux = pegarPosicao(pos);
            novo.proximo_no = aux;
            novo.anterior_no = aux.anterior_no;
            aux.anterior_no.proximo_no  = novo;
            aux.anterior_no = novo;
            quantidade_nos++;
        }

    }

}
