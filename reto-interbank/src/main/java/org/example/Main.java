package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        String archivoCSV = "data.csv";
        double balance = 0;
        double totalCredito = 0;
        double totalDebito = 0;
        int conteoCredito = 0, conteoDebito = 0;
        double mayorMonto = 0;;
        String idMayorMonto = null;


        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(archivoCSV));

            String linea;

            br.readLine();

            while ((linea = br.readLine()) != null) {

                //--------------Realizamos la separación de los datos  por comas------------//
                String[] datos = linea.split(",");

                //--------------Antes de acceder a los índices garantizamos que la longitud es exactamente 3-----------//
                if (datos.length != 3) {
                    System.out.println("Línea mal formateada: " + linea );
                    continue;
                }

                String id = datos[0].trim();
                String tipo = datos[1].trim();
                String montoStr = datos[2].trim();

                //------------validacion de valores vacios------------//
                if (id.isEmpty() || tipo.isEmpty() || montoStr.isEmpty()) {
                    System.out.println("Línea con campos vacíos: " + linea);
                    continue;
                }

                double monto;
                //------------validacion al Intentar convertir el monto a número----------//
                try {
                    monto = Double.parseDouble(montoStr);
                } catch (NumberFormatException e) {
                    System.out.println("Monto inválido en línea: " + linea);
                    continue;
                }

                //------------ Realizamos el Procesamiento de los créditos y débitos-------//
                if (tipo.equals("Crédito")) {
                    totalCredito += monto;
                    conteoCredito++;
                } else if (tipo.equals("Débito")) {
                    totalDebito += monto;
                    conteoDebito++;
                }

                //----------- Calcular el monto alto-------------------------------------//
                if (monto > mayorMonto ) {
                    mayorMonto = monto;
                    idMayorMonto = id;
                }

            }

            balance = totalCredito - totalDebito;
            //----------- Mostrar el reporte-------------------------------------//
            System.out.println(" Reporte de Transacciones");
            System.out.println("---------------------------");
            System.out.println("Balance Final: $" + String.format("%.2f",balance));
            System.out.println("Transacción de Mayor Monto: ID " + idMayorMonto + " - $" + mayorMonto);
            System.out.println("Conteo de Transacciones: Crédito: " + conteoCredito + " Débito: "+ conteoDebito);

        }catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        } finally {
            //----------------- Cerrar el BufferedReader--------------------------//
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    System.out.println("Error al cerrar el archivo: " + e.getMessage());
                }
            }
        }
    }
}