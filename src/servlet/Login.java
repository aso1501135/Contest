package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.UserDAO;
import model.User;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String path =null;
	boolean flg;
	User user = new User();
	UserDAO userdao = new UserDAO();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//学生IDとパスワードの取り出し
		HttpSession session = request.getSession();

		int userId = Integer.parseInt(request.getParameter("userid"));
		String password = request.getParameter("pass");


		//学生IDとパスワードが合っているのか確認
		flg = userdao.getUser(userId,password);


		//flg判断
		if(flg == true){
		//合っていたらG202にとぶ
			path = "G202sample.jsp";

		}else{
			//合ってなかったらG201に戻る
			request.setAttribute("errorMessage","学生Idまたはパスワードが違います。");
			path = "G201.jsp";
		}
		RequestDispatcher rd = request.getRequestDispatcher(path);
		rd.forward(request, response);
	}
}