package co.edu.uniquindio.GestordeContactos.modelo;

import java.time.LocalDate;
import java.util.ArrayList;

public class GestorPrincipal {

    private ArrayList<Contacto> contactos = new ArrayList<>();

    public void agregarContacto(String nombre, String apellido, String numTelefono, LocalDate fechaCumpleanios,
                                String correoElectronico, String urlFoto) throws Exception {
        if(nombre.isBlank() || numTelefono.isBlank()){
            throw new Exception("El nombre y el Numero de Telefono son obligatorios");
        }
        Contacto contacto = new Contacto(nombre,apellido,numTelefono,fechaCumpleanios,correoElectronico,urlFoto);
        contactos.add(contacto);
    }

    public ArrayList<Contacto> listarContactos(){
        return contactos;
    }

}