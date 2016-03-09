package bg.jwd.servlets;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bg.jwd.ejb.*;

@WebServlet("/BankOperation")
public class BankOperation extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@EJB
	private WebBank webBank;

	protected void doGet(HttpServletRequest request, HttpServletResponse responce)
			throws ServletException, IOException {

	}

	public void doPost(HttpServletRequest request, HttpServletResponse responce) 
			throws ServletException, IOException {

		String client = request.getParameter("client");
		String operation = request.getParameter("operation");
		Double amount = Double.parseDouble(request.getParameter("amount"));
		String currency = request.getParameter("currency");
		Double currentAmount;
		
		//D - deposit
		//W - withdraw
		if("D".equals(operation) ){
			currentAmount = webBank.deposit(client, amount, currency);
		}else{
			currentAmount = webBank.withDraw(client, amount, currency);
		}
		
		RequestDispatcher dispacher = getServletContext().getRequestDispatcher("/BankOperations.jsp");
		request.setAttribute("client", client);
		request.setAttribute("currentAmount", currentAmount);
		dispacher.forward(request, responce);

	}

}
