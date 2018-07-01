package racional;

import java.util.Random;

public class NumeroRacional {
  private int numerador;
  private int denominador;

  public NumeroRacional() {
    this((new Random()).nextInt(1000), (new Random()).nextInt(2000));
  }

  public NumeroRacional(int numerador, int denominador) {
    this.numerador = numerador;
    this.denominador = denominador;
    simplificar();
  }

  private int calcularMDC(int a, int b) {
    return (b == 0) ? a : calcularMDC(b, a % b);
  }

  private void simplificar() {
    int mdc = calcularMDC(numerador, denominador);
    this.numerador = numerador / mdc;
    this.denominador = denominador / mdc;
  }

  public void soma(NumeroRacional numero) {
    this.numerador = this.numerador * numero.denominador 
      + this.denominador * numero.numerador;
    this.denominador = this.denominador * numero.denominador;
    simplificar();
  }

  public String getString() {
    return this.numerador + "/" + this.denominador;
  }
}