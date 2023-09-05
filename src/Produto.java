class Produto {

  private String descricao;
  private Dinheiro preco;

  Produto(String descricao, Dinheiro preco) {
    this.descricao = descricao;
    this.preco = preco;
  }

  public String getDescricao() {
    return descricao;
  }

  public Dinheiro getPreco() {
    return preco;
  }

  public void setPreco(Dinheiro preco) {
    this.preco = preco;
  }

  @Override
  public String toString() {
    return descricao + " " + preco;
  }
  
}
