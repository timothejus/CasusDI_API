package nl.timhendriksen.gelreairport.resources;

import nl.timhendriksen.gelreairport.DB.VluchtDAO;
import nl.timhendriksen.gelreairport.core.Vlucht;


import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/vlucht")
@Consumes({MediaType.APPLICATION_JSON})
@Produces({MediaType.APPLICATION_JSON})
public class VluchtResource {

        private VluchtDAO vluchtDAO;

        public VluchtResource(VluchtDAO vluchtDAO) {
            this.vluchtDAO = vluchtDAO;
        }

        @GET
        public List<Vlucht> getAll(){
            return vluchtDAO.getAll();
        }


}
