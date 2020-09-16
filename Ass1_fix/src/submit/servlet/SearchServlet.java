package submit.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Vector;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import javafx.scene.control.DatePicker;

public class SearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	SimpleDateFormat ft = new SimpleDateFormat ("MM/dd/yyyy");
	SubmitServlet obj = new SubmitServlet();
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		/*********************************************************/	
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();

		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<body>");

		String nameSearch = request.getParameter("nameFind");
		String dateSearch = request.getParameter("dateFind");
		/*
		 * if (search1.equals("SEARCH-NAME")) { String name =
		 * request.getParameter("nameFind"); for (Message j : n1) { if
		 * (j.getName().equalsIgnoreCase(name)) { out.print(j.getName() + "'s message: "
		 * + j.getMess() + " AT " + j.getDate() + "<br>");
		 * 
		 * } } } else { String date = request.getParameter("dateFind");
		 * System.out.println(date); for (Message i : n1) {
		 * System.out.println(ft.format(i.getDate()).toString());
		 * 
		 * if (ft.format(i.getDate()).toString().equals(date)) {
		 * out.println("Messages in " + date + ": " + i.getMess() + "<br>"); } } }
		 */
		
		for(int i=0; i<obj.list.getVector().size(); i++) {
			if(obj.list.getVector().get(i).getName().equalsIgnoreCase(nameSearch)) {
				out.println(obj.list.getVector().get(i).printOut());
			}
			else if(obj.list.getVector().get(i).getDate().equals(dateSearch)) {
				out.println(obj.list.getVector().get(i).printOut());
			}
			else {
				out.println("<p>No results</p>");
			}
		}
		
		out.println("<a href='index.html'>Back</a>");
		
		out.println("<a href='search.html'>search</a>");
		out.println("</body>");
		out.println("</html>");
		out.close();

	}

}
