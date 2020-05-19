package com.databasecourse.applysys.Conroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.databasecourse.applysys.Service.userservice;
import com.databasecourse.applysys.Bean.userbean;
import com.databasecourse.applysys.Bean.usertbbean;

import java.net.Inet4Address;
import java.util.List;

@RestController

public class usercontroller {
    @Autowired
    private userservice userservice;
    @RequestMapping("login")
    public String Checkpw(String studentnum, String passwd){
        String a = userservice.Getpw(studentnum);

        if(a==null||!a.equals(passwd))
            return "wronguser";
        else if(studentnum.equals("root"))
            return "root";
        else
            return "student";
    }



    @RequestMapping("allusers")
    public usertbbean GetAllUsers(Integer page, Integer limit){
        Integer start=(page-1)*limit;
        List<userbean> alluser = userservice.allusers();
        List<userbean> allusers = userservice.GetAllUsers(start, limit);
        usertbbean userdatatb = new usertbbean();
        userdatatb.setCode(0);
        userdatatb.setCount(alluser.size());
        userdatatb.setMsg("");
        userdatatb.setData(allusers);
        return userdatatb;
    }

    @RequestMapping("deluser")
    public Integer DelUser(String studentnum){
        return userservice.DelUser(studentnum);
    }

    @RequestMapping("updatepw")
    public Integer UpdatePw(String studentnum,String passwd){
        return userservice.UpdatePw(studentnum,passwd);
    }

    @RequestMapping("adduser")
    public Integer AddUser(userbean userinfo){
        return userservice.AddUser(userinfo);
    }
}
