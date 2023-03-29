package Principal;

import Salud.Persona;

public class Inicio {
    public static void main(String[] args) {
        Persona paciente = new Persona();
        paciente.pedirDatos();
        paciente.mostrarPersona();

        //Para mostrar el IMC
        //Vamos a colocar las condiciones aquí e imprimir el dato
        //pero antes resulta indicar que la variable pesoActual es el imc
        paciente.calcularImc();
        System.out.println("Tu IMC es de " + paciente.calcularImc());
        if (paciente.calcularImc()<20) {
            System.out.println("Peso Bajo");
        } else if (paciente.calcularImc()>=20 && paciente.calcularImc()<=25) {
            System.out.println("Peso Ideal");
        } else {
            System.out.println("Sobrepeso");
        }
        
        
        paciente.mayorEdad();
        
    }
}
