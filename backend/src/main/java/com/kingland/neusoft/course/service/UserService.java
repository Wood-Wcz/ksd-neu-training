package com.kingland.neusoft.course.service;

import com.kingland.neusoft.course.config.PasswordEncoderConfig;
import com.kingland.neusoft.course.mapper.UserMapper;
import com.kingland.neusoft.course.mapper.dao.UserModel;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Implementation class of user service
 *
 * @author KSC
 */
@Service
public class UserService {

    //    @Autowired
    private final UserMapper userMapper;
    //    @Autowired
    private final PasswordEncoder passwordEncoder;

    public UserService(UserMapper userMapper, PasswordEncoder passwordEncoder) {
        this.userMapper = userMapper;
        this.passwordEncoder = passwordEncoder;
    }

    public int addUser(UserModel userModel) {
        /** encode raw password string before inserting to the database
         * the encode provided in {@link PasswordEncoderConfig#passwordEncoder}
         **/
        return userMapper.insert(userModel);
    }
    public int updateUserModel(UserModel userModel){
        return userMapper.updateByPrimaryKeySelective(userModel);
    }

    public Integer countUser() {
        return userMapper.count();
    }

    public UserModel getUserById(Long userId) {
        return userMapper.selectByPrimaryKey(userId);
    }

    public List<UserModel> getAllUser() {
        return this.userMapper.query();
    }
    public List<UserModel> searchUser(String name) {
        return this.userMapper.queryList(name);
    }

    public int deleteUser(Long userId) {
        return this.userMapper.deleteByPrimaryKey(userId);
    }
}
