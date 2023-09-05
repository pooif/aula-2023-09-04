import java.math.BigDecimal;
import java.sql.Date;

class App {
  public static void main(String[] args) {

    // int[] hoje1 = {4, 9, 2023};
    // Objeto de Valor
    // Data hoje = new Data(4, 9, 2023);
    // Data outra = new Data(4, 9, 2023);
    // System.out.println(hoje.equals(outra)); // true
    // Value Object: todos os campos são chave!
    // Hora h1 = new Hora(19, 35, 15);
    // Hora h2 = new Hora(19, 35, 14);

    // double preco = 0.10;
    // preco += 0.10;
    // preco += 0.10;
    // System.out.println(preco);

    // BigDecimal preco2 = new BigDecimal("0.10");
    // preco2 = preco2.add(new BigDecimal("0.10"));
    // preco2 = preco2.add(new BigDecimal("0.10"));
    // System.out.println(preco2);

    // R$ 3,99
    Dinheiro d1 = new Dinheiro(3, 99);
    // d1.setReais(4); // imutável: não tem set
    System.out.println(d1.getReais()); // 3
    System.out.println(d1.getCentavos()); // 99
    System.out.println(d1); // R$ 3,99
    System.out.println(d1.toString()); // R$ 3,99

    Produto p1 = new Produto("Calça Jeans", d1);
    Produto p2 = new Produto("Moletom", d1);
    System.out.println(p1);
    System.out.println(p2);

    p2.setPreco(new Dinheiro(4, 99));

    System.out.println(p1);
    System.out.println(p2);
    BigDecimal s;
    Dinheiro d2 = new Dinheiro(5, 25);
    Dinheiro d3 = new Dinheiro(5, 25);
    System.out.println(d2 == d3); // false
    System.out.println(d2.equals(d3)); // true
    System.out.println(d3.equals(d2)); // true

    if (p1.getPreco().compareTo(p2.getPreco()) > 0) {
      System.out.println("Produto 1 é mais caro");
    } else if (p1.getPreco().compareTo(p2.getPreco()) < 0) {
      System.out.println("Produto 2 é mais caro");
    } else {
      System.out.println("Eles têm o mesmo preço");
    }

    // Garbage Collector
    Dinheiro d4 = new Dinheiro(1, 30);
    Dinheiro d5 = new Dinheiro(2, 10);

    d4 = d4.somar(d5);
    System.out.println(d4);

    Dinheiro d6 = new Dinheiro(70); // R$ 0,70
    // Dinheiro d7 = new Dinheiro(50); // R$ 50,00
    System.out.println(d6);

    d6 = d6.somar(1); // + R$ 1,00 ou R$ 0,01
    System.out.println(d6); // 0,71

    d6 = d6.somar(1.10); // double

    System.out.println(d6);


    // construtor ambíguo
    Dinheiro d7 = new Dinheiro(30);
    System.out.println(d7); // R$ 0,30 ou R$ 30,00

    // método fábrica estático (static factory method)
    Dinheiro d8 = Dinheiro.reais(30);
    Dinheiro d9 = Dinheiro.centavos(30);

    System.out.println(d8); // R$ 30,00
    System.out.println(d9); // R$ 0,30

    Dinheiro d10 = Dinheiro.umReal();

    System.out.println(d10);

    // Math é procedural (não é oo)
    double r1 = Math.sqrt(64); // não é OO
    // double r2 = 64.sqrt(); // é OO

    // int s1 = Integer.parseInt("23");
    // int s2 = "23".toInteger();
  }
}