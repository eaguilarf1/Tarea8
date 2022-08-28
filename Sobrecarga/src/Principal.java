public class Principal {
    public static void main(String[] args) {

        Programador programador = new Programador("Edward", 2); //Creacion del objeto
        programador.progra(); // se muestra la informacion en pantalla

        Programador programador1 = new Programador(6);
        programador1.progra(6); //Se muestra la informacion sobrecargada
    }
}
