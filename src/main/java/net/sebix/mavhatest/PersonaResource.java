package net.sebix.mavhatest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/persona")
public class PersonaResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Persona get() {
        Persona persona = new Persona();
        persona.setNombre("Juan");
        persona.setApellido("Perez");
        return persona;
    }    
}
