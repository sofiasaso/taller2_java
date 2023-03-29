package Salud;

public class Empleado extends Persona {
    // atributos adicionales
    private String cargo;
    private double valorHora;
    private double horasTrabajadas;
    
    // constructor que llama al constructor de la superclase
    public Empleado(String tipoDocumento, String numeroDocumento, String nombres, String apellidos, int edad, String cargo, double valorHora, double horasTrabajadas, String departamento) {
        super(  tipoDocumento , numeroDocumento, nombres,apellidos, edad);
        this.cargo = cargo;
        this.valorHora = valorHora;
        this.horasTrabajadas = horasTrabajadas;
      
    }
    
    // método para calcular los honorarios
    public double calcularHonorarios() {
        double total = valorHora * horasTrabajadas * (1 - 0.00966);
        return total;
    }
    
    // método para imprimir los detalles del empleado
    public void imprimirDetallesEmpleado() {
        System.out.println("Tipo de documento: " + getTipoDocumento());
        System.out.println("Número de documento: " + getNumeroDocumento());
        System.out.println("Nombres: " + getNombres());
        System.out.println("Apellidos: " + getApellidos());
        System.out.println("Cargo: " + cargo);
        System.out.println("Horas trabajadas: " + horasTrabajadas);
        System.out.println("Valor por hora: " + valorHora);
        System.out.println("Total a pagar: " + calcularHonorarios());
    }

   
    public static void main(String[] args) {
        Empleado emp = new Empleado("CC", "123456789", "kevin", "juarez", 35, "Gerente", 50000, 40, "Ventas");
        emp.imprimirDetallesEmpleado();
    }
}
