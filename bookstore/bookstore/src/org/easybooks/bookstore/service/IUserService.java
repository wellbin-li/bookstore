package org.easybooks.bookstore.service;

import org.easybooks.bookstore.vo.User;

public interface IUserService {
	//����ע����Ϣ
	public void saveUser(User user);
	//��֤�û���Ϣ
	public User validateUser(String username,String password);
	public boolean exitUser(String username);
}