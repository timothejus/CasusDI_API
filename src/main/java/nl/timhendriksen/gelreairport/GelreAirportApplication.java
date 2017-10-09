package nl.timhendriksen.gelreairport;

/**
 * Created by tim_h on 14-4-2017.
 */

import io.dropwizard.Application;
import io.dropwizard.jdbi.DBIFactory;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import nl.timhendriksen.gelreairport.DB.VluchtDAO;
import nl.timhendriksen.gelreairport.resources.VluchtResource;
import org.skife.jdbi.v2.DBI;

public class GelreAirportApplication extends Application<GelreAirportConfiguration> {

    public static void main(String[] args) throws Exception {
        new GelreAirportApplication().run(args);
    }

    @Override
    public void initialize(Bootstrap<GelreAirportConfiguration> bootstrap) {
        // nothing to do yet
    }

    @Override
    public void run(GelreAirportConfiguration gelreAirportConfiguration,
                    Environment environment) throws Exception {

        final DBIFactory factory = new DBIFactory();
        final DBI jdbi = factory.build(environment, gelreAirportConfiguration.getDataSourceFactory(), "Gelre-Airport");

        final VluchtDAO vluchtDAO = jdbi.onDemand(VluchtDAO.class);
        final VluchtResource vluchtResource = new VluchtResource(vluchtDAO);

        environment.jersey().register(vluchtResource);
    }
}

