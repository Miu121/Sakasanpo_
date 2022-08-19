package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Form
 */
@WebServlet("/form/index")
public class FormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//フォームの表示
		request.getRequestDispatcher("/WEB-INF/view/form.jsp")
		.forward(request, response);
	}
	
	/** 
	 * @see HttpServlet#doPost(HttpServletRequest request, 
	HttpServletResponse response) 
	 */ 
	 protected void doPost(HttpServletRequest request, HttpServletResponse 
	response) throws ServletException, IOException {
		 //文字化け防止
		 request.setCharacterEncoding("UTF-8");
		 
		 //フォームデータの取得
		 String name = request.getParameter("name");
		 String email = request.getParameter("email");
		 String password = request.getParameter("password");
		 
		 //完了画面への表示
		 request.setAttribute("name",name + "");
		 request.setAttribute("email",email);
		 request.setAttribute("password",password);
		 
		 //完了画面の表示
		 request.getRequestDispatcher("WEB-INF/view/form.jsp")
		 .forward(request, response);
	 }
	 
	 

}
