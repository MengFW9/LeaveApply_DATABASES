package com.databasecourse.applysys.Service;
import com.databasecourse.applysys.Dao.userdao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.databasecourse.applysys.Bean.userbean;
import java.util.List;

@Service
public class userservice {
    @Autowired
    private userdao userdao;

    public String Getpw(String studentnum){
        return userdao.Getpw(studentnum);
    }

    public List<userbean> GetAllUsers(Integer start, Integer limit){return userdao.GetAllUsers(start, limit);}

    public Integer DelUser(String studentnum){return userdao.DelUser(studentnum);}

    public Integer UpdatePw(String studentnum, String passwd){return userdao.UpdatePw(studentnum,passwd);}

    public Integer AddUser(userbean userinfo){return userdao.AddUser(userinfo);}

    public List<userbean> allusers(){
        return userdao.allusers();
    }
}
