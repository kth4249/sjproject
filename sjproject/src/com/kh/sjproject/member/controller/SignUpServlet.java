package com.kh.sjproject.member.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.sjproject.member.model.service.MemberService;
import com.kh.sjproject.member.model.vo.Member;

@WebServlet("/member/signUp.do")
public class SignUpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public SignUpServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//request.setCharacterEncoding("UTF-8");
		
		String memberId = request.getParameter("id");
		String memberPwd = request.getParameter("pwd1");
		String memberName = request.getParameter("name");
		String memberPhone = 
				request.getParameter("phone1") + "-"
				+ request.getParameter("phone2") + "-"
				+ request.getParameter("phone3");
		String memberEmail = request.getParameter("email");
		String memberAddress =  request.getParameter("post") + ", "
				+ request.getParameter("address1") + ", "
				+ request.getParameter("address2");
		String[] interest = request.getParameterValues("memberInterest");
		
		// 관심분야 배열을 ", "를 구분자로 하여 하나의 String으로 합침
		String memberInterest = null;
		if(interest != null) memberInterest = String.join(", ", interest);
		Member member = new Member(memberId, memberPwd, memberName, memberPhone, memberEmail, memberAddress, memberInterest);
		
		System.out.println("signup : " + member);
		
		try {
			int result = new MemberService().signUpMember(member);
			
			response.setContentType("text/html; charset=UTF-8");
			// jsp로 넘어가는경우 jsp상단에 페이지
			
			String msg = null;
			if(result > 0) msg = "가입 성공!";
			else			msg = "가입 실패ㅜㅜ";
			
			request.getSession().setAttribute("msg", msg);
			response.sendRedirect(request.getContextPath());
			
		} catch (Exception e) {
			request.setAttribute("errorMsg", "회원가입 과정에서 오류가 발생하였습니다.");
			e.printStackTrace();
			
			String path = "/WEB-INF/views/common/errorPage.jsp";
			RequestDispatcher view = request.getRequestDispatcher(path);
			view.forward(request, response);

		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
