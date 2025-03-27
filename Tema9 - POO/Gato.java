public class Gato {
    String nombre;
    String color;
    String raza;
    String sexo;
    int edad;
    double peso;

    public Gato() {

    }

    /*
     * Constructor simple
     * 
     * @param sexo -> Macho o hembra
     */
    public Gato(String sexo) {
        this.sexo = sexo;
    }

    /*
     * Constructor complejo
     * 
     * @param nombre -> Nombre
     * 
     * @param color -> Color
     * 
     * @param raza -> Raza
     * 
     * @param sexo -> Macho o hembra
     * 
     * @param edad -> Edad
     * 
     * @param peso -> Peso
     */
    public Gato(String nombre, String color, String raza, String sexo, int edad, double peso) {
        this.nombre = nombre;
        this.color = color;
        this.raza = raza;
        this.sexo = sexo;
        this.edad = edad;
        this.peso = peso;
    }

    // métodos
    void maulla() {
        System.out.println("Miauuuu!");
    }

    void ronronea() {
        System.out.println("Brrrrrr!");
    }

    void come(String comida) {
        System.out.println("Me gusta comer " + comida + "!!");
        System.out.println("Ñam!!");
    }

    void peleaCon(Gato contrincante) {
        System.out.println("Voy a pelearme con " +
                contrincante.nombre);
    }

    public String getColor() {
        return color;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPeso() {
        return peso;
    }

    public String getRaza() {
        return raza;
    }

    public String getSexo() {
        return sexo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        if (nombre.length() >= 5) {
            this.nombre = nombre;
        }
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}