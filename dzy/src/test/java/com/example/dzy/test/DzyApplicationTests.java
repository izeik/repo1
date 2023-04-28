package com.example.dzy.test;

import com.example.dzy.Service.DazuoyeService;
import com.example.dzy.Service.TestService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.example.dzy.pojo.Dazuoye;

@ActiveProfiles("test")
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
class DzyApplicationTests {

    @Autowired
    private TestService testService;

    @Autowired
    private DazuoyeService dazuoyeService;

    @Test
    public void testSelectStudentVById() {
        Dazuoye k = new Dazuoye();
        k.sname = "笑天";
        k.score = 0;
        Mockito.when(dazuoyeService.selectStudentById(1)).thenReturn(k);
        Dazuoye testName = testService.selectStudentById(1);
        Assert.assertEquals(k, testName);
    }
    @Test
    public void testInsert() {
        Dazuoye k = new Dazuoye();
        k.sid   = 100;
        k.sname = "笑天";
        k.score = 0;
        Mockito.when(dazuoyeService.addStudent(k)).thenReturn(99);
        int testResult = testService.addStudent(k);
        Assert.assertEquals(99, testResult);
    }
    @Test
    public void testUpdate() {
        Dazuoye k = new Dazuoye();
        k.sid   = 1;
        k.sname = "笑天";
        k.score = 0;
        Mockito.when(dazuoyeService.updateStudent(k)).thenReturn(250);
        int testUpdateResult = testService.updateStudent(k);
        Assert.assertEquals(250, testUpdateResult);
    }
    @Test
    public void testDelete() {
        Mockito.when(dazuoyeService.deleteStudent(1)).thenReturn(38);
        int testDeleteResult = testService.deleteStudent(1);
        Assert.assertEquals(38, testDeleteResult);
    }

}
