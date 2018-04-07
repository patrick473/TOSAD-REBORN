package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class generateDAO extends BaseDAO{

    public boolean implementbr(String query){
        int added = 0;

        try (Connection con = super.getToolConnection()) {

            Statement stmt = con.createStatement();
           added = stmt.executeUpdate(query);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return added==1;
    }
    public boolean deletebrfromtarget(String name){
        int deleted = 0;

        try (Connection con = super.getToolConnection()) {

            Statement stmt = con.createStatement();
            deleted = stmt.executeUpdate("drop trigger "+name);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return deleted==1;
    }
}
