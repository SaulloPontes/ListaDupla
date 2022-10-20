public class PilhaLDE {





        Nó inicioLista, finalLista;
        int quantidade_nos;


        public PilhaLDE() {
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


        //----
        public void adicionarInicio(int e) {

            Nó novo = new Nó(e);
            if (inicioLista == null) {
                finalLista = novo;
            } else {
                novo.proximo_no = inicioLista;
                inicioLista.anterior_no = novo;
            }
            inicioLista = novo;
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





    }




