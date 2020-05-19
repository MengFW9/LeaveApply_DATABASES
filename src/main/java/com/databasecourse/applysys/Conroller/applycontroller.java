package com.databasecourse.applysys.Conroller;

import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.databasecourse.applysys.Service.applyservice;
import com.databasecourse.applysys.Bean.applybean;
import com.databasecourse.applysys.Bean.tablebean;

import java.util.List;

@RestController
@RequestMapping("/apply")
public class applycontroller {
    @Autowired
    private applyservice applyservice;

    @RequestMapping("/findbyno")
    public applybean GetByNo(Integer applynum) {
        return applyservice.SelectByNo(applynum);
    }

    @RequestMapping("/findstu")
    public List<applybean> FindStudent(String studentnum) {
        return applyservice.FindStudent(studentnum);
    }

    @RequestMapping("/addapply")
    public Integer AddLeaveApply(applybean newapply) {

        return applyservice.InsertLeaveApply(newapply);
    }

    @RequestMapping("/changestate")
    public Integer UpdateApplyState(Integer applynum, String newstate) {
        return applyservice.UpdateApplyState(applynum, newstate);
    }

    @RequestMapping("/findbydate")
    public List<applybean> FindApplyByDate(Integer page, Integer limit, String date) {
        Integer start=(page-1)*limit;
        return applyservice.SelectApplyByDate(start,limit,date);
    }

    @RequestMapping("/deletebyno")
    public List<applybean> DeleteApply(Integer applynum) {
        return applyservice.DeleteApply(applynum);
    }

    @RequestMapping("/del")
    public Integer DeleteOneApply(Integer applynum){
        return applyservice.DeleteOneApply(applynum);
    }
//---------------------------------------------------------------------------------
    @RequestMapping("/all")
    public List<applybean> GetAll() {
        return applyservice.FindAll();
    }
    @RequestMapping("/layuitable")
    public tablebean GetTable(Integer page, Integer limit) {
        tablebean result = new tablebean();
        List<applybean> allapply = applyservice.SelectAllApply(page, limit);
        List<applybean> all = applyservice.FindAll();
        result.setCode(0);
        result.setCount(all.size());
        result.setMsg("success");
        result.setData(allapply);
        return result;
    }
//----------------------------------------------------------------------------------
    @RequestMapping("/layuitablestu")
    public tablebean GetTableById(Integer page, Integer limit, String studentnum) {
        tablebean result = new tablebean();
        List<applybean> allapply = applyservice.FindStudent(studentnum);
        Integer start = limit * (page - 1);
        int end = 0;
        int maxend = allapply.size();
        if (start + limit< maxend)
            end = start + limit;
        else
            end = maxend;
        allapply = allapply.subList(start, end);
        result.setCode(0);
        result.setCount(maxend);
        result.setMsg("success");
        result.setData(allapply);
        return result;
    }

    @RequestMapping("/removeall")
    public Integer RemoveAll(){
        return applyservice.RemoveAll();
    }
}
