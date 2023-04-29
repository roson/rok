package roson.rok.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;
import roson.rok.controller.Hallo;

@Component
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig() {
        register(Hallo.class);
    }
}