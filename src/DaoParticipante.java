import java.util.List;

public class DaoParticipante implements Dao {

    Banco b;

    public DaoParticipante(Banco b) {
        this.b = b;
    }

    @Override
    public void inserir(Object o) {
        b.getListParticipante().add(o);

    }
    @Override
    public List listar() {

        return b.getListParticipante();

    }
}