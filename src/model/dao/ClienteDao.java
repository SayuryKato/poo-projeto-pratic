package model.dao;

import java.util.List;

import model.entities.Cliente;
import model.entities.Telefone;

public interface ClienteDao {
	
	void insert(Cliente obj);
	void update(Cliente obj);
	void deleteById(Integer id);
	Cliente findById(Integer id);
	List<Cliente> findAll();

}
