package org.example;

import org.example.api.Resource;
import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.ApplicationPath;

@ApplicationPath("/")
public class App extends ResourceConfig {
	public App() {
		register(Resource.class);
	}
}
