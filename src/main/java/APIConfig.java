package main.java;

import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.ApplicationPath;

/**
 * Created by magnus
 */
@ApplicationPath("/API/*")
public class APIConfig extends ResourceConfig {
}
