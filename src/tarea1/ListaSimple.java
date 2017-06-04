/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea1;

/**
 *
 * @author Mario
 */
public class ListaSimple {

    /**
     * <h4>add</h4>
     * <p>
     * Añade Strings de forma que se comparan y quedan de forma ordena</p>
     *
     *
     * @return true si se añade.
     */
    public boolean add(String dato) {
        Nodo nuevo = new Nodo(dato);
        Nodo aux = cabeza;

        if (size == 0) {
            cabeza = nuevo;
            ultimo = nuevo;

        } else if (dato.compareTo(cabeza.getDato()) < 0) {
            nuevo.setSig(aux);
            cabeza = nuevo;

        } else if (dato.compareTo(ultimo.getDato()) > 0) {
            ultimo.setSig(nuevo);
            ultimo = nuevo;

        } else {
            int cont = 0;
            while (aux.getSig() != null && cont < size) {

                if (dato.compareTo(aux.getSig().getDato()) <= 0) {
                    nuevo.setSig(aux.getSig());
                    aux.setSig(nuevo);
                    break;

                }

                aux = aux.getSig();
                cont++;
            }

        }
        size++;
        return true;

    }

    /**
     * <h4>menoresNormal</h4>
     * <p>
     * Obtiene los dos Strings menores de la lista de Strings.</p>
     *
     *
     * @return una variable que contiene los dos Strings.
     */
    public String menoresNormal() {
        String menor = " ";
        String menor2 = " ";
        String resultado = "";
        Nodo aux = cabeza;
        int cont = 0;

        while (cont < size) {
            if (menor == " " && menor2 == " ") {
                menor = aux.getDato();
                menor2 = aux.getDato();
            } else if ((menor.compareTo(aux.getDato())) > 0) {
                menor = aux.getDato();
            } else if (menor.compareTo(menor2) >= 0) {
                menor2 = aux.getDato();

            }

            aux = aux.getSig();
            ++cont;
        }
        resultado = "Los elementos menores son : " + menor + " - " + menor2;
        return resultado;
    }

    /**
     * <h4>toString</h4>
     * <p>
     * Concatena los elementos de una lista</p>
     *
     *
     * @return un String con todos los elementos de la lista.
     */
    public String toString() {
        String resultado = "";

        Nodo aux = cabeza;

        for (int i = 0; i < size; i++) {
            resultado += "   " + aux.getDato() + "  ";
            aux = aux.getSig();

        }

        return resultado;
    }

    /**
     * <h4>invertirLista</h4>
     * <p>
     * Toma una lista simple e invierte el orden de sus nodos.</p>
     *
     *
     * @return true si se realiza.
     */
    public boolean invertirLista() {
        if (cabeza != null && cabeza.getSig() != null) {
            Nodo aux = cabeza.getSig();
            Nodo mov = aux.getSig();
            cabeza.setSig(null);
            while (aux != null) {
                aux.setSig(cabeza);
                cabeza = aux;
                aux = mov;
                if (mov != null) {

                    mov = mov.getSig();
                }

            }
            aux = cabeza;

        }

        return true;
    }

    public Nodo getCabeza() {
        return cabeza;
    }

    public void setCabeza(Nodo cabeza) {
        this.cabeza = cabeza;
    }

    public Nodo getUltimo() {
        return ultimo;
    }

    public void setUltimo(Nodo ultimo) {
        this.ultimo = ultimo;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    private Nodo cabeza;
    private Nodo ultimo;
    private int size;
    private int realSize;

    public ListaSimple() {
        this.cabeza = null;
        this.size = 0;
        this.ultimo = null;
        this.realSize = 0;
    }

}
