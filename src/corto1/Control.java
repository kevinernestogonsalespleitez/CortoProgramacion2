package corto1;

import java.util.ArrayList;

public class Control {
    private ArrayList<String>ListaNombre;
    private ArrayList<String>ListaApellido;
    private ArrayList<String>ListaCarnet;
    
    public Control(ArrayList<String> ListaNombre, ArrayList<String> ListaApellido, ArrayList<String> ListaCarnet) {
        this.ListaNombre = ListaNombre;
        this.ListaApellido = ListaApellido;
        this.ListaCarnet = ListaCarnet;
    }
    public String Buscar(String Carnet){
        int a = 0;
        for(int i = 0; i<this.ListaCarnet.size();i++){
            if(this.ListaCarnet.get(i).equals(Carnet)){
                a=i;
                i = this.ListaCarnet.size();
            }
        }
        String Ncompleto = (this.ListaNombre.get(a)+" "+this.ListaApellido.get(a));
        return Ncompleto;
    }
    public int Editar(String Carnet){
        int a = 0;
        for(int i = 0; i<this.ListaCarnet.size();i++){
            if(this.ListaCarnet.get(i).equals(Carnet)){
                a=i;
                i = this.ListaCarnet.size();
            }
        }
        return a;
    }
    public int Eliminar(String Carnet){
        int a = 0;
        for(int i = 0; i<this.ListaCarnet.size();i++){
            if(this.ListaCarnet.get(i).equals(Carnet)){
                a=i;
                i = this.ListaCarnet.size();
            }
        }
        return a;
    
    }
    public void Ordenar(){
        
    }
}
