package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.sql.DataSource;

import org.mindrot.jbcrypt.BCrypt;

import domain.Member;

public class MemberDaoImpl implements MemberDao {
	
	private DataSource ds;
	
	public MemberDaoImpl(DataSource ds) {
		this.ds = ds;
	}
	
	@Override
	public Member findByLoginEmail(String loginEmail) throws Exception {
		return null;
	}
	
	@Override
	public void insert(Member member) throws Exception {
	}
	
	@Override
	public void update(Member member) throws Exception {
	}
    
	@Override
	public void delete(Member member) throws Exception {
	}
	
	@Override
	public Member findByIdAndNameAndEmailAndPassword(Integer id,
	  String name,String email,String password) throws Exception {
		Member member = null;
		try {Connection con = ds.getConnection(); {
		  String sql = "SELECT * FROM member WHERE loginEmail=?";
		  PreparedStatement stmt = con.prepareStatement(sql);
		  stmt.setString(1,loginEmail);
		  ResultSet rs = stmt.executeQuery();
		  if (rs.next()) {
		   if (BCrypt.checkpw(loginPassword,rs.getString("loginPassword"))) {	   
			 member = mapToMember(rs);
		   }
		  }
		}
		   } catch (Exception e) {
			 throw e;
		  }
		  return member;
        }
		
	}

		private Member mapToMember(ResultSet rs) throws Exception {
		  Member member = new Member();
		  member.setLoginEmail(rs.getString("loginEmail"));
		  member.setLoginPassword(rs.getString("loginPassword"));
		  return member;
		}

		}

