/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.50
 * Generated at: 2020-01-17 07:26:32 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.kh.sjproject.member.model.vo.Member;

public final class mypage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("/WEB-INF/views/member/../common/header.jsp", Long.valueOf(1579073065845L));
    _jspx_dependants.put("/WEB-INF/views/member/sideMenu.jsp", Long.valueOf(1578978751957L));
    _jspx_dependants.put("/WEB-INF/views/member/../common/footer.jsp", Long.valueOf(1578635187476L));
    _jspx_dependants.put("/WEB-INF/views/member/../common/nav.jsp", Long.valueOf(1579238762800L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.kh.sjproject.member.model.vo.Member");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');

	// header.jsp에서 Member가 import 되어있기 때문에 현재 페이지에서 import 불필요
	Member member = (Member)request.getAttribute("member");
	String[] phone = member.getMemberPhone().split("-");
	String[] address = {"-", "-", "-"};
	if(!member.getMemberAddress().equals(",,")) {
		address = member.getMemberAddress().split(", ");
	}
	
	// 관심 분야
	String[] checked = new String[6];
	if(member.getMemberInterest() != null) {
		String[] interests = member.getMemberInterest().split(", ");
		
		for(int i=0; i<interests.length ; i++){
			switch(interests[i]){
			case "운동" : checked[0] = "checked"; break;
			case "영화" : checked[1] = "checked"; break;
			case "음악" : checked[2] = "checked"; break;
			case "요리" : checked[3] = "checked"; break;
			case "게임" : checked[4] = "checked"; break;
			case "기타" : checked[5] = "checked"; break;
			}
		}
	}

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>내정보</title>\r\n");
      out.write("<style>\r\n");
      out.write("\tinput[type=\"number\"]::-webkit-outer-spin-button,\r\n");
      out.write("\tinput[type=\"number\"]::-webkit-inner-spin-button\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t-webkit-appearance: none;\r\n");
      out.write("\t\tmargin: 0;\r\n");
      out.write("\t}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("\r\n");

	String msg = (String)session.getAttribute("msg");
	Member loginMember = (Member)session.getAttribute("loginMember");
	
	// C6) 쿠키 사용을 위한 변수 생성
	boolean save = false; // 아이디 저장 체크박스 값을 수정하기 위한 변수
	String saveId = ""; // 쿠키에 저장된 saveId라는 키가 가지고 있는 값을 저장할 변수
	Cookie[] cookies = request.getCookies(); // 전달받은 쿠키 저장
	
	// 서버 첫 시작시 request.getCookies()의 값이 null
	// -> if문으로 처리하지 않는 경우 페이지 로딩 시 NullPointerException이 발생됨
	if(cookies != null){
		
		for(Cookie c : cookies){
			
			// 쿠키 객체에서 name을 얻어와 그 값이 "saveId"와 같은지 비교 == key, 속성
			if(c.getName().equals("saveId")){
				
				saveId = c.getValue();
				save = true;
			}
		}
	}
	

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta charset=\"UTF-8\">\r\n");
      out.write("\t<meta name=\"viewport\"\r\n");
      out.write("\t\tcontent=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("\t<link rel=\"stylesheet\"\r\n");
      out.write("\t\thref=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\"\r\n");
      out.write("\t\tintegrity=\"sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh\"\r\n");
      out.write("\t\tcrossorigin=\"anonymous\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\t// 로그인 실패 메시지 출력 후\r\n");
      out.write("\t\t// session에 남아있는 \"msg\" 속성 제거\r\n");
      out.write("\t\t");
 if(msg != null) {
      out.write(" // 로그인 실패한 경우\r\n");
      out.write("\t\t\t\talert(\"");
      out.print( msg );
      out.write("\");\r\n");
      out.write("\t\t");
 }
			session.removeAttribute("msg");
		
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<header class=\"blog-header\">\r\n");
      out.write("\t\t<div\r\n");
      out.write("\t\t\tclass=\"row flex-nowrap justify-content-between align-items-center\">\r\n");
      out.write("\t\t\t<div class=\"col-4 pt-1\">\r\n");
      out.write("\t\t\t\t<a class=\"text-muted\" href=\"");
      out.print( request.getContextPath() );
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<!-- 서버ip:8080/sjproject -->\r\n");
      out.write("\t\t\t\t\t<img src=\"https://www.iei.or.kr/resources/images/common/top_logo.jpg\"\r\n");
      out.write("\t\t\t\t\t\theight=\"60px\">\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<!-- 로그인이 되어있지 않은 경우 start -->\r\n");
      out.write("\t\t\t");
 if(loginMember == null) { 
      out.write("\r\n");
      out.write("\t\t\t<div class=\"col-4 d-flex justify-content-end align-items-center\">\r\n");
      out.write("\t\t\t\t<a id=\"modal-120930\" href=\"#modal-container-120930\" role=\"button\"\r\n");
      out.write("\t\t\t\t\tclass=\"btn btn-sm btn-outline-secondary\" data-toggle=\"modal\">로그인</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"modal fade\" id=\"modal-container-120930\" role=\"dialog\"\r\n");
      out.write("\t\t\t\t\taria-labelledby=\"myModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("\t\t\t\t\t<div class=\"modal-dialog\" role=\"document\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"modal-content\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"modal-header\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h5 class=\"modal-title\" id=\"myModalLabel\">로그인 모달창</h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"modal\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span aria-hidden=\"true\">×</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"modal-body\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<form class=\"form-signin\" method=\"POST\" \r\n");
      out.write("\t\t\t\t\t\t\t\taction=\"");
      out.print( request.getContextPath());
      out.write("/member/login.do\"\r\n");
      out.write("\t\t\t\t\t\t\t\tonsubmit=\"return loginValidate();\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" id=\"memberId\" name=\"memberId\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tplaceholder=\"아이디\" value=");
      out.print( saveId );
      out.write("> <br> \r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"password\" class=\"form-control\" id=\"memberPwd\" name=\"memberPwd\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tplaceholder=\"비밀번호\"> <br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"checkbox mb-3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label> <input type=\"checkbox\" id=\"save\" name=\"save\" ");
      out.print( save ? "checked" : "" );
      out.write("> 아이디 저장\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<button class=\"btn btn-lg btn-primary btn-block\" type=\"submit\">로그인</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a class=\"btn btn-lg btn-secondary btn-block\" href=\"");
      out.print(request.getContextPath());
      out.write("/member/signUpForm.do\">회원가입</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"modal-footer\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-secondary\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tdata-dismiss=\"modal\">Close</button>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- 로그인이 되어있지 않은 경우 end -->\r\n");
      out.write("\t\t\t");
 } else { 
      out.write("\r\n");
      out.write("\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"d-flex justify-content-end align-items-center\">\r\n");
      out.write("\t\t\t\t");
      out.print( loginMember.getMemberName() );
      out.write("님 환영합니다. &nbsp;\r\n");
      out.write("\t\t\t\t<a href=\"");
      out.print(request.getContextPath());
      out.write("/member/mypage.do\" role=\"button\" class=\"btn btn-sm btn-outline-secondary\">마이페이지</a>\r\n");
      out.write("\t\t\t\t&nbsp;\r\n");
      out.write("\t\t\t\t<a href=\"");
      out.print(request.getContextPath());
      out.write("/member/logout.do\" role=\"button\" class=\"btn btn-sm btn-outline-secondary\">로그아웃</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</header>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\t// 로그인 유효성 검사\r\n");
      out.write("\t\tfunction loginValidate(){\r\n");
      out.write("\t\t\t// trim() : 문자열 앞뒤 공백 제거\r\n");
      out.write("\t\t\tif( $(\"#memberId\").val().trim().length==0){\r\n");
      out.write("\t\t\t\talert(\"아이디를 입력하세요.\");\r\n");
      out.write("\t\t\t\t$(\"#memberId\").focus();\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tif( $(\"#memberPwd\").val().trim().length==0){\r\n");
      out.write("\t\t\t\talert(\"비밀번호를 입력하세요.\");\r\n");
      out.write("\t\t\t\t$(\"#memberPwd\").focus();\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\treturn true;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\t<script src=\"https://code.jquery.com/jquery-3.4.1.min.js\"\r\n");
      out.write("\t\tintegrity=\"sha256-CSXorXvZcTkaix6Yvo6HppcZGetbYMGWSFlBw8HfCJo=\"\r\n");
      out.write("\t\tcrossorigin=\"anonymous\"></script>\r\n");
      out.write("\t<script\r\n");
      out.write("\t\tsrc=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\"\r\n");
      out.write("\t\tintegrity=\"sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo\"\r\n");
      out.write("\t\tcrossorigin=\"anonymous\"></script>\r\n");
      out.write("\t<script\r\n");
      out.write("\t\tsrc=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js\"\r\n");
      out.write("\t\tintegrity=\"sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6\"\r\n");
      out.write("\t\tcrossorigin=\"anonymous\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <nav class=\"nav-scroller py-1 mb-2\">\r\n");
      out.write("      <ul class=\"nav justify-content-center\">\r\n");
      out.write("        <li class=\"nav-item col-md text-center\">\r\n");
      out.write("          <a class=\"nav-link active\" href=\"");
      out.print(request.getContextPath());
      out.write("/notice/list\">공지사항</a>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li class=\"nav-item col-md text-center\">\r\n");
      out.write("          <a class=\"nav-link\" href=\"#\">게시판</a>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li class=\"nav-item col-md text-center\">\r\n");
      out.write("          <a class=\"nav-link\" href=\"#\">Q & A</a>\r\n");
      out.write("        </li>\r\n");
      out.write("      </ul>\r\n");
      out.write("    </nav>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t");
      out.write("\r\n");
      out.write("<div class=\"col-sm-4 mt-5\">\r\n");
      out.write("\t<h3>사이드 메뉴</h3>\r\n");
      out.write("\t<ul class=\"list-group\">\r\n");
      out.write("\t\t<li class=\"list-group-item list-group-item-action\"><a href=\"mypage.do\">내정보</a></li>\r\n");
      out.write("\t\t<li class=\"list-group-item list-group-item-action\"><a href=\"changePwd.do\">비밀번호 변경</a></li>\r\n");
      out.write("\t\t<li class=\"list-group-item list-group-item-action\"><a href=\"secession.do\">회원 탈퇴</a></li>\r\n");
      out.write("\t</ul>\r\n");
      out.write("</div>");
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"col-sm-8\">\r\n");
      out.write("\t\t\t\t<h3>My Page</h3>\r\n");
      out.write("\t\t\t\t<hr>\r\n");
      out.write("\t\t\t\t<div class=\"bg-white rounded shadow-sm container p-3\">\r\n");
      out.write("\t\t\t\t\t<form method=\"POST\" action=\"updateMember.do\" onsubmit=\"return validate();\" class=\"form-horizontal\" role=\"form\">\r\n");
      out.write("\t\t\t\t\t\t<!-- 아이디 -->\r\n");
      out.write("\t\t\t\t\t\t<div class=\"row mb-3 form-row\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h6>아이디</h6>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-6\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h5 id=\"id\">");
      out.print( member.getMemberId() );
      out.write("</h5>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t\t\t\t<!-- 이름 -->\r\n");
      out.write("\t\t\t\t\t\t<div class=\"row mb-3 form-row\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h6>이름</h6>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-6\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h5 id=\"name\">");
      out.print( member.getMemberName() );
      out.write("</h5>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t\t\t\t<!-- 전화번호 -->\r\n");
      out.write("\t\t\t\t\t\t<div class=\"row mb-3 form-row\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label for=\"phone1\">전화번호</label>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<!-- 전화번호1 -->\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<select class=\"custom-select\" id=\"phone1\" name=\"phone1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option>010</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option>011</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option>016</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option>017</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option>019</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<script>\r\n");
      out.write("\t\t\t\t\t\t\t\t$.each($(\"#phone1>option\"), function(index, item){\r\n");
      out.write("\t\t\t\t\t\t\t\t\tif($(item).text() == \"");
      out.print(phone[0]);
      out.write("\"){\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t$(item).prop(\"selected\", true);\r\n");
      out.write("\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</script>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t\t\t\t\t<!-- 전화번호2 -->\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"number\" class=\"form-control phone\" id=\"phone2\" name=\"phone2\" maxlength=\"4\" value=\"");
      out.print(phone[1]);
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t\t\t\t\t<!-- 전화번호3 -->\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"number\" class=\"form-control phone\" id=\"phone3\" name=\"phone3\" maxlength=\"4\" value=\"");
      out.print(phone[2]);
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t\t\t\t<!-- 이메일 -->\r\n");
      out.write("\t\t\t\t\t\t<div class=\"row mb-3 form-row\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label for=\"memberEmail\">Email</label>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-6\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"email\" class=\"form-control\" id=\"email\" name=\"email\" value=\"");
      out.print( member.getMemberEmail() );
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<br>\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t\t\t\t<!-- 주소 -->\r\n");
      out.write("\t\t\t\t\t\t<!-- 오픈소스 도로명 주소 API -->\r\n");
      out.write("\t\t\t\t\t\t<!-- https://www.poesis.org/postcodify/ -->\r\n");
      out.write("\t\t\t\t\t\t<div class=\"row mb-3 form-row\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label for=\"postcodify_search_button\">우편번호</label>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" name=\"post\" class=\"form-control postcodify_postcode5\" value=\"");
      out.print(address[0]);
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-primary\" id=\"postcodify_search_button\">검색</button>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"row mb-3 form-row\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label for=\"address1\">도로명 주소</label>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-9\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control postcodify_address\" name=\"address1\" id=\"address1\"  value=\"");
      out.print(address[1]);
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"row mb-3 form-row\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label for=\"address2\">상세주소</label>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-9\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control postcodify_details\" name=\"address2\" id=\"address2\"  value=\"");
      out.print(address[2]);
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t\t\t\t<!-- jQuery와 postcodify 를 로딩한다. -->\r\n");
      out.write("\t\t\t\t\t\t<script src=\"//d1p7wdleee1q2z.cloudfront.net/post/search.min.js\"></script>\r\n");
      out.write("\t\t\t\t\t\t<script>\r\n");
      out.write("\t\t\t\t\t\t\t// 검색 단추를 누르면 팝업 레이어가 열리도록 설정한다.\r\n");
      out.write("\t\t\t\t\t\t\t$(function() {\r\n");
      out.write("\t\t\t\t\t\t\t\t$(\"#postcodify_search_button\").postcodifyPopUp();\r\n");
      out.write("\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t</script>\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t\t\t\t<!-- 관심분야 -->\r\n");
      out.write("\t\t\t\t\t\t<hr class=\"mb-4\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label>관심 분야</label>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-9 custom-control custom-checkbox\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-check form-check-inline\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"memberInterest\" id=\"sports\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tvalue=\"운동\" class=\"form-check-input custom-control-input\" ");
      out.print( checked[0] );
      out.write(" >\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label class=\"form-check-label custom-control-label\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tfor=\"sports\">운동</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-check form-check-inline\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"memberInterest\" id=\"movie\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tvalue=\"영화\" class=\"form-check-input custom-control-input\" ");
      out.print( checked[1] );
      out.write(">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label class=\"form-check-label custom-control-label\" for=\"movie\">영화</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-check form-check-inline\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"memberInterest\" id=\"music\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tvalue=\"음악\" class=\"form-check-input custom-control-input\" ");
      out.print( checked[2] );
      out.write(">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label class=\"form-check-label custom-control-label\" for=\"music\">음악</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-check form-check-inline\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"memberInterest\" id=\"cooking\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tvalue=\"요리\" class=\"form-check-input custom-control-input\" ");
      out.print( checked[3] );
      out.write(">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label class=\"form-check-label custom-control-label\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tfor=\"cooking\">요리</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-check form-check-inline\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"memberInterest\" id=\"game\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tvalue=\"게임\" class=\"form-check-input custom-control-input\" ");
      out.print( checked[4] );
      out.write(">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label class=\"form-check-label custom-control-label\" for=\"game\">게임</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-check form-check-inline\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"memberInterest\" id=\"etc\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tvalue=\"기타\" class=\"form-check-input custom-control-input\" ");
      out.print( checked[5] );
      out.write("> \r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label class=\"form-check-label custom-control-label\" for=\"etc\">기타</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t\t\t\t<hr class=\"mb-4\">\r\n");
      out.write("\t\t\t\t\t\t<button class=\"btn btn-primary btn-lg btn-block\" type=\"submit\">수정</button>\r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<br><br>\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <footer class=\"text-muted\" >\r\n");
      out.write("      <div class=\"container\">\r\n");
      out.write("        <p class=\"float-right\">\r\n");
      out.write("          <a href=\"#\">Back to top</a>\r\n");
      out.write("        </p>\r\n");
      out.write("        <p>Album example is &copy; Bootstrap, but please download and customize it for yourself!</p>\r\n");
      out.write("        <p>New to Bootstrap? <a href=\"{{ site.url }}/\">Visit the homepage</a> or read our <a href=\"{{ site.baseurl }}/docs/{{ site.docs_version }}/getting-started/introduction/\">getting\r\n");
      out.write("            started guide</a>.</p>\r\n");
      out.write("      </div>\r\n");
      out.write("    </footer>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t$(\".phone\").on(\"input\", function() {\r\n");
      out.write("\t\t\tif ($(this).val().length > $(this).prop(\"maxLength\")) {\r\n");
      out.write("\t\t\t\t$(this).val($(this).val().slice(0,$(this).prop(\"maxLength\")));\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t</script>\r\n");
      out.write("\t\r\n");
      out.write("\t<script>\r\n");
      out.write("        // 각 유효성 검사 결과를 저장할 객체\r\n");
      out.write("        var formatCheck = { \r\n");
      out.write("\t\t\t\t\"phone3\":false,\r\n");
      out.write("\t\t\t\t\"email\":false\r\n");
      out.write("\t\t\t\t};\r\n");
      out.write("        \r\n");
      out.write("\t\t// submit 동작\r\n");
      out.write("\t\tfunction validate(){\r\n");
      out.write("\t\t\tvar $phone2 = $(\"#phone2\");\r\n");
      out.write("\t\t\tvar $phone3 = $(\"#phone3\");\r\n");
      out.write("\t\t\tvar $email = $(\"#email\");\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t// 전화번호 관련\r\n");
      out.write("\t\t \t$(\".phone\").on(\"input\",function(){\r\n");
      out.write("\t\t \t\t\r\n");
      out.write("\t\t\t\t// 전화번호 input 태그에 4글자 이상 입력하지 못하게 하는 이벤트\r\n");
      out.write("                if ($(this).val().length > $(this).prop(\"maxLength\")){\r\n");
      out.write("                    $(this).val($(this).val().slice(0, $(this).prop(\"maxLength\")));\r\n");
      out.write("                }\r\n");
      out.write("            });\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t \t// 전화번호 유효성 검사\r\n");
      out.write("            var regExp1 =  /^\\d{3,4}$/; // 숫자 3~4 글자\r\n");
      out.write("            var regExp2 =  /^\\d{4,4}$/; // 숫자 4 글자\r\n");
      out.write("            \r\n");
      out.write("            if(!regExp1.test($phone2.val()) || !regExp2.test($phone3.val())){\r\n");
      out.write("\t\t\t\tformatCheck.phone3 = false;\r\n");
      out.write("            }else{\r\n");
      out.write("\t\t\t\tformatCheck.phone3 = true;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("         \t// 이메일 유효성 검사\r\n");
      out.write("\t\t\tvar regExp3 =  /^[\\w]{4,}@[\\w]+(\\.[\\w]+){1,3}$/;\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tif(!regExp3.test($email.val())){ \r\n");
      out.write("\t\t\t\tformatCheck.email = false;\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t\t\tformatCheck.email = true;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("            \r\n");
      out.write("\t\t\tfor(var key in formatCheck){\r\n");
      out.write("\t\t\t\tif(!formatCheck[key]){\r\n");
      out.write("\t\t\t\t\talert(\"일부 입력값이 잘못되었습니다.\");\r\n");
      out.write("\t\t\t\t\tvar id = \"#\"+key;\r\n");
      out.write("\t\t\t\t\t$(id).focus();\r\n");
      out.write("\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("       </script>\r\n");
      out.write("\t\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}