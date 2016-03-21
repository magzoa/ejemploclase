package py.edu.facitec.ejemploclase.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import py.edu.facitec.ejemploclase.model.Cliente;

@Repository
public class ClienteDAO {
	
	@PersistenceContext
	private EntityManager manager;

	
	public void save(Cliente cliente){
		manager.persist(cliente);
	}
	
}
