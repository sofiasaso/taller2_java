package Figuras;

import java.util.Scanner;

public class Ejecucion {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        int repetir =1, opcionUsuario=0;

        while (repetir==1) {
            System.out.println("Bienvenido a figuras");
            System.out.println("\nSelecciona una opción\n");
            System.out.println("\n1. Para hallar área en circulo\n");
            System.out.println("\n2. Para hallar área en triangulo\n");
            System.out.println("\n3. Para hallar área en cuadrado\n");
            opcionUsuario = lectura.nextInt();

            switch (opcionUsuario) {
                case 1:
                Circulo circulo = new Circulo();
                System.out.println("\nIngresa el valor del radio");
                circulo.setRadio(lectura.nextFloat());
                circulo.calcularArea();                  
                break;

                case 2:
                Triangulo triangulo= new Triangulo();
                System.out.println("\nIngresa el valor de la base");
                triangulo.setBase(lectura.nextFloat());   
                System.out.println("\nIngresa el valor de la altura");
                triangulo.setAltura(lectura.nextFloat());   
                triangulo.calcularArea();                  
                break;

                case 3:
                Cuadrado cuadrado =new Cuadrado();
                System.out.println("\nIngresa el valor del lado");
                cuadrado.setLado(lectura.nextFloat());
                cuadrado.calcularArea();                  
                break;
  
                default:
                System.out.println("\nRevisa nuevamente!!!!");
                    break;
            }
            System.out.println("\nDeseas repetir el programa? Digita 1) Si 2) No");
            repetir = lectura.nextInt();

        }


        lectura.close();
    }
}
