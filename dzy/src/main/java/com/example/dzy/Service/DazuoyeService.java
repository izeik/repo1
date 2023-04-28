package com.example.dzy.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.dzy.mapper.DazuoyeMapper;
import java.util.Collection;
import java.util.List;

import com.example.dzy.pojo.Dazuoye;
@Service
public class DazuoyeService {
    @Autowired
    private DazuoyeMapper dazuoyeMapper;
    public Collection<Dazuoye> selectAllStudent(){
        return dazuoyeMapper.selectAllStudent();
    }

    public Dazuoye selectStudentById(int sid){
        return dazuoyeMapper.selectStudentById(sid);
    }
    public int addStudent(Dazuoye dazuoye){
        return dazuoyeMapper.addStudent(dazuoye);
    }

    public int updateStudent(Dazuoye dazuoye){
        return dazuoyeMapper.updateStudent(dazuoye);
    }
    public int deleteStudent(int sid){
        return dazuoyeMapper.deleteStudent(sid);
    }
    public int getStudentId(int sid){
        return dazuoyeMapper.getStudentId(sid);
    }
}
