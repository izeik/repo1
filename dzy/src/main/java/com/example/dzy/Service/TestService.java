package com.example.dzy.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.dzy.pojo.Dazuoye;

import java.util.Collection;

@Service
public class TestService {
    @Autowired
    DazuoyeService dazuoyeService;

    public TestService(DazuoyeService dazuoyeService) {
        this.dazuoyeService = dazuoyeService;
    }
    public Dazuoye selectStudentById(int sid) {
        return dazuoyeService.selectStudentById(sid);
    }
    public int addStudent(Dazuoye dazuoye) {
        return dazuoyeService.addStudent(dazuoye);
    }
    public int updateStudent(Dazuoye dazuoye) {
        return dazuoyeService.updateStudent(dazuoye);
    }
    public int deleteStudent(int sid) {
        return dazuoyeService.deleteStudent(sid);
    }
}
