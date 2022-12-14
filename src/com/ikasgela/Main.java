package com.ikasgela;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Carrera carrera = Carrera.getInstance();
        String entrada;

        String nombre;
        int dorsal;
        double marca;
        do {
            System.out.print("Ingrese el dorsal del participante: ");
            entrada = br.readLine().toLowerCase();
            if (!entrada.equals("fin")) {
                try {
                    dorsal = Integer.parseInt(entrada);
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

            } else {

                carrera.verClasificacion();
            }

        } while (!entrada.equals("fin"));
    }
}
