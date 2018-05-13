/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LABO08
 */
public class AccesoDatos {

	private Connection _connection;

	public List<String> listCustomer(String pais, String ciudad) {
		_connection=ConexionSingleton.getConexion();
		List<String> customer = new ArrayList<String>();

		String sql = "SELECT c.first_name, c.last_name, a.address, "
                + "c.email FROM customer c JOIN address a ON "
                + " a.address_id = c.address_id JOIN city y ON "
                + " a.city_id = y.city_id JOIN country o ON "
                + " y.country_id = o.country_id "
                + " WHERE o.country= ? and y.city = ? ";
		PreparedStatement pstm = null;
		try {
			pstm = _connection.prepareStatement(sql);
            pstm.setString(1, pais);
            pstm.setString(2, ciudad);
            ResultSet resultSet = pstm.executeQuery();
            while (resultSet.next()) {
                String nombre = resultSet.getString(1);
                String apellido = resultSet.getString(2);
                String direccion = resultSet.getString(3);
                String correo = resultSet.getString(4);
                String cadena = nombre + "\n" + apellido + "\n"
                        + direccion + "\n" + correo;
                customer.add(cadena);
            }
		} catch (SQLException e) {
			System.out.println("Error crear la sentencia " + e.getMessage());
		}
		return customer;
	}
}
