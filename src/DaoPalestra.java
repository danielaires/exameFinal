import java.util.List;

public class DaoPalestra implements Dao{
    Banco b;
   private DaoPalestra(Banco b) {

       this.b = b;
    }

    @Override
    public void inserir(Object o) {

       b.getListPalestra().add(o);
    }

    @Override
    public List listar() {

      return b.getListPalestra();

    }
}
