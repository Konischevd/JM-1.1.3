package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserService u1 = new UserServiceImpl();

        u1.createUsersTable();

        u1.saveUser("Dimas", "Konischev", (byte) 27);
        u1.saveUser("Ilya", "Trifon", (byte) 26);
        u1.saveUser("Antonio", "Votin", (byte) 28);
        u1.saveUser("Putin", "Vor", (byte) 99);

        System.out.println(u1.getAllUsers());

        u1.cleanUsersTable();

        u1.dropUsersTable();
    }
}
