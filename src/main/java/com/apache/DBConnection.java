package com.apache;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class DBConnection {

    private static final Logger LOGGER = LogManager.getLogger(DBConnection.class);

    public static void main(String[] args) throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:mysql://bhdtest.endava.com:3306/petclinic", "root", "root");
        Statement statement = conn.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * from owners");

        while (resultSet.next()) {
            Integer id = resultSet.getInt("id");
            Object firstName = resultSet.getString("first_name");

            LOGGER.info("{} {}", id, firstName);
        }
    }
}
