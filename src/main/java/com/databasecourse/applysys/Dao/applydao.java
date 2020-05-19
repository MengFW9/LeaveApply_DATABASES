package com.databasecourse.applysys.Dao;

import java.util.List;
import com.databasecourse.applysys.Bean.applybean;
import org.apache.ibatis.annotations.Mapper;
import com.databasecourse.applysys.Bean.tablebean;

@Mapper
public interface applydao {
    List<applybean> FindAll();
//  列出所有请假信息
    List<applybean> FindAllLeaveApply(Integer start,Integer limit);
//  根据请假单号码找到请假信息
    applybean FindLeaveApply(Integer applunum);
//  根据学号找到所有请假单号
    List<applybean> FindStudent(String studentnum);
//  增加新的请假信息
    Integer AddLeaveApply(applybean newapply);
//  更新请假信息状态
    Integer ChangeApplyState(Integer applynum, String newstate);
//  找到某天的所有请假申请
    List<applybean> FindApplyByDate( Integer start, Integer limit,String Date);
//  删除单个请假信息,反回剩下的申请信息
    List<applybean> DeleteLeaveApply(Integer applynum);

    Integer DeleteOneApply(Integer applynum);

    Integer RemoveAll();

}
