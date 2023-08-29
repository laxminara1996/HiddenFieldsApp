package in.laxmi;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/second")
public class SecondServlet extends HttpServlet {
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	
	HttpSession session = req.getSession(false);
	String name = null;
	if(name!=null && !name.equals("")) {
	 name = (String)session.getAttribute("name");
	}
	PrintWriter pw = resp.getWriter();
	//String name = req.getParameter("name");
	if(session!=null && !session.equals("")) {
		pw.append("second servlet");
	}else {
		pw.append("request  invalid");
	}
	
	
}
}
