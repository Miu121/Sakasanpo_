package dao;

import domain.Member;

public interface MemberDao {
	Member findById(Integer id) throws Exception;
	
	void insert(Member member) throws Exception;
	
	void update(Member member) throws Exception;
	
	void delete(Member member) throws Exception;
	
	Member findByIdAndNameAndEmailAndPassword(Integer id,String name,String email,String password)
	   throws Exception;

}
