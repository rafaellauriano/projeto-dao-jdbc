package model.dao;

import java.util.List;

import model.entities.Seller;

public interface SellerDao {
	
	void insert(Seller obj);
	void update(Seller obj);
	void deleteById(Integer id);
	Seller findById(Integer id);//responsável por consultar o id no banco de dados, se não existir retorna nulo
	List<Seller> findAll();//retorna todos os vendedores

}
