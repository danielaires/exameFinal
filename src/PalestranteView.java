import java.util.List;
import java.util.Scanner;

public class PalestranteView {

    public Palestrante obterdados() {

        Scanner e = new Scanner(System.in);

        System.out.println("Digite o id: ");
        int id = e.nextInt();
        System.out.println("Digite o nome: ");
        String nome = e.nextLine();
        e.nextLine();
        System.out.println("Digite ano de nascimento: ");
        int ano = e.nextInt();
        System.out.println("Digite a titulacao: ");
        e.nextLine();
        String t = e.nextLine();
        System.out.println("Digite a instituicao de trabalho: ");
        String it = e.nextLine();
        Palestrante palestrante = new Palestrante(id, nome,ano,t,it);

        return palestrante;

    }


    public List obterPalestrante(DaoPalestrante daoPalestrante){

        return daoPalestrante.listar();

    }

}
