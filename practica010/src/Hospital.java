import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Hospital {
    List<Paciente> listaPacientes;
    Map<Integer, Medico> mapaMedicos;
    
    public Hospital() {
        listaPacientes = new ArrayList<>();
        mapaMedicos = new HashMap<>();
    }
    
    public void registrarPaciente(Paciente paciente) {
        listaPacientes.add(paciente);
    }
    
    public void eliminarPaciente(int posicion) {
        if (posicion >= 0 && posicion < listaPacientes.size()) {
            listaPacientes.remove(posicion);
        } else {
            System.out.println("La posición ingresada es inválida");
        }
    }
    
    public void modificarPaciente(int posicion, Paciente nuevoPaciente) {
        if (posicion >= 0 && posicion < listaPacientes.size()) {
            listaPacientes.set(posicion, nuevoPaciente);
        } else {
            System.out.println("La posición ingresada es inválida");
        }
    }
    
    public double mostrarPesoMasRepetido() {
   
        return 0;
       
    }
    
    public int mostrarCantidadPacientesConPesoRepetido() {
       
        return 0;
 
    }
    
    public void mostrarPesoMayorMenor() {
     
    }
    
    public void dividirRangoPesos() {
      
    }
    
    public void mostrarListaPacientesOrdenados() {
       
    }
    
    public Medico getMedicoAtendioPaciente(Paciente paciente) {
        return paciente.getMedicoAsignado();
    }
    
    public List<Medico> buscarDoctoresPorEspecialidad(String especialidad) {
        List<Medico> doctoresEspecialidad = new ArrayList<>();
        
        for (Medico medico : mapaMedicos.values()) {
            if (medico.getEspecialidad().equals(especialidad)) {
                doctoresEspecialidad.add(medico);
            }
        }
        
        return doctoresEspecialidad;
    }
}


