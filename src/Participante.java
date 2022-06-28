import java.util.ArrayList;
import java.util.Objects;

public class Participante extends Pessoa {

    private boolean temFormacaoSuperior;
    Palestra palestra;

    public Participante(int id, String nome, int anoNascimento, boolean temFormacaoSuperior, Palestra palestra) {
        super(id, nome, anoNascimento);
        this.temFormacaoSuperior = temFormacaoSuperior;
        this.palestra = palestra;
    }


    public boolean isTemFormacaoSuperior() {
        return temFormacaoSuperior;
    }

    public void setTemFormacaoSuperior(boolean temFormacaoSuperior) {
        this.temFormacaoSuperior = temFormacaoSuperior;
    }

    public Palestra getPalestra() {
        return palestra;
    }

    public void setPalestra(Palestra palestra) {
        this.palestra = palestra;
    }
}
