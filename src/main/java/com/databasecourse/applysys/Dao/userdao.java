package com.databasecourse.applysys.Dao;
import com.databasecourse.applysys.Bean.userbean;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface userdao {
   String Getpw(String studentnum);

   List<userbean> GetAllUsers(Integer start, Integer limit);

   Integer DelUser(String studentnum);

   Integer UpdatePw(String studentnum, String passwd);

   Integer AddUser(userbean userinfo);

   List<userbean> allusers();
}
