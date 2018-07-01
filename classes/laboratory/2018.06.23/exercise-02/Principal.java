import racional.NumeroRacional;

public class Principal {
  public static void main(String[] args) {
    NumeroRacional num1 = new NumeroRacional(4, 8);    
    NumeroRacional num2 = new NumeroRacional(5, 8);

    System.out.println(num1.getString());
    System.out.println(num2.getString());

    num1.soma(num2);

    System.out.println(num1.getString());
  }
}