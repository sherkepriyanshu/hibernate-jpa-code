package org.jsp.uiApp;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
public class FirstServlet extends GenericServlet
{
	@Override
	public void service(ServletRequest req, ServletResponse resp)
			throws ServletException, IOException
	{
		//Fetch Ui/Form Data
	String name=req.getParameter("nm");//Guru-name
	String place=req.getParameter("pl");//Mysore-Place
	
	//presentation Logic
	PrintWriter out=resp.getWriter();
	out.println(" <html><body bgcolor='yellow'>"+" <h1>Student Name is " +name+" from "+place+" </body></html>");
		out.close();
		
	}

}