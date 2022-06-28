import java.util.ArrayList;
import java.util.List;

public class Banco {

    private static List lista;

    public Banco() {
        lista = new ArrayList();
    }


    public static List getLista() {

        return lista = new ArrayList();
    }

    public void setLista(List lista) {

        this.lista = lista;
    }

    ArrayList listPalestra = new ArrayList<>();

    public ArrayList<Palestra> getListPalestra() {

        return listPalestra;
    }

    public void setListPalestra(ArrayList listPalestra) {

        this.listPalestra = listPalestra;
    }

    ArrayList listPalestrates = new ArrayList<>();

    public ArrayList getListPalestrates() {

        return listPalestrates;
    }

    public void setListPalestrates(ArrayList listPalestrates) {
        this.listPalestrates = listPalestrates;
    }

    ArrayList listParticipante = new ArrayList<>();

    public ArrayList getListParticipante() {

        return listParticipante;
    }

    public void setListParticipante(ArrayList listParticipante) {

        this.listParticipante = listParticipante;
    }
}