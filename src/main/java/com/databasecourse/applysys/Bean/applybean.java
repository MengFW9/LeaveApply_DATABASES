package com.databasecourse.applysys.Bean;

public class applybean {
    private Integer applynum;
    private String applytime;
    private String reason;
    private String state;
    private String studentnum;
    private Integer lessonnum;
    private Integer teachernum;

    public Integer getApplynum() {
        return applynum;
    }

    public void setApplynum(Integer applynum) {
        this.applynum = applynum;
    }

    public String getApplytime() {
        return applytime;
    }

    public void setApplytime(String applytime) {
        this.applytime = applytime;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getStudentnum() {
        return studentnum;
    }

    public void setStudentnum(String studentnum) {
        this.studentnum = studentnum;
    }

    public Integer getLessonnum() {
        return lessonnum;
    }

    public void setLessonnum(Integer lessonnum) {
        this.lessonnum = lessonnum;
    }

    public Integer getTeachernum() {
        return teachernum;
    }

    public void setTeachernum(Integer teachernum) {
        this.teachernum = teachernum;
    }
}
