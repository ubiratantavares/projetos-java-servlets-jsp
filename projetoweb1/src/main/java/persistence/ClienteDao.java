package persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import model.Cliente;

public class ClienteDao implements IDao {
	
	Connection con;
	PreparedStatement stmt;

	@Override
	public void open() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		// aplicacao em teste
		// "jdbc:mysql://localhost:3306/projetoweb1", "root", "root"
		// aplicacao em producao
		// "jdbc:mysql://mysql44262-dominio-bira.jelastic.websolute.net.br/projetoweb1", "root", "root"
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/projetoweb1?serverTimezone=UTC", "root", "root");		
	}

	@Override
	public void close() throws Exception {
		con.close();		
	}
	
	public void create(Cliente cliente) throws Exception {
		open();
		String sql = "insert into cliente values(null, ?, ?, ?, ?)";
		stmt = con.prepareStatement(sql);
		stmt.setString(1, cliente.getNome());
		stmt.setString(2, cliente.getEmail());
		stmt.setString(3, cliente.getTipo());
		stmt.setString(4, cliente.getId());
		stmt.execute();
		stmt.close();
		close();
	}
}
