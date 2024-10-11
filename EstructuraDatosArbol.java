
package estructuradatosarbol;


public class EstructuraDatosArbol {
    static class Nodo{
            int valor;
            Nodo izquierda, derecha;
 
            public Nodo(int valor) {
                this.valor = valor;
                izquierda = derecha = null;
            }
        }
 
    public static void main(String[] args) {
        Nodo raiz = new Nodo(7);
        raiz.izquierda = new Nodo(3);
        raiz.derecha = new Nodo(10);
        raiz.izquierda.izquierda = new Nodo(1);
        raiz.izquierda.derecha = new Nodo(4);
        System.out.println("Impresion del Arbol ");
        imprimirArbol(raiz,"", true);
    }
        static void imprimirArbol(Nodo nodo, String prefijo, boolean esUltimo){
            if(nodo !=null){
                System.out.println(prefijo+ (esUltimo ? "└── " : "├── ")+nodo.valor);
                String nuevoPrefijo = prefijo + (esUltimo? "    ": "│   ");
                imprimirArbol(nodo.izquierda, nuevoPrefijo, false);
                imprimirArbol(nodo.derecha, nuevoPrefijo, true);
            }
        }
}
