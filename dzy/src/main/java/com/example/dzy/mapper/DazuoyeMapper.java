package com.example.dzy.mapper;


import org.springframework.stereotype.Repository;
import com.example.dzy.pojo.Dazuoye;
import java.util.Collection;
import java.util.List;

@Repository

public interface DazuoyeMapper {
    public Collection<Dazuoye> selectAllStudent();

    public Dazuoye selectStudentById(int sid);
    public int addStudent(Dazuoye dazuoye);

    public int updateStudent(Dazuoye dazuoye);
    public int deleteStudent(int sid);
    public int getStudentId(int sid);

}