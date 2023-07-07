import java.io.Serializable;

public class miclase implements Serializable {
    private static final long serialVersionUID=1L;
    private String nombre;
    private int edad;

    //constructor
    public miclase(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    //Setter y Getter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "nombre: " + nombre + "; edad: " + edad;
    }
}
