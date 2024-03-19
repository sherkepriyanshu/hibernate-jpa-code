import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet{
@Override
protected void doPost(HttpServletRequest req,HttpServletResponse resp)throws ServletException,IOException
{
	
//Fetch UI//Form Data
	String sid = req.getParameter("i");//"1"
	String name = req.getParameter("nm");//"guru"
	String dept = req.getParameter("dp");//"ece"
	String sperc = req.getParameter("pr");//"78.40"
	
	//Presentation Logic //servlet technology
	PrintWriter out = resp.getWriter();
	out.println("<html><bofy bgcolor='yellow'>"
			+"<h1>Student name is "+name+" from "+dept+" </h1>"+
			"</body></html>");
	out.close();
	
	//persistence logic //jdbc technology
	Connection con = null;
	PreparedStatement pstmt = null;
	try
	{
		
	
	Class.forName("com.mysql.jdbc.Driver");
	con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=pass123");                                 
	pstmt = con.prepareStatement("insert into btm.student values(?,?,?,?)");
	pstmt.setInt(1, Integer.parseInt(sid));
	pstmt.setString(2, name);
	pstmt.setString(3,dept);
	pstmt.setString(4,sperc);
	}
	catch
	 (ClassNotFoundException | SqlException e)
	{
		e.printStackTrace();
	}
	
	

}
