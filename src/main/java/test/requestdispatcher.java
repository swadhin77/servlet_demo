package test;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/demo")
public class requestdispatcher extends GenericServlet
{
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException 
	{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		String nm=req.getParameter("name");
		String fnm=req.getParameter("fname");
		String mnm=req.getParameter("mname");
		pw.println("Name : "+nm+"<br>");
		pw.println("Father's Name : "+fnm+"<br>");
		pw.println("Mother's Name : "+mnm+"<br>");
	}

}
