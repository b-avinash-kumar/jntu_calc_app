package ETA_SB.jntu_calc_application;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalculatorServlet
 * 
 */
@WebServlet("/CalcServlet") //added
public class CalculatorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	double res;
    public CalculatorServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) 
    		throws IOException, ServletException 
    	{
    		doPost(request, response);
    	}
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		int n1 = Integer.parseInt(request.getParameter("num1"));
		int n2 = Integer.parseInt(request.getParameter("num2"));
		String opt = request.getParameter("operations");
		
		switch(opt) {
		case "add" : 
			res = new Calculator().doAdd(n1,n2);
			break;
		case "sub" : 
			res = new Calculator().doSub(n1,n2);
			break;
		case "mul" : 
			res = new Calculator().doMul(n1,n2);
			break;	
		case "div" : 
			res = new Calculator().doDiv(n1,n2);
			break;
		}
		out.println(res);
	}

}
