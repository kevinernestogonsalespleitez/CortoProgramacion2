package corto1;

public class Estudiante {
    private String Nombre;
    private String Apellido;
    private String Carnet;
    public Estudiante(){
        this.Nombre = "";
        this.Apellido = "";
        this.Carnet = "";
    }
    public void setNombre(String n){
        Nombre = n;
    }
    public String getNombre(){
        return Nombre;
    }
    public void setApellido(String n){
        Apellido = n;
    }
    public String getApellido(){
        return Apellido;
    }
    public void setCarnet(String n){
        Carnet = n;
    }
    public String getCarnet(){
        return Carnet;
    }
    
}
