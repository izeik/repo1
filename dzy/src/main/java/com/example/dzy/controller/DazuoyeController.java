package com.example.dzy.controller;
import com.example.dzy.Service.DazuoyeService;
import com.example.dzy.pojo.Dazuoye;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static jdk.nashorn.internal.objects.Global.undefined;


@RestController
public class DazuoyeController {
    @Autowired
    private DazuoyeService dazuoyeService;


    @RequestMapping(value = "/getStudent/", method = RequestMethod.GET)
    public Dazuoye selectStudentById(int sid){
        return dazuoyeService.selectStudentById(sid);
    }

    @RequestMapping(value = "/delete/{sid}", method = RequestMethod.DELETE)
    public ResponseEntity<Object> delete(@PathVariable("sid") int sid){
//        HashSet<Integer> set = new HashSet<>();
//        int x = dazuoyeService.getStudentId(sid);
        if( sid > 10000 )throw new StudentNotFoundException();
        dazuoyeService.deleteStudent(sid);
        return new ResponseEntity<>("Shan chu cheng gong", HttpStatus.OK);
    }

    @RequestMapping(value = "/update/", method = RequestMethod.PUT)
    public ResponseEntity<Object> update( @RequestBody Dazuoye dazuoye){
        dazuoyeService.updateStudent(dazuoye);
        return new ResponseEntity<>("Geng xin cheng gong", HttpStatus.OK);
    }

    @RequestMapping(value = "/insert/", method = RequestMethod.POST)
    public ResponseEntity<Object> insert(Dazuoye dazuoye){
        if( dazuoye.sid > 10000 )throw new StudentNotFoundException();
        dazuoyeService.addStudent(dazuoye);
        return new ResponseEntity<>("Tian jia cheng gong", HttpStatus.CREATED);
    }

    @RequestMapping
    @ResponseBody
    public ResponseEntity<Object>  listStudent(){
        return new ResponseEntity<>(dazuoyeService.selectAllStudent(), HttpStatus.OK);
    }
}
