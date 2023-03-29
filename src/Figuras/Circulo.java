package Figuras;

import java.util.Scanner;

public class Circulo {

    private double radio;

    public void setRadio(float radio){
        this.radio=radio;
    }

    public double getRadio(){
        return radio;
    }

    public void calcularArea(){
        double area=(radio*radio)* Math.PI;
        System.out.println("\nEl área del circulo con un radio de " + this.radio + ", es igual a " + area);
    }


}
