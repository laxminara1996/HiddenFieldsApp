package in.laxmi;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/first")
public class FirstServlet extends HttpServlet {
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	
	resp.setContentType("text/html");
	//new session object will be created
	HttpSession session = req.getSession();
	session.setAttribute("name", "ashok");
	PrintWriter pw = resp.getWriter();
	pw.append("session created");
	//url re-direction
	resp.sendRedirect("http://localhost:8086/HidddenFieldsApp/second");
	//hiddenformfield
	/*pw.append("first servlet");
	pw.print("<form action=\"second\">");
	pw.print("<input type=\"hidden\" name=\"name\" value = \"laxmi\" />");
	pw.print("<input type=\"submit\" value=\"submit\" />");
	pw.print("</from>");*/
}
}
