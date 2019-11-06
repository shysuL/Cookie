package cookie;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/cookie/view")
public class CookieViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
//		System.out.println("/cookie/view [GET]");
		
		// /WEB_INF/views/cookie/view.jsp 로 view 지정하기
		
		req.getRequestDispatcher("/WEB-INF/views/cookie/view.jsp")
			.forward(req, resp);
		
	}

}
