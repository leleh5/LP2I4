
/*
 * @author Leticia e Caroline
 */

public class Pessoa {
    protected static int kp;
    protected String nome;
    protected char sexo;
    protected int idade;

    public Pessoa() {
        this.kp = 0;
        this.nome = "";
        this.sexo = ' ';
        this.idade = 0;
    }

    public Pessoa(String nome, char sexo, int idade) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
    }

    public static int getKp() {
        return kp;
    }

    public static void setKp() {
        kp = kp + 1;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Numero: " + getKp() + " - Nome: " + getNome() + " - Sexo: " + getSexo() + " - Idade: " + getIdade();
    }

}