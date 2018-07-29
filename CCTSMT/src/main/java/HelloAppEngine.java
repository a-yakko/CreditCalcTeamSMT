import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(
    name = "HelloAppEngine",
    urlPatterns = {"/calc"}
)
public class HelloAppEngine extends HttpServlet {

  @Override
  public void doGet(HttpServletRequest req, HttpServletResponse res) 
      throws IOException {

    res.setContentType("text/plain");
    res.setCharacterEncoding("UTF-8");

   
	
  }
  public void doPost(HttpServletRequest req, HttpServletResponse res)
          throws ServletException, IOException {
	  res.setContentType("text/html");
	  res.setCharacterEncoding("UTF-8");
	  PrintWriter out = res.getWriter();
	  out.println("<H1>計算結果</H1>");
	  int hissyusentakusum = 0;
	  
	    out.println("  <LI>必修科目 : <BR>");
	    String hissyu2[] = req.getParameterValues("必修科目2");
	    if (hissyu2 != null) {
	      for (int i = 0; i < hissyu2.length; i++) {
	    	  hissyusentakusum = hissyusentakusum + 2;
	        out.println(hissyu2[i] + "<BR>");
	      }
	    }
	    String hissyu3[] = req.getParameterValues("必修科目3");
	    if (hissyu3 != null) {
	      for (int i = 0; i < hissyu3.length; i++) {
	    	  hissyusentakusum = hissyusentakusum + 3;
	        out.println(hissyu3[i] + "<BR>");
	      }
	    }
	    String hissyu4[] = req.getParameterValues("必修科目4");
	    if (hissyu4 != null) {
	      for (int i = 0; i < hissyu4.length; i++) {
	    	  hissyusentakusum = hissyusentakusum + 4;
	        out.println(hissyu4[i] + "<BR>");
	      }
	    }
	    String sentaku[] = req.getParameterValues("選択科目");
	    out.println("  <BR><LI>選択科目 : <BR>");
	    if (sentaku != null) {
	      for (int i = 0; i < sentaku.length; i++) {
	    	  hissyusentakusum = hissyusentakusum + 3;
	        out.println(sentaku[i] + "<BR>");
	      }
	    }
		String jiyuStr = req.getParameter("自由科目");
		int jiyu = Integer.parseInt(jiyuStr);
		out.println("  <BR><LI>自由科目 : <BR>");
		out.println("自由科目単位数"+jiyu+ "<BR>");
		int sum = hissyusentakusum + jiyu;
		String msg = "単位は合計"+sum+"です。";
	    //クライアントに送るHTML
	    out.println("<!DOCTYPE HTML>");
	     out.println("<HTML>");
	    out.println("<HEAD>");
	    out.println("<TITLE>SignUp Data</TITLE>");
	    out.println("</HEAD>");
	    out.println("<BODY>");
	    
	    out.println("<BR><BR>");
	
	    //Form情報を取得
	    //複数選択のForm情報を取得する
	    
	      out.println(msg);
	    

	  

	  
	    out.println("</BODY>");
	    out.println("</HTML>");
	    out.close();
  }
}