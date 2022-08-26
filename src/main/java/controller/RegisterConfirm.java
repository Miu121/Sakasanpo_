package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterConfirm
 */
@WebServlet("/registerConfirm")
public class RegisterConfirm extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//確認画面の表示(新規)
		request.getRequestDispatcher("WEB-INF/view/registerConfirm.jsp")
		.forward(request, response);
	}
	
	/*protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//完了画面の表示(新規)
		request.getRequestDispatcher("WEB-INF/view/registerDone.jsp")
		.forward(request, response);
	}*/
}
