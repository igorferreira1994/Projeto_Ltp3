package mendes.foodsqlitedema;

/**
 * Created by igor on 01/05/17.
 */

public class Pacientes {
    private int id;
    private String nome;
    private String data;
    private String telefone;
    private String custo;
    private String ambulatorio;
    private String doenca;
    private String sintomas;
    private String medicacao;
    private String conclusao;

    public Pacientes(int id, String nome, String data, String telefone, String custo, String ambulatorio, String doenca, String sintomas, String medicacao, String conclusao) {
        this.id = id;
        this.nome = nome;
        this.data = data;
        this.telefone = telefone;
        this.custo = custo;
        this.ambulatorio = ambulatorio;
        this.doenca = doenca;
        this.sintomas = sintomas;
        this.medicacao = medicacao;
        this.conclusao = conclusao;
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

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCusto() {
        return custo;
    }

    public void setCusto(String custo) {
        this.custo = custo;
    }

    public String getAmbulatorio() {
        return ambulatorio;
    }

    public void setAmbulatorio(String ambulatorio) {
        this.ambulatorio = ambulatorio;
    }

    public String getDoenca() {
        return doenca;
    }

    public void setDoenca(String doenca) {
        this.doenca = doenca;
    }

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    public String getMedicacao() {
        return medicacao;
    }

    public void setMedicacao(String medicacao) {
        this.medicacao = medicacao;
    }

    public String getConclusao() {
        return conclusao;
    }

    public void setConclusao(String conclusao) {
        this.conclusao = conclusao;
    }
}