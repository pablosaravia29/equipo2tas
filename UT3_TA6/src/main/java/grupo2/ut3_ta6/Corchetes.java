package grupo2.ut3_ta6;

public class Corchetes {
    
    public boolean controlCorchetes(Character [] listaDeEntrada){
        Pila pila = new Pila<Character>();
        for (int i = 0; i < listaDeEntrada.length; i++) {
            if(listaDeEntrada[i] == '{'){
                pila.apilar(listaDeEntrada[i]);
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
        return false;
    }
}
