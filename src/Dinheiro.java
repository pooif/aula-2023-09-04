// Objeto de Valor/Value Object
// - Imutável: todos os atributos são constantes (final)
final class Dinheiro
  implements Comparable<Dinheiro> { // a classe não pode ser estendida
  // quantificáveis
  private final int centavos;

    // 3,99 = 99 + 3 * 100 = 399
  Dinheiro(int reais, int centavos) {
    this.centavos = centavos + reais * 100;
  }
  // sobrecarga de construtor: Polimorfismo ad-hoc
  // polimorfismo por sobrecarga
  Dinheiro(int centavos) {
    this.centavos = centavos;
  } 

  int getReais() { // 399 / 100 = 3
    return centavos / 100;
  }

  int getCentavos() { // 399 % 100 = 99
    return centavos % 100;
  }

  @Override
  public String toString() {
    return String.format("%d,%02d", getReais(), getCentavos());
  }

  @Override
  public boolean equals(Object o) {
    if (o instanceof Dinheiro) {
      Dinheiro outro = (Dinheiro) o;
      return this.centavos == outro.centavos;
    }
    return false;
  }

  @Override
  public int compareTo(Dinheiro o) {
    return this.centavos - o.centavos;
  }

  Dinheiro somar(Dinheiro o) {
    return new Dinheiro(0, this.centavos + o.centavos);
  }
  // método somar sobrecarregado (overloaded)
  Dinheiro somar(int centavos) {
    return new Dinheiro(this.centavos + centavos);
  }

  Dinheiro somar(double d) { // 1.22 * 100 = 122.00000
    return new Dinheiro(this.centavos + (int) (d * 100.0));
  }
  
  // métodos fábrica estáticos
  // static = Dinheiro.método(...)
  static Dinheiro reais(int reais) {
    return new Dinheiro(reais, 0);
  }

  static Dinheiro centavos(int centavos) {
    return new Dinheiro(centavos);
  }

  static Dinheiro umReal() {
    return new Dinheiro(1, 00);
  }

  // operator overloading (sobrecarga de operador)
  // public boolean +(Dinheiro o)

}

