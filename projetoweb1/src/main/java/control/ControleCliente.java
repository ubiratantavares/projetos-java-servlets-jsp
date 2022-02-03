package control;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Cliente;
import persistence.ClienteDao;

public class ControleCliente extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
    public ControleCliente() {

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().print("Não é permitido acesso pelo método GET");
		response.sendRedirect("index.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		execute(request, response);
	}

	private void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			Cliente cliente = new Cliente(request.getParameter("nome"), 
										  request.getParameter("email"),
										  request.getParameter("tipo"),
										  request.getParameter("id"));			
			ClienteDao clienteDao = new ClienteDao();
			clienteDao.create(cliente);			
			request.setAttribute("cliente", cliente);
			request.setAttribute("mensagem", String.format("Cliente %s cadastrado com sucesso", cliente.getNome()));
			request.getRequestDispatcher("respostacadastro.jsp").forward(request, response);
			
		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("mensagem", String.format("Erro: %s", e.getMessage()));
			request.getRequestDispatcher("errocadastro.jsp").forward(request, response);
		}
	}
}
