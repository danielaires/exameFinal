import java.util.List;

public class DaoPalestrante implements Dao {
    private Banco b;

    public DaoPalestrante(Banco b) {

        this.b = b;
    }

    @Override
    public void inserir(Object o) {
        b.getListPalestrates().add(o);

    }

    @Override
    public List listar() {
        return b.getListPalestrates();

    }
}