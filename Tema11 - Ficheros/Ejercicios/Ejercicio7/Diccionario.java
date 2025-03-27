package Ejercicios.Ejercicio7;

import java.io.*;
import java.util.*;

public class Diccionario {
    private static final String SEPARADOR = ":";
    private Map<String, String> diccionario = new HashMap<>();
    private String nombreArchivo;

    public Diccionario(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
        cargarDiccionario();
    }

    private void cargarDiccionario() {
        File archivo = new File(nombreArchivo);
        if (!archivo.exists()) {
            System.out.println("El archivo no existe.");
            return;
        }
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(SEPARADOR);
                if (partes.length == 2) {
                    diccionario.put(partes[0].trim(), partes[1].trim());
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }

    public String traducir(String palabra) {
        return diccionario.getOrDefault(palabra, "La palabra no está en el diccionario.");
    }

    public void agregarPalabra(String palabra, String traduccion) {
        if (!diccionario.containsKey(palabra)) {
            diccionario.put(palabra, traduccion);
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(nombreArchivo, true))) {
                bw.write(palabra + SEPARADOR + traduccion);
                bw.newLine();
            } catch (IOException e) {
                System.out.println("Error al escribir en el archivo: " + e.getMessage());
            }
        } else {
            System.out.println("La palabra ya existe en el diccionario.");
        }
    }
}
