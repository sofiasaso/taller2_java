package Interfaces;

import java.util.Scanner;

public class Caricellazo implements Juego{

Scanner sa=new Scanner(System.in);

    public String nombre ;
    private int moneda ;
    private int eleccion;

@Override


public void iniciar(){
System.out.println(" Ingrese su nombre ");
nombre=sa.nextLine();
}

@Override
public void jugar (){
moneda=(int)Math.floor(Math.random ()*2+1);
System.out.println("1)Cara o 2)Sello " );
eleccion=sa.nextInt();
}

@Override
public void finalizar (){

if (eleccion==1 && moneda==1){
System.out.println(this.nombre+" El programa ha escogido cara, haz escogido");
 System.out.println("GANASTE!!!!!");
}else{System.out.println("Lo siento, haz perdido");}

}
}
