package salud;

import java.util.Scanner;

public class Persona{
    //Atributos
    private String tipoDoc;
    private String documento;
    private String nombre;
    private String apellido;
    private float peso;
    private float estatura;
    private int edad;
    private String sexo;
    private float pesoActual;


    //Definir Scanner privado 
    private Scanner lectura = new Scanner(System.in);

    //Método Constructor
    //Vacío para crear instancia
    public Persona(){
    }

    //Con los parámetros entre paréntesis para iniciar los atributos de la clase
    public Persona(String tipoDoc, String documento, String nombre,
    String apellido, float peso, float estatura, int edad, String sexo){
        this.tipoDoc=tipoDoc;
        this.documento=documento;
        this.nombre=nombre;
        this.apellido=apellido;
        this.peso=peso;
        this.estatura=estatura;
        this.edad=edad;
        this.sexo=sexo;
    }

    //Métodos para ingresar, mostrar y calcular
    public void pedirDatos() {
        System.out.println("\nBienvenido!!!");
        System.out.println("\nCompleta el formulario por favor: ");
        System.out.println("\nIngresa tu tipo de documento");
        tipoDoc= lectura.nextLine();
        System.out.println("\nIngresa tu número de documento");
        documento= lectura.nextLine();
        System.out.println("\nIngresa tus nombres");
        nombre= lectura.nextLine();
        System.out.println("\nIngresa tus apellidos");
        apellido= lectura.nextLine();
        System.out.println("\nIngresa tu peso");
        peso= lectura.nextFloat();
        System.out.println("\nIngresa tu estatura");
        estatura= lectura.nextFloat();
        System.out.println("\nIngresa tu edad");
        edad= lectura.nextInt();
        System.out.println("\nIngresa tu sexo");
        lectura.nextLine();
        sexo= lectura.nextLine();
    }

    public void mostrarPersona() {
        System.out.println("\nLos datos que ingresaste fueron los siguientes: ");
        System.out.println("\nTipo Documento: " + this.tipoDoc);
        System.out.println("\nNúmero de Documento: " + this.documento);
        System.out.println("\nNombres: " + this.nombre);
        System.out.println("\nApellidos: " + this.apellido);
        System.out.println("\nPeso: " + this.peso + " kg");
        System.out.println("\nEstatura: " + this.estatura + " m");
        System.out.println("\nEdad: " + this.edad + " años");
        System.out.println("\nSexo: " + this.sexo);
    }

    //Calcular el IMC con un método de retorno
    //Definir antes el pesoActual y después calcular en el método
    //No debe tener el mismo nombre 
    public float calcularImc() {
        pesoActual = peso / (estatura*estatura);
        return pesoActual;
    }
    
    public void mayorEdad() {
        if (edad<18) {
            System.out.println("\nEres menor de edad");
        } else {
            System.out.println("\nEres mayor de edad");
        }
    }

}