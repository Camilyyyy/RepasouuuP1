import java.util.LinkedList;
import java.util.Queue;

public class ColaA00101879 {
    //     2. Cree una nueva Clase Cola e incluya en el nombre su código Banner
   //// A. Cree un método dentro de la clase Cola para encolar de manera predefinida 6 Elementos, de los cuales el primero será invocado al constructor por defecto creado anteriormente y los 5 restantes valores “quemados” invocando al constructor con parámetros. Este método será invocado desde el Constructor de la Clase Cola y mostrarlo en la interfaz gráfica.
   // B. Se necesita un método de inserción de MANERA GRÁFICA (encolado) de tal manera que los elementos insertados sean únicos con respecto al código, es decir, no puede existir en la cola 2 Personas que tengan el mismo código. Emitir un mensaje al usuario diciendo que no se puede insertar dicho elemento por código duplicado.
   // C. Ordenar de mayor a menor edad los elementos generando así la prioridad y mostrarlos en la Interfaz gráfica.
    //D. Realice un método dentro de la Clase Cola de tal manera que como tipo de dato de retorno tenga un nuevo Listado tipo COLA  y  devuelva en esta nueva Cola todas las mujeres mayores
  //  o iguales a 25 años. Se pide que la Cola original no pierda ningún elemento y mostrarlo en la interfaz gráfica. NotasCompruebe que su método inserción funcione de acuerdo a lo solicitado y no se realiceninserciones considerando todos los diferentes casos. Mismos códigos al inicio, mismos

    private Queue<PersonaSolorzano> cola;

    public ColaA00101879() {
        cola = new LinkedList<PersonaSolorzano>();
        incendio();
    }

    public Queue mujereslist(){
        Queue<PersonaSolorzano> colaaa=new LinkedList<PersonaSolorzano>();
        for (PersonaSolorzano nala :colaaa){
            if (nala.getEdad()>=25 && nala.getGenero().equalsIgnoreCase("mujer")){
                colaaa.add(nala);
            }
        }
        return colaaa;
    }


    public String imprimirM(){
        StringBuilder sb=new StringBuilder();
        for (PersonaSolorzano blue :cola){
            if (cola.){

            }
            sb.append(blue.toString());
        }
        return sb.toString();
    }
    public void add(PersonaSolorzano camily){
        cola.add(camily);
    }

    public String imprimir(){
        StringBuilder sb=new StringBuilder();
        for (PersonaSolorzano blue :cola){
            sb.append(blue.toString());
        }
        return sb.toString();
    }

    public void incendio(){
        cola.add(new PersonaSolorzano(1,"Camil0",21,"hombre"));
        cola.add(new PersonaSolorzano(2,"Camily",21,"mujer"));
        cola.add(new PersonaSolorzano(3,"Camila",52,"mujer"));
        cola.add(new PersonaSolorzano(4,"Andres",20,"hombre"));
        cola.add(new PersonaSolorzano(5,"Stefania",20,"mujer"));
        cola.add(new PersonaSolorzano(6,"Juan",90,"hombre"));
    }
}
