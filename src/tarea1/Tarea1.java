package tarea1;

/**
 *
 * @author Mario
 */
public class Tarea1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Mae el ejercicio 1 no lo logre. 
        //Yo se que no sirve de mucho pero entonces lo cambie por el addsorted
        ListaSimple simple = new ListaSimple();

        simple.add("3");
        simple.add("1");
        simple.add("5");
        simple.add("!");
        simple.add("a");
        simple.add("z");
        simple.add("A");
        simple.add("2");
        System.out.println(simple.toString());

        System.out.println(simple.menoresNormal());
        simple.invertirLista();
        System.out.println("La lista invertida es : " + simple.toString());

    }

}
