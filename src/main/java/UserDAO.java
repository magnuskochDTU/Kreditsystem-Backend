package main.java;

/**
 * Created by magnus
 */
public class UserDAO {
    /*
    private static Connection connection;

    static{
        try {
            connection = DriverManager.getConnection("kreditsystem-database.czir2ycmcwhq.us-east-2.rds.amazonaws.com","kreditsystem","blueballs");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void update(User user) throws SQLException{
        PreparedStatement updateStatement = connection.prepareStatement("update user set firstname=?, lastname=?,username=?,password=? where id=?");
        updateStatement.setString(1,user.getFirstname());
        updateStatement.setString(2, user.getLastname());
        updateStatement.setString(3, user.getUsername());
        updateStatement.setString(4, user.getPassword());
        updateStatement.setInt(5, user.getId());
        updateStatement.execute();
    }

    public void add(User user) throws SQLException {
        PreparedStatement insertStatement = connection.prepareStatement("insert into user(firstname,lastname,username,password) VALUES(?,?,?,?)");
        insertStatement.setString(1,user.getFirstname());
        insertStatement.setString(2, user.getLastname());
        insertStatement.setString(3, user.getUsername());
        insertStatement.setString(4, user.getPassword());
        insertStatement.execute();
    }

    public void remove(int userID) throws SQLException{
        PreparedStatement deleteStatement = connection.prepareStatement("delete user where id=?");
        deleteStatement.setInt(1, userID);
        deleteStatement.execute();
    }

   public User get(int userID) throws SQLException {
        PreparedStatement singleSelectStatement = connection.prepareStatement("select * FROM user where id=?");
        singleSelectStatement.setInt(1, userID);
        boolean checkResult = singleSelectStatement.execute();
        while (checkResult) {
            ResultSet resultSet = singleSelectStatement.getResultSet();
            String firstname = resultSet.getString(2);
            String lastname = resultSet.getString(3);
            resultSet.close();
            checkResult = singleSelectStatement.getMoreResults();
        }
        //User user = new User(firstname);
        singleSelectStatement.close();
        return user;
    }

    public List<User> getAll() throws SQLException {
        List<User> users;
        return users;
    }*/
}
