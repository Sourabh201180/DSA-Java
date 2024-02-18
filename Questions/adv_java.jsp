			      Servlet	     ServletConfig
			    	  \              / 
			           \            /
			    	   GenericServlet
			    			 |
			    		HttpServlet
			    			 |
			    		 MyServlet

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
index.jsp

<html>
	<head>
		<meta charset="UTF-8">
		<!--  more meta tags -->
		<title>home page</title>
	</head>
	<body>
		<h1>Index page</h1>

		<a href="act.do">Link to next page</a>
	</body>
</html>


//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
ActionServlet.java

package servlets;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@webServlet("act.do")
public class ActionServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse) throws IOException, ServletException {
		HttpSession session = request.getSession();

		Integer age = Integer.parseInt(request.getParameter("age"));
		String name = request.getParameter("name");

		System.out.println(name + " ~ " + age);

		response.sendRedirect("next.jsp");
		request.getDispatcher("next.jsp").send(request, response);
	}
}


///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
web.xml

<web-app>
	<servlet>
		<servlet-name>app001</servlet-name>
		<servlet-class>ActionServlet</servlet-class>
	</servlet>
	<servlet-mapping>
		<servlet-name>app001</servlet-name>
		<url-pattern>/act.do</url-pattern>
	</servlet-mapping>
</web-app>


////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
package servlets;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import javax.servlet.ServletException;
import java.io.PrintWriter;

@WebServlet("act.do");
public class ActionServlet extends HttpServlet {
	public void init() throws ServletException {
		System.out.println("++++++++++");
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		response.setContentType("text/html");

		PrintWriter pw = response.getWriter();
		pw.write("<h1>hello Everyone</h1>");
		pw.write("<br>");
		pw.write("<hr>");
		pw.write("<br>");
		pw.write("<h1>Tata Bye-Bye</h1>");

		pw.flush();
		pw.close();
	}

	public void destroy() {
		System.out.println("------------------");
	}
}