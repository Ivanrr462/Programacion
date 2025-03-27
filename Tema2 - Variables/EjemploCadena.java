public class EjemploCadena {
    public static void main(String[] args) {
        String nombre = "Ivan";
        int edad = 19;
        int meses = 10;
        
        //Ejemplo usando printf sin necesidad de concatenar
        System.out.printf("Me llamo %s, tengo %s años y %s meses.\n", nombre, edad, meses);
        
        //Ejemplo usando println y concatenacion de cadenas de caracteres
        System.out.println("\tMe llamo " + nombre + ", tengo " + edad + " años y " + meses + " meses.");
    }
}
