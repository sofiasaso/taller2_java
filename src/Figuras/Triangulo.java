package polimorfismo;

public class Triangulo extends Figura{
    
    private float base;
    private float altura;

    public void setBase(float base){
        this.base = base;
    }

    public float getBase(){
        return base;
    }

    public void setAltura(float altura){
        this.altura = altura;
    }

    public float getAltura(){
        return altura;
    }

    @Override
    public void calcularArea() {
        float area = (base * altura)/2;
        System.out.println("\nEl área del triángulo de base " + this.base + " y con una altura de "
        + this.altura + ", es de " + area);
    }
}
