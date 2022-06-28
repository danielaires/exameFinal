import java.util.ArrayList;
import java.util.List;

public class Principal {

    public static void main(String[] args) {

        Banco b = new Banco();

        DaoPalestra daoPalestra = new DaoPalestra(b);
        PalestraView palestraView = new PalestraView(daoPalestra);
        Palestra palestra = palestraView.obterDados();

        PalestranteView pale = new PalestranteView();
        Palestrante p = pale.obterdados();

        // Adiciona o palestrante na palestra
        palestra.setPalestrante(p);

        DaoPalestrante dp = new DaoPalestrante(b);
        dp.inserir(p);

        DaoParticipante daoParticipante = new DaoParticipante(b);
        ParticipanteView pView = new ParticipanteView(daoParticipante);
        Participante participante1 = pView.obterDados();

        // Adiciona o participante1 na palestra
        palestra.adicionarParticipante(participante1);
        participante1.setPalestra(palestra);

        Participante participante2 = pView.obterDados();

        // Adiciona o participante2 na palestra
        palestra.adicionarParticipante(participante2);
        participante2.setPalestra(palestra);

        // Fazendo a listagem das palestras
        ArrayList<Palestra> palestras = b.getListPalestra();
        System.out.println("Listagem de Palestras");

        for(Palestra palestr : palestras) {
            System.out.println("\n");
            System.out.println(palestr);
        }

        System.out.println("\n");

    }
}