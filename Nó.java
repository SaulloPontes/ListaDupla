public class Nó {

    int elemento_armazenado;
    Nó proximo_no;
    Nó anterior_no;

    public  Nó(int e){

        this.elemento_armazenado = e;
        this.proximo_no = null;
        this.anterior_no = null;
    }


    @Override
    public String toString() {
        return "elemento_armazenado=" + elemento_armazenado;
    }
}