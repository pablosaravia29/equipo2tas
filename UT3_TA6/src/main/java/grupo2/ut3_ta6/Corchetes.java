package grupo2.ut3_ta6;

public class Corchetes {

    public static boolean controlCorchetes(String listaDeEntrada) {
        Pila<String> pila = new Pila<>();
        for (int i = 0; i < listaDeEntrada.length(); i++) {
            if (listaDeEntrada.charAt(i) == '{') {
                pila.apilar(new Nodo<String>("{", null));
            } else if (listaDeEntrada.charAt(i) == '}') {
                if (pila.esVacia()) {
                    return false;
                } else {
                    pila.desapilar();
                }
            }

        }

        return (pila.esVacia());
    }

}
