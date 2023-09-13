/**
 * @author kaiomuller
 */

public class Pessoa {

    private String nome;
    private int idade;
    private String datanascimento;

    // metodos get e set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getDatanascimento() {
        return datanascimento;
    }

    public void setDatanascimento(String datanascimento) {
        this.datanascimento = datanascimento;
    }

    //Métodos de cadastros
    public void cadastrarNome(String cNovo){
       setNome(cNovo);
    }

    public void cadastrarIdade(int cIdade){
        setIdade(cIdade);
    }

    /**
     * Método de cadastrar data de nascimento
     *
     * @param dtNascimento
     *
     * @deprecated
     * @see String alterarDtNascimento(String NovaDtNasc)
     *
     * @since version 2.0
     */

    public void castrarDataNasciemnto(String dtNascimento){
        setDatanascimento(dtNascimento);
    }

    public void alterarDtNascimento(String NovaDtNasc){
        this.datanascimento = NovaDtNasc;
    }
}
