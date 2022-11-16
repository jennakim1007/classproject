package org.example.di.service;

import java.util.Date;

import org.example.di.dao.Dao;
import org.example.di.domain.Member;
import org.example.di.domain.RegisterRequest;
import org.example.di.exception.AlreadyExistingMemberException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberRegisterService {

//	@Autowired(required = true)
//	@Qualifier("member")
	// private MemberDao memberDao;
	private final Dao dao;

	public MemberRegisterService(Dao dao) {
		this.dao = dao;
	}

//	public MemberRegisterService(MemberDao memberDao) {
//		this.memberDao = memberDao;
//	}
//
//	public MemberRegisterService() {
//	}
//
//	public void setMemberDao(MemberDao memberDao){
//		this.memberDao = memberDao;
//	}

	public void regist(RegisterRequest req) throws AlreadyExistingMemberException {
		
		// Member member = memberDao.selectByEmail(req.getEmail());
		Member member = dao.selectByEmail(req.getEmail());
		if (member != null) {
			throw new AlreadyExistingMemberException("dup email " + req.getEmail());
		}
		Member newMember = new Member(req.getEmail(), req.getPassword(), req.getName(), new Date());
		// memberDao.insert(newMember);
		dao.insert(newMember);
	}

}
