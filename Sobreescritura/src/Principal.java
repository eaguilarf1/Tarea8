public class Principal {
    public static void main(String[] args) {

        Programador programador = new Programador(); // Creación del objeto de la clase padre
        Persona persona = new Persona(); // Creción del objeto de la clase hija

        programador.programar(); //Se muestra la informacion de la clase padre
        persona.programar(); // Se muestra la informacion de la clase hija

    }
}
