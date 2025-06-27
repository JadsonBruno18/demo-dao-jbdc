package application;

import entities.Department;
import entities.Seller;

import java.util.Date;

public class Program {
    public static void main(String[] args) {
        Department obj = new Department(1,"Books");
        Seller seller = new Seller(12, "Joao", "joao@hotmail.com", new Date(), 5000.00, obj);
        System.out.println(seller);

    }
}
