package py.edu.facitec.ejemplo2017.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import py.edu.facitec.ejemplo2017.model.Producto;

@Repository
public class ProductoDao {
	
	@PersistenceContext
	private EntityManager manager;
	
	
	public void save(Producto producto){
		manager.persist(producto);
	}
	
}
