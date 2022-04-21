package grupo2.ut3_ta6;

public class Corchetes {

    public static boolean controlCorchetes(Character[] listaDeEntrada){
        Pila<Character> pila = new Pila<Character>();
        for(int i = 0; i < listaDeEntrada.length; i++){
            if(listaDeEntrada[i] == '{'){
                pila.apilar(new Nodo<Character>('{', null));
            }
            else if(listaDeEntrada[i] == '}'){
                if(pila.esVacia()){
                    return false;
                }
                else{
                    pila.desapilar();
                }
            }
        }
        if(pila.esVacia()){
            return true;
        }
        else{
            return false;
        }
    }
}

