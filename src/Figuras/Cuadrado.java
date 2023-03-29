package Figuras;

public class Cuadrado extends Figura{

    private float lado;

    public void setLado(float lado){
        this.lado = lado;
    }

    public float getLado(){
        return lado;
    }

    @Override
    public void calcularArea() {
        float area = lado * lado;
        System.out.println("\nEl área del cuadrado de lado " + this.lado + " es " + area);
    }
    
}
