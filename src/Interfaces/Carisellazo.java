package Interfaces;

import java.util.Scanner;

public class Caricellazo implements Juego{

Scanner sa=new Scanner(System.in);

    public String nombre ;
    private int moneda ;
    private int eleccion;

@Override


public void iniciar(){
System.out.println(" ingrese su nombre ");
nombre=sa.nextLine();
}

@Override
public void jugar (){
moneda=(int)Math.floor(Math.random ()*2+1);
System.out.println("escoja 1.cara o 2.sello " );
eleccion=sa.nextInt();
}

@Override
public void finalizar (){

if (eleccion==1 && moneda==1){
System.out.println(this.nombre+"salio cara escogiste cara tu ganas");
}else{System.out.println("perdiste :c");}

}
}
