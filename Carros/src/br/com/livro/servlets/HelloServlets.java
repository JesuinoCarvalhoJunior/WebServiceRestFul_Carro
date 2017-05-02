package br.com.livro.servlets;

import java.io.IOException;
import java.rmi.ServerException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class HelloServlets extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServerException, IOException {
		//resp.getWriter().print("Ol� mundo ServLets");
		
		String nome = req.getParameter("pnome");
		String sobrenome = req.getParameter("psobrenome");
		
		if (sobrenome == null ){
			sobrenome = "Sobrenome n�o informado";
		}
		resp.getWriter().print("Ol� mundo GET "+ nome + " " + sobrenome);
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServerException, IOException {
		//resp.getWriter().print("Ol� mundo ServLets");
		
		String nome = req.getParameter("pnome");
		String sobrenome = req.getParameter("psobrenome");
		if (sobrenome.isEmpty() ){
			sobrenome = "Sobrenome n�o informado";
		}
		resp.getWriter().print("Ol� mundo POST "+ nome + " " + sobrenome);
		
	}
	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp)
			throws ServerException, IOException {
		//resp.getWriter().print("Ol� mundo ServLets");
		
		String nome = req.getParameter("pnome");
		String sobrenome = req.getParameter("psobrenome");
		
		resp.getWriter().print("Ol� mundo PUT "+ nome + " " + sobrenome);
		
	}
	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp)
			throws ServerException, IOException {
		//resp.getWriter().print("Ol� mundo ServLets");
		
		String nome = req.getParameter("pnome");
		String sobrenome = req.getParameter("psobrenome");
		
		resp.getWriter().print("Ol� mundo DELETE "+ nome + " " + sobrenome);
		
	}
}
