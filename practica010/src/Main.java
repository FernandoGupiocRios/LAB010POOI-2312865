

import java.util.List;

 class Main {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();

        Medico medico1 = new Medico(1, "Dr. García", "Cardiología");
        Medico medico2 = new Medico(2, "Dra. López", "Pediatría");

        hospital.mapaMedicos.put(medico1.getNumeroColegiatura(), medico1);
        hospital.mapaMedicos.put(medico2.getNumeroColegiatura(), medico2);

        Paciente paciente1 = new Paciente(101, "Juan Pérez", "Calle A #123", 70.5, 37.0);
        Paciente paciente2 = new Paciente(102, "María Gómez", "Calle B #456", 65.2, 36.5);

        paciente1.setMedicoAsignado(medico1);
        paciente2.setMedicoAsignado(medico2);

        hospital.registrarPaciente(paciente1);
        hospital.registrarPaciente(paciente2);

        System.out.println("Lista de pacientes:");
        for (Paciente paciente : hospital.listaPacientes) {
            System.out.println("DNI: " + paciente.getDNI() +
                    ", Nombre: " + paciente.getNombre() +
                    ", Médico Asignado: " + paciente.getMedicoAsignado().getNombre());
        }

        List<Medico> medicosCardiologia = hospital.buscarDoctoresPorEspecialidad("Cardiología");
        System.out.println("\nMédicos de Cardiología:");
        for (Medico medico : medicosCardiologia) {
            System.out.println("Número de Colegiatura: " + medico.getNumeroColegiatura() +
                    ", Nombre: " + medico.getNombre());
        }
    }
}
