import java.util.List;
import java.util.Scanner;

public class PalestraView {

    private DaoPalestra daoPalestra;

    public PalestraView(DaoPalestra dp) {
        this.daoPalestra = dp;
    }

    public Palestra obterDados() {

        Scanner e = new Scanner(System.in);

        System.out.println("-- Cadastro de Palestra --");
        System.out.println("Digite o id: ");
        int id = e.nextInt();
        e.nextLine();

        System.out.println("Digite o nome: ");
        String nome = e.nextLine();

        System.out.println("Digite o Horario inicial: ");
        String i = e.nextLine();

        System.out.println("Digite o Horario final: ");
        String f = e.nextLine();

        System.out.println("Digite as vagas: ");
        int v = e.nextInt();
        e.nextLine();

        System.out.println("Digite o valor: ");
        double valor = e.nextDouble();
        e.nextLine();

        Palestra palestra = new Palestra(id, nome, i, f, v, valor);

        daoPalestra.inserir(palestra);

        return palestra;
    }

    public List obterPalestra() {

        return daoPalestra.listar();

    }

}