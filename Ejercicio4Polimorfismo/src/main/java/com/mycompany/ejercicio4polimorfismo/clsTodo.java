package com.mycompany.ejercicio4polimorfismo;

/**
 * @author joseluis
 */
class clsTodo {
  public void Sonar() {
    System.out.println("Sonando");
  }
}

class clsCarro extends clsTodo 
{
  public void Sonar() 
  {
    System.out.println("Sonar como carro");
  }
}

class clsMoto extends clsTodo 
{
  public void Sonar() 
  {
    System.out.println("Sonar como moto");
  }
}