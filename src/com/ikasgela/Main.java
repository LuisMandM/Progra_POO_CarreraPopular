package com.ikasgela;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Carrera carrera = Carrera.getInstance();
        //String entrada;
        char eleccion;

        String nombre;
        int dorsal;
        double marca;
        do {

            System.out.print("--- Menú --------------\na) Ingresar marca\nb) Ver clasificación" +
                    "\nc) Finalizar registro\nOpcion: ");

            eleccion = br.readLine().toLowerCase().charAt(0);
            System.out.println();

            switch (eleccion) {

                case 'a':
                    try {
                        System.out.print("Ingrese el dorsal del participante: ");
                        dorsal = Integer.parseInt(br.readLine());
                        System.out.print("Ingrese el nombre del participante: ");
                        nombre = br.readLine();
                        nombre = nombre.substring(0, 1).toUpperCase() + nombre.substring(1);
                        System.out.print("Ingrese la marca del participante: ");
                        marca = Double.parseDouble(br.readLine());

                        carrera.registrarMarca(dorsal, nombre, marca);

                        System.out.println();
                    } catch (NumberFormatException e) {
                        System.out.println("Error: tipo de dato erroneo\n");
                    }
                    break;

                case 'b':
                    carrera.verClasificacion();
                    break;

                case 'c':
                    System.out.println("Cerrando programa, exposicion final de registros insertados:\n");
                    carrera.verClasificacion();
                    break;

                default:
                    System.out.println("Opción Invalida\n");
                    break;

            }
        } while (eleccion != 'c');
    }
}

