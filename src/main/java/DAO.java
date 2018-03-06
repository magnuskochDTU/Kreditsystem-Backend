package main.java;

import java.sql.SQLException;

/**
 * Created by magnus
 */
public interface DAO {
    void update(Object object) throws SQLException;
    void create(Object object) throws SQLException;
    void delete(int id) throws SQLException;
    void get(int id) throws SQLException;
    void getAll() throws SQLException;
}
