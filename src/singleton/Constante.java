package singleton;

public class Constante{
    private static Constante instancia;

    private String nombreConstante;
    private double valorConstante;

    // Constructor
    private Constante(){
        nombreConstante = "N/A";
        valorConstante = 0;
    }

    // Metodo de acceso unico a crear la instancia
    public static Constante getInstance(){
        if(instancia == null){
            instancia = new Constante();
            System.out.println("Instancia creada por primer y unica vez");
        }
        return instancia;
    }

    // Metodos
    public String toString(){
        return "Nombre constante: "+nombreConstante+" con valor "+valorConstante;
    }
    
    public void setDatos(String name, double value){
        this.nombreConstante = name;
        this.valorConstante = value;
    }
}