public class Programador {

    //Atributos
    String nombre;
    int experiencia;
    int anios;

    public Programador(String nombre, int experiencia) { // constructor
        this.nombre = nombre;
        this.experiencia = experiencia;
    }

    public Programador(int anios) { //sobrecarga de constructore
        this.anios = anios;
    }

    public void progra(){ // metodo
        System.out.println("Mi nombre es "+nombre+" y tengo "+experiencia+" años de experiencia");
    }

    public void progra(int estudios){ //sobrecarga de metodos
        System.out.println("He estudiado "+estudios+" años (Sobrecarga)");
    }
}
