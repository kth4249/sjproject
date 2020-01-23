package com.kh.sjproject.member.model.service;

import static com.kh.sjproject.common.JDBCTemplate.*;

import java.sql.Connection;

import com.kh.sjproject.member.model.dao.MemberDAO;
import com.kh.sjproject.member.model.vo.Member;

public class MemberService {

	/** 로그인용 Service
	 * @param member
	 * @return loginMember
	 * @throws Exception
	 */
	public Member loginMember(Member member) throws Exception{
		Connection conn = getConnection();
		
		Member loginMember = new MemberDAO().loginMember(conn, member);
		
		return loginMember;
	}

	/** 아이디 중복 확인용 Service
	 * @param id
	 * @return result
	 * @throws Exception
	 */
	public int idDupCheck(String id) throws Exception{
		Connection conn = getConnection();
		
		return new MemberDAO().idDupCheck(conn, id);
	}

	/** 회원가입용 서비스
	 * @param member
	 * @return result
	 * @throws Exception
	 */
	public int signUpMember(Member member) throws Exception{
		Connection conn = getConnection();
		
		int result = new MemberDAO().signUpMember(conn, member);
		
		if(result > 0) {
			commit(conn);
		} else {
			rollback(conn);
		}
		
		return result;
	}

	public Member selectMember(String memberId) throws Exception{
		Connection conn = getConnection();
		
		return new MemberDAO().selectMember(conn, memberId);
		
	}

	public int updateMember(Member updateMember) throws Exception{
		Connection conn = getConnection();
		
		int result = new MemberDAO().updateMember(conn, updateMember);
		
		if(result > 0) commit(conn);
		else			rollback(conn);
		
		return result;
		
	}

	/** 비밀번호 수정용 서비스
	 * @param loginMember
	 * @param newPwd
	 * @return result
	 * @throws Exception
	 */
	public int updatePwd(Member loginMember, String newPwd) throws Exception {
		Connection conn = getConnection();
		
		MemberDAO memberDao = new MemberDAO();
		// 현재 비밀번호 일치 여부 확인
		int result = memberDao.checkPwd(conn, loginMember);
		
		if(result > 0) { // 현재 비밀번호가 일치할 경우
			// 비밀번호 변경
			loginMember.setMemberPwd(newPwd);
			result = memberDao.updatePwd(conn, loginMember);
			if(result > 0) commit(conn);
			else			rollback(conn);
			
			return result;
		} else {
			// 현재 비밀번호가 다를 경우
			return -1;
		}
	}

	public int deleteMember(Member loginMember) throws Exception{
		Connection conn = getConnection();
		
		MemberDAO memberDao = new MemberDAO();
		
		int result = memberDao.checkPwd(conn, loginMember);
		if(result > 0) {
			result = memberDao.deleteMember(conn, loginMember);
			if(result > 0) commit(conn);
			else			rollback(conn);
			
			return result;
		} else {
			return -1;
		}
		
	}

}




















