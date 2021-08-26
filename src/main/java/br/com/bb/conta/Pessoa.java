package br.com.bb.conta;

public class Pessoa {



  public Pessoa(String cpf, String nome, String endereco, String bairro, String cidade, String estado, String cep, String telefone1, String telefone2, String telefone3) {
    super();
    this.cpf = cpf;
    this.nome = nome;
    this.endereco = endereco;
    this.bairro = bairro;
    this.cidade = cidade;
    this.estado = estado;
    this.cep = cep;
    this.telefone1 = telefone1;
    this.telefone2 = telefone2;
    this.telefone3 = telefone3;
  }

  private String cpf;
  private String nome;
  private String endereco;
  private String bairro;
  private String cidade;
  private String estado;
  private String cep;
  private String telefone1;
  private String telefone2;
  private String telefone3;



  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Pessoa other = (Pessoa) obj;
    if (cpf == null) {
      if (other.cpf != null)
        return false;
    } else if (!cpf.equals(other.cpf))
      return false;
    return true;
  }

  public String getCpf() {
    return cpf;
  }

  public String getNome() {
    return nome;
  }

  public String getEndereco() {
    return endereco;
  }

  public String getBairro() {
    return bairro;
  }

  public String getCidade() {
    return cidade;
  }

  public String getEstado() {
    return estado;
  }

  public String getCep() {
    return cep;
  }

  public String getTelefone1() {
    return telefone1;
  }

  public String getTelefone2() {
    return telefone2;
  }

  public String getTelefone3() {
    return telefone3;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }

  public void setBairro(String bairro) {
    this.bairro = bairro;
  }

  public void setCidade(String cidade) {
    this.cidade = cidade;
  }

  public void setEstado(String estado) {
    this.estado = estado;
  }

  public void setCep(String cep) {
    this.cep = cep;
  }

  public void setTelefone1(String telefone1) {
    this.telefone1 = telefone1;
  }

  public void setTelefone2(String telefone2) {
    this.telefone2 = telefone2;
  }

  public void setTelefone3(String telefone3) {
    this.telefone3 = telefone3;
  }


}
