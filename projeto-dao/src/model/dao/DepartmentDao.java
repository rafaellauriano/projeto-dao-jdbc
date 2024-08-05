package model.dao;

import java.util.List;

import model.entities.Department;

public interface DepartmentDao {
	
	void insert(Department obj);
	void update(Department obj);
	void deleteById(Integer id);
	Department findById(Integer id);//responsável por consultar o id no banco de dados, se não existir retorna nulo
	List<Department> findAll();//retorna todos os departamento
}
