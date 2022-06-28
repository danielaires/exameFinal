import java.util.List;
import java.util.Scanner;

public class ParticipanteView {
    private DaoParticipante dp;

    public ParticipanteView(DaoParticipante dp) {
        this.dp = dp;
    }

    public Participante obterDados() {

        Scanner e = new Scanner(System.in);
        System.out.println("-- Cadastro de Participante --");
        System.out.println("Digite o id: ");
        int id = e.nextInt();
        e.nextLine();

        System.out.println("Digite o nome: ");
        String nome = e.nextLine();

        System.out.println("Digite o ano de nascimento: ");
        int ano = e.nextInt();

        System.out.println("Tem formacao superior: true sim ou false nao");
        boolean b = e.nextBoolean();

        if (b == true) {
            System.out.println("Tenho");
        } else if (b == false) {
            System.out.println("Nao tenho");
        }

        Participante participante = new Participante(id, nome, ano, b);

        dp.inserir(participante);

        return participante;

    }

    public List obterParticipante(DaoParticipante daoParticipante) {

        return daoParticipante.listar();

    }
}