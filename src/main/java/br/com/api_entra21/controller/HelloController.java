package br.com.api_entra21.controller;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("hello")
public class HelloController {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getMensagem(@QueryParam("usuario") String usuario) {
		return "Bem vindo: " + usuario;
	}
	
}
