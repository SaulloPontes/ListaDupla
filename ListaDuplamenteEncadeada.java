public class ListaDuplamenteEncadeada {


    Nó primeiro, ultimo;
    int quantidade_nos;

/* --------------------------
    public ListaDuplamenteEncadeada() {
        primeiro = null;
        ultimo = null;
        quantidade_nos = 0;

    }

    public boolean Lista_vazia() {
        if (this.primeiro == null && this.ultimo == null) {
            return true;
        } else {
            return false;
        }
    }

    public void Adicionar_inicio(int e) {
        Nó novo = new Nó(e);
        if (!Lista_vazia()) {
            novo.anterior_no = ultimo;
            novo.proximo_no = primeiro;
        } else if (primeiro == null) {
            ultimo = novo;
        } else {
            novo.proximo_no = primeiro;
            primeiro.anterior_no = novo;
        }
        primeiro = novo;
        quantidade_nos++;
    }


    public  void  Adicionar_final(int e){
        Nó novo = new Nó(e);
        novo.proximo_no = null;
        novo.anterior_no=null;

        if(Lista_vazia()){
            primeiro = novo;
        }else{
            ultimo.proximo_no = novo;
            novo.anterior_no = ultimo;
        }
        ultimo = novo;
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
        Nó posNó = primeiro;
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
                primeiro = ultimo = null;
                msg = "Excluida posição:" + pos +", valor:"+novo.elemento_armazenado;
            }else{
                primeiro = novo.proximo_no;
                primeiro.anterior_no = null;
                msg = "Excluida posição:"+pos+", valor: "+novo.elemento_armazenado;
            }
        }else if(pos==quantidade_nos-1){
            ultimo=novo.anterior_no;
            ultimo.proximo_no=null;
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
        Nó novo = ultimo;
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
        if(primeiro == null && ultimo==null){
            return  true;
        }else{
            return false;
        }
    }

    public  void adicionarInicio(int e){
        Nó novo = new Nó(e);
        if(!listaVazia()){
            primeiro.anterior_no = novo;
            novo.proximo_no = primeiro;
        }else{
            ultimo = novo;
        }
        primeiro = novo;
    }

    public void adicionarFinal(int e){
        Nó novo = new Nó(e);
        if(listaVazia()){
            primeiro = novo;
        }else{
            ultimo.proximo_no = novo;
            novo.anterior_no = ultimo;

        }
        ultimo = novo;

    }

    public  Nó removerInicio() throws Exception {
        Nó removido = null;
        if (listaVazia()){
            throw new  Exception("lista vazia") ;
        }else {
            removido = primeiro;
            primeiro = primeiro.proximo_no;
            primeiro.anterior_no=null;
            removido.proximo_no = null;
        }
        return removido;
    }


    public Nó removerFinal() throws Exception {
        Nó removido = null;
        Nó aux ;
        if(listaVazia()){
            throw  new Exception("lista vazia");
        }else {
            removido = aux = primeiro;
            while (removido.proximo_no!=null){
                aux = removido;
                removido = removido.proximo_no;
            }
            removido.anterior_no=null;
            aux.proximo_no=null;
        }
        return removido;
    }

}
