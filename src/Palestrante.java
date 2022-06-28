public class Palestrante extends Pessoa {
    private String titulação, instituicaoTrabalho;

    public Palestrante(int id, String nome, int anoNascimento, String titulação, String instituicaoTrabalho) {
        super(id, nome, anoNascimento);
        this.titulação = titulação;
        this.instituicaoTrabalho = instituicaoTrabalho;
    }

    public String getTitulação() {
        return titulação;
    }

    public void setTitulação(String titulação) {
        this.titulação = titulação;
    }

    public String getInstituicaoTrabalho() {
        return instituicaoTrabalho;
    }

    public void setInstituicaoTrabalho(String instituicaoTrabalho) {
        this.instituicaoTrabalho = instituicaoTrabalho;
    }

    @Override
    public String toString() {
        return "Palestrante{" +
                "titulação='" + titulação + '\'' +
                ", instituicaoTrabalho='" + instituicaoTrabalho + '\'' +
                '}';
    }
}
