package com.mycompany.ejemplopolimorfismo;

public class clsTodo {
    public void Sonar()
    {
        System.out.println("Sonando.");
    }
}

class clsCarro extends clsTodo
{
    public void Sonar()
    {
        System.out.println("Sonando como carro.");
    }
}

class clsMoto extends clsTodo
{
    public void Sonar()
    {
        System.out.println("Sonando como moto.");
    }
}