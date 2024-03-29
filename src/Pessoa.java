public class Pessoa {
    private int id;
    private String nome;
    private int anoNascimento;

    public Pessoa(int id, String nome, int anoNascimento) {
        this.id = id;
        this.nome = nome;
        this.anoNascimento = anoNascimento;
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

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", anoNascimento=" + anoNascimento +
                '}';
    }

    public int calcularIdade(int atual) {

        return atual - anoNascimento;

    }
}