package com.spring.exam.sys.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.exam.sys.model.User;

@Repository
public class HomeDaoImp implements UserDAO{
	@Autowired
	public SqlSession sqlSession;

	@Override
	public User getUserById(String id) {		
		return sqlSession.selectOne("SystemMapper.selectUser");
	}
	
}
