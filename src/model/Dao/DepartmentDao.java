package model.Dao;

import entities.Department;

import java.util.List;

public interface DepartmentDao {

    void insert (Department obj);
    void update (Department obj);
    void deleteByid (Integer id);
    Department fibdByid (Integer id); // vai ser responsavel por verificar se esse ID existe, senão existir vai retornar nulo
    List <Department> findAll();

}
