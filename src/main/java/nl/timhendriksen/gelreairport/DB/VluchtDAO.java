package nl.timhendriksen.gelreairport.DB;

import nl.timhendriksen.gelreairport.core.Vlucht;
import nl.timhendriksen.gelreairport.mappers.VluchtMapper;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapper;

import java.util.List;

@RegisterMapper(VluchtMapper.class)
public interface VluchtDAO {

    @SqlQuery("select * from Vlucht")
    List<Vlucht> getAll();

}
