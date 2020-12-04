package demo.service.impl;

import demo.dao.UserDao;
import demo.entity.User;
import demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public List<User> getUser() {
        return userDao.getUser();
    }
}
