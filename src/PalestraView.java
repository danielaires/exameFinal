import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

public class PalestraView {

    private DaoPalestra dp;

    public PalestraView(DaoPalestra dp) {
        this.dp = dp;
    }

    public void obterDados(){

        Scanner e = new Scanner(System.in);

        System.out.println("Digite o id: ");
        int id = e.nextInt();
        System.out.println("Digite o nome: ");
        String nome = e.nextLine();
        System.out.println("Digite o Horario inicial: ");
        String i = e.nextLine();
        System.out.println("Digite o Horario final: ");
        String f = e.nextLine();
        System.out.println("Digite as vagas: ");
        int v = e.nextInt();
        System.out.println("Digite o valor: ");
        double val = e.nextDouble();

       // Palestra pale = new Palestra(id,nome,i,f,v,val,);

       // dp.inserir(pale);


    }


    public List obterPalestra(DaoPalestra daoPalestra){

        return daoPalestra.listar();

    }


}
