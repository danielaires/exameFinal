import java.util.List;

public class DaoPalestra implements Dao {
    Banco b;

    public DaoPalestra(Banco b) {

        this.b = b;
    }

    @Override
    public void inserir(Object o) {
        Palestra p = (Palestra) o;
        b.getListPalestra().add(p);
    }

    @Override
    public List listar() {

        return b.getListPalestra();
    }
}