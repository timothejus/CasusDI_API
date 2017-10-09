package nl.timhendriksen.gelreairport.mappers;

import nl.timhendriksen.gelreairport.core.Vlucht;
import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class VluchtMapper implements ResultSetMapper<Vlucht>{

         public Vlucht map(int index, ResultSet r, StatementContext statementContext) throws SQLException
        {
            return new Vlucht(
                    r.getInt("vluchtnummer"),
                    r.getString("gatecode"),
                    r.getString("maatchappijcode"),
                    r.getString("luchthavencode"),
                    r.getString("vliegtuigtype"),
                    r.getInt("max_aantal_psgrs"),
                    r.getInt("max_totaalgewicht"),
                    r.getInt("max_ppgewicht"),
                    r.getTimestamp("vertrektijdstip"),
                    r.getTimestamp("aankomttijdstip")
            );
        }
}
