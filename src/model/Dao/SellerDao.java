package model.Dao;

import entities.Department;
import entities.Seller;

import java.util.List;

public interface SellerDao {
    void insert (Seller obj);
    void update (Seller obj);
    void deleteByid (Integer id);
    Seller fibdByid (Integer id); // vai ser responsavel por verificar se esse ID existe, senão existir vai retornar nulo
    List<Seller> findAll();
}
