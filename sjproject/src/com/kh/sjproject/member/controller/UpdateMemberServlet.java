package com.kh.sjproject.member.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.kh.sjproject.member.model.service.MemberService;
import com.kh.sjproject.member.model.vo.Member;

@WebServlet("/member/updateMember.do")
public class UpdateMemberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public UpdateMemberServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		HttpSession session = request.getSession();
		Member loginMember = (Member)session.getAttribute("loginMember");
		String memberId = loginMember.getMemberId();
		
		String memberPhone = 
				request.getParameter("phone1") + "-"
				+ request.getParameter("phone2") + "-"
				+ request.getParameter("phone3");
		String memberEmail = request.getParameter("email");
		String memberAddress =  request.getParameter("post") + ", "
				+ request.getParameter("address1") + ", "
				+ request.getParameter("address2");
		String[] interest = request.getParameterValues("memberInterest");
		
		String memberInterest = null;
		if(interest != null) {
			memberInterest = String.join(", ", interest);
		}
		
		Member updateMember = new Member(memberId, memberPhone, memberEmail, memberAddress, memberInterest);
		System.out.println(updateMember);
		try {
			int result = new MemberService().updateMember(updateMember);
			String msg = null;
			if(result > 0) {
				msg = "회원 정보가 수정되엇습니다.";
			}else {
				msg = "회원 정보 수정에 실패하였습니다.";
			}
			session.setAttribute("msg", msg);
			
			response.sendRedirect("mypage.do");
			
		} catch (Exception e) {
			request.setAttribute("errorMsg", "마이페이지 수정 과정에서 오류가 발생하였습니다.");
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
