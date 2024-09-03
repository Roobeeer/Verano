package T1.Pueblo;

public class Persona {

    private String DNI, nombre, apellidos;
    private Direccion direccion;

    public Persona(String DNI, String nombre, String apellidos, Direccion direccion){
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
    }

    public String getDNI(){
        return DNI;
    }

    public String getNombre(){
        return nombre;
    }

    public String getApellidos(){
        return apellidos;
    }

    public Direccion getDireccion(){
        return direccion;
    }

    public void setDNI(String DNI){
        this.DNI = DNI;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos){
        this.apellidos = apellidos;
    }

    public void setDireccion(Direccion direccion){
        this.direccion = direccion;
    }

    public boolean esVecino(Persona p){
        return direccion.mismoEdificio(p.getDireccion());
    }

    public boolean viveCon(Persona p){
        return direccion.equals(p.getDireccion());
    }

    public boolean equals(Object o){
        Persona p = (Persona) o;

        return DNI.equals(p.getDNI());
    }

    @Override
    public String toString(){
        return "Nombre : "+nombre+" || Apellidos : "+apellidos+" || DNI "+DNI+" || Direccion"+direccion;
    }




}
