package com.campusdual.classroom;

import com.sun.source.tree.SwitchTree;

import java.util.concurrent.ThreadLocalRandom;

public class Exercise10 {




    //TODO ↓
    // Imprimir el color de las pelotas que salgan, hasta que salgan 2 de color azul
    // El mensaje a imprimir es → La bola es de color: COLOR_BOLA
    // COLOR_BOLA puede ser → rojo, azul, verde
    public static void main(String[] args) {
        String previousBall = "";
        String currentBall;
        int blueCount = 0;
        do {
            currentBall = Exercise10.getBall();
            System.out.println("La bola es de color: "+currentBall);
            if (currentBall == "azul"){
                blueCount = blueCount + 1;
            }else{
                blueCount=0;
            }

    } while (blueCount<2);
      /*  System.out.println("Se obtuvieron 2 bolas azules");*/
    }

    //TODO ↓
    // Un método que devuelva una cadena de texto con el color de una pelota (en minúscula). Dicho color se escogerá de
    // manera aleatoria. Se empleará el método randomWithRange(int min, int max) para escoger un número aleatorio, que
    // lo asociaremos al valor de un color de la siguiente manera:
    // 1 → rojo
    // 2 → azul
    // 3 → verde
    public static String getBall() {
        int randomValue = randomWithRange(1,3);
        switch (randomValue) {
            case 1:
                return "azul";
            case 2:
                return "rojo";
            case 3:
                return "verde";
            default:
                return "Desconocido";
        }
            }

    public static int randomWithRange(int min, int max) {
        if (min>max){
            throw new IllegalArgumentException("El valor minimo no puede ser mayor que el maximo");
        }
        return ThreadLocalRandom.current().nextInt(min,max + 1);
    }
}