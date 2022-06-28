import java.util.List;

public class Principal {

    public static void main(String[] args) {

        Banco b = new Banco();

        PalestranteView pale = new PalestranteView();
        Palestrante p = pale.obterdados();

        DaoPalestrante dp = new DaoPalestrante(b);
        dp.inserir(p);

        Palestrante pp = pale.obterdados();
        dp.inserir(pp);

        List listaPalestrante= pale.obterPalestrante(dp);

        System.out.println(listaPalestrante);

    }
}
