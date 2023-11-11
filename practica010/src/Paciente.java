

public class Paciente {
    private int DNI;
    private String nombre;
    private String direccion;
    private double peso;
    private double temperatura;
    private Medico medicoAsignado;
    
    public Paciente(int DNI, String nombre, String direccion, double peso, double temperatura) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.direccion = direccion;
        this.peso = peso;
        this.temperatura = temperatura;
    }
    
    public int getDNI() {
        return DNI;
    }
    
    public void setDNI(int DNI) {
        this.DNI = DNI;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getDireccion() {
        return direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public double getPeso() {
        return peso;
    }
    
    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public double getTemperatura() {
        return temperatura;
    }
    
    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }
    
    public Medico getMedicoAsignado() {
        return medicoAsignado;
    }
    
    public void setMedicoAsignado(Medico medicoAsignado) {
        this.medicoAsignado = medicoAsignado;
    }
}
