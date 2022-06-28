import java.util.List;
import java.util.Scanner;

public class ParticipanteView {
    private DaoParticipante dp;

    public ParticipanteView(DaoParticipante dp) {
        this.dp = dp;
    }

    public void obterDados(){

        Scanner e = new Scanner(System.in);

        System.out.println("Digite o id: ");
        int id = e.nextInt();
        System.out.println("Digite o nome: ");
        e.nextLine();
        String nome = e.nextLine();
        System.out.println("Digite o ano de nascimento: ");
        int ano = e.nextInt();

        System.out.println("Tem formacao superior:");
        boolean b = e.nextBoolean();
       // Participante participante = new Participante(id,nome,ano,b)

        //dp.inserir(participante);

    }


    public List obterParticipante(DaoParticipante daoParticipante){

        return daoParticipante.listar();

    }
}
