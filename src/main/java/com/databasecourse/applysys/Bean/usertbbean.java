package com.databasecourse.applysys.Bean;

import java.util.List;

public class usertbbean {
    private Integer code;
    private String msg;
    private Integer count;
    private List<userbean> data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public List<userbean> getData() {
        return data;
    }

    public void setData(List<userbean> data) {
        this.data = data;
    }
}
