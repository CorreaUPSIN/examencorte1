package com.example.examencorte1;

public class Rectangulo {
    private int base;
    private int altura;

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public Rectangulo(int base, int altura){
        this.base=base;
        this.altura=altura;
    }
    public float calcularArea(){
        return base * altura;
    }
    public float calcularPerimetro(){
        return ((base+altura)*2);
    }

}
