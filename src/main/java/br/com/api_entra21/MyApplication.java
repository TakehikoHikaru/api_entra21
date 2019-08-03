package br.com.api_entra21;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("rest")
public class MyApplication extends ResourceConfig {

	public MyApplication() {
		packages("br.com.api_entra21.controller");
	}
}
