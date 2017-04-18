package com.soap.negocio;

import javax.jws.WebMethod;
import javax.jws.WebService;
import com.soap.dominio.Cliente;

@WebService
public class CadastraService {
	
	@WebMethod
	public Cliente cadastrar(String nome, int idade) {
		Cliente cliente = new Cliente();
		
		cliente.setNome(nome);
		cliente.setIdade(idade);
		
		return cliente;
	}
}
