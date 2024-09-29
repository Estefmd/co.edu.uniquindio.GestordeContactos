package co.edu.uniquindio.GestordeContactos.modelo;

import java.time.LocalDate;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter

public class Contacto {

    private String nombre;
    private String apellido;
    private String numTelefono;
    private LocalDate fechaCumpleanios;
    private String correoElectronico;
    private String urlFoto;

}
