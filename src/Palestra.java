import java.util.ArrayList;

public class Palestra {
    private int id;
    private String nome;
    private String inicio, fim;
    private int vagas;
    private double valor;

    private ArrayList participante;
    private Palestrante palestrante;


    public Palestra(int id, String nome, String inicio, String fim, int vagas, double valor) {
        this.id = id;
        this.nome = nome;
        this.inicio = inicio;
        this.fim = fim;
        this.vagas = vagas;
        this.valor = valor;
        this.participante = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getInicio() {
        return inicio;
    }

    public void setInicio(String inicio) {
        this.inicio = inicio;
    }

    public String getFim() {
        return fim;
    }

    public void setFim(String fim) {
        this.fim = fim;
    }

    public int getVagas() {
        return vagas;
    }

    public void setVagas(int vagas) {
        this.vagas = vagas;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public ArrayList getParticipante() {
        return participante;
    }

    public void setParticipante(ArrayList participante) {
        this.participante = participante;
    }

    public Palestrante getPalestrante() {
        return this.palestrante;
    }


    public void setPalestrante(Palestrante p) {
        this.palestrante = p;
    }

    @Override
    public String toString() {
        return "Palestra{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", inicio='" + inicio + '\'' +
                ", fim='" + fim + '\'' +
                ", vagas=" + vagas +
                ", valor=" + valor +
                ", participantes=" + participante +
                ", palestrante=" + palestrante +
                '}';
    }

    public void adicionarParticipante(Object o) {
        participante.add(o);
    }

    public void removerParticipante(Participante participantes) {

        participante.remove(participantes);

    }
}