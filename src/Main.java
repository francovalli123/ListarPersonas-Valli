import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main  {
    public static void main(String[] args) {

        // Primero se crea la lista "personas" donde se guardaran los objetos.
        List<Persona> personas = new ArrayList<>();
        // Luego se crean a los objetos y se los guardan en la Arraylist.
        personas.add(new Persona("Franco", "Valli"));
        personas.add(new Persona("Monica", "Esteve"));
        personas.add(new Persona("Adrian", "Valli"));
        personas.add(new Persona("Joaquin", "Valli"));
        personas.add(new Persona("Milagros", "Chichizola"));

        // Se ordenan por el nombre.
        personas.sort(new Comparator<Persona>() {
            @Override
            public int compare(Persona persona1, Persona persona2) {
                return persona1.getNombre().compareTo(persona2.getNombre());
            }
        });
        System.out.println("Ordenado por nombre: ");
        for (Persona persona : personas) {
            System.out.println(persona.getNombre() + " " + persona.getApellido());
        }

        // Se ordenan por el apellido.
        personas.sort(new Comparator<Persona>() {
            @Override
            public int compare(Persona persona1, Persona persona2) {
                return persona1.getApellido().compareTo(persona2.getApellido());
            }
        });
        System.out.println("\nOrdenado por apellido: ");
        for (Persona persona : personas) {
            System.out.println(persona.getNombre() + " " + persona.getApellido());
        }

        // Por ultimo, se ordenan inversamente por el apellido.
        personas.sort(new Comparator<Persona>() {
            @Override
            public int compare(Persona persona1, Persona persona2) {
                return persona2.getApellido().compareTo(persona1.getApellido());
            }
        });
        System.out.println("\nOrdenado inversamente por apellido: ");
        for (Persona persona : personas) {
            System.out.println(persona.getNombre() + " " + persona.getApellido());
        }

    }
}