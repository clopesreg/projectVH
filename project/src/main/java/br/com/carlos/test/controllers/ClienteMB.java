package br.com.carlos.test.controllers;

import java.io.Serializable;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.carlos.test.dao.ClienteDAO;
import br.com.carlos.test.models.Cliente;

@ManagedBean
@ViewScoped
public class ClienteMB implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6796814126050126265L;

	@EJB
	private ClienteDAO dao;

	private Cliente cliente = new Cliente();

	
	public List<Cliente> getClientes() {
		return dao.listarTodos();
	}

	public void salvar() {
		dao.salvar(cliente);
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}
