package com.databasecourse.applysys.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.databasecourse.applysys.Dao.applydao;
import com.databasecourse.applysys.Bean.applybean;
import com.databasecourse.applysys.Bean.tablebean;
import java.util.List;

@Service
public class applyservice {
    @Autowired
    private applydao applydao;

    public List<applybean> FindAll(){return applydao.FindAll();}

    public List<applybean> SelectAllApply(Integer page, Integer limit){
        Integer start=(page-1)*limit;
        return applydao.FindAllLeaveApply(start,limit);
    }
    public applybean SelectByNo(Integer applynum){
        return applydao.FindLeaveApply(applynum);
    }

    public List<applybean> FindStudent(String studentnum){return applydao.FindStudent(studentnum);}

    public Integer InsertLeaveApply(applybean newapply){
        return applydao.AddLeaveApply(newapply);
    }

    public Integer UpdateApplyState(Integer applynum, String newstate){ return applydao.ChangeApplyState(applynum, newstate); }

    public List<applybean> SelectApplyByDate(Integer start,Integer limit,String Date){
        return applydao.FindApplyByDate(start,limit,Date);
    }

    public List<applybean> DeleteApply(Integer applynum){ return applydao.DeleteLeaveApply(applynum); }

    public Integer DeleteOneApply(Integer applynum){
        return applydao.DeleteOneApply(applynum);
    }

    public Integer RemoveAll(){
        return applydao.RemoveAll();
    }
}
