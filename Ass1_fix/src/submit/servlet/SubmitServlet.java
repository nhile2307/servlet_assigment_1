package submit.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Enumeration;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import submit.servlet.Message;

public class SubmitServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	Db list = new Db();
	SimpleDateFormat ft =  new SimpleDateFormat ("yyyy.MM.dd");	


	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Calendar calendar = Calendar.getInstance();
		
		list.getVector().add(new Message(request.getParameter("userName"),
				 			request.getParameter("userMess"), 
				 			ft.format(calendar.getTime())));
		
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<body>");

		  for(int i =0; i< list.getVector().size();i++) {
		  out.println(list.getVector().get(i).printOut()); }

		out.println("<a href='index.html'>Back</a>");
		out.println("<a href='search.html'>search</a>");
		out.println("</body>");
		out.println("</html>");
		out.close();
	}


}

