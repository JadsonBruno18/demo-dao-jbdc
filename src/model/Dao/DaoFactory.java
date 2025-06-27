package model.Dao;

import model.Dao.impl.SellerDaoJDBC;

public class DaoFactory {
    public static SellerDao createSallerDao(){
        return new SellerDaoJDBC();

    }
}
