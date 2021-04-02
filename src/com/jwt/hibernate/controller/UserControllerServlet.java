package com.jwt.hibernate.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jwt.hibernate.bean.Pessoa;
import com.jwt.hibernate.dao.UserDAO;

public class UserControllerServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getServletPath();
		if (action.equals("/listar")) {
			listar(request, response);
		} else {
			cadastrar(request, response);
		}
	}

	private void listar(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		UserDAO userDAO = new UserDAO();
		List<Pessoa> lista = userDAO.buscarTodasPessoas();
		request.setAttribute("listaPessoa", lista);
		redirectToLista(request, response);
	}

	private void cadastrar(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		redirectToCadastrar(request, response);
	}

	private void redirectToCadastrar(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("register.jsp");
		dispatcher.forward(request, response);
	}

	private void redirectToLista(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("lista.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println(request.getParameterNames());

		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String city = request.getParameter("city");

		try {
			UserDAO userDAO = new UserDAO();
			userDAO.addUserDetails(userName, password, email, phone, city);
			response.sendRedirect("lista.jsp");
		} catch (Exception e) {
			System.out.println("ERRO AO CADASTRAR USUÁRIO");
			System.err.println(e.getMessage());
			System.err.println(e.getCause());
			System.out.println("ERRO AO CADASTRAR USUÁRIO");
		}
	}
}
