public class PersonaSolorzano {
   // En dicha clase cree 4 atributos: codigo (int), nombre (String), edad (int), genero (String)el género solo almacena (HOMBRE - MUJER).
    //  Cree 2 CONSTRUCTORES el primeroes un constructor por defecto que va a inicializar los 4 atributos con sus datos personales.
   //     y el segundo constructor será un constructor con los 4 parámetros.
    private int codigo;
    private String nombre;
    private int edad;
    private String genero;

    public PersonaSolorzano() {
    }
    public PersonaSolorzano(int codigo, String nombre, int edad, String genero) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "PersonaSolorzano{" +
                "codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", genero='" + genero + '\n' +
                '}';
    }
}
