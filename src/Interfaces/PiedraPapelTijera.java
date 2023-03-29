import java.util.Scanner;
import java.util.Random;
public class Piedrapapel implements Juego {

    

    private static final int PIEDRA = 1;
    private static final int PAPEL = 2;
    private static final int TIJERA = 3;
    
    private int eleccionJugador;
    private int eleccionComputadora;
    private int resultado;

    // Constructor vacío
    public Piedrapapel() {
        this.eleccionJugador = 0;
        this.eleccionComputadora = 0;
        this.resultado = 0;
    }

    // Accesores
    public int getEleccionJugador() {
        return eleccionJugador;
    }

    public void setEleccionJugador(int eleccionJugador) {
        this.eleccionJugador = eleccionJugador;
    }

    public int getEleccionComputadora() {
        return eleccionComputadora;
    }

    public int getResultado() {
        return resultado;
    }

    @Override
    public void iniciar() {
        System.out.println("Bienvenido ");
    }

    @Override
    public void jugar() {
       
            
      
        Scanner sa = new Scanner(System.in);
        System.out.println("elija para jugar   1=PIEDRA 2=PAPEL 3=TIJERA ");
        this.eleccionJugador = sa.nextInt();
        Random random = new Random();
        this.eleccionComputadora = random.nextInt(3) + 1; //  número aleatorio entre 1 y 3
        System.out.println("El sitema ha elegido: " + this.eleccionComputadora);

        if (this.eleccionJugador == this.eleccionComputadora) {
            this.resultado = 0; 
        } else if (this.eleccionJugador == PIEDRA && this.eleccionComputadora == TIJERA
                || this.eleccionJugador == PAPEL && this.eleccionComputadora == PIEDRA
                || this.eleccionJugador == TIJERA && this.eleccionComputadora == PAPEL) {
            this.resultado = 1; 
        } else {
            this.resultado = -1; 
        }
    }

    @Override
    public void finalizar() {
        if (this.resultado == 0) {
            System.out.println("Empate");
        } else if (this.resultado == 1) {
            System.out.println("FELICIDADES HAS GANADO");
        } else {
            System.out.println("LO SIENTO HAS PERDIDO");
        }
    }}
