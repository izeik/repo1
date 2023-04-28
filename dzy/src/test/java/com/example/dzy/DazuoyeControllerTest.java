package com.example.dzy;

import com.example.dzy.pojo.Dazuoye;
import org.junit.Before;
import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class DazuoyeControllerTest extends AbstractTest{
    @Override
    @Before
    public void setUp() {
        super.setUp();
    }
    @Test
    public void getStudent() throws Exception {
        String uri = "/";
        MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri)
                .accept(MediaType.APPLICATION_JSON_VALUE)).andReturn();

        int status = mvcResult.getResponse().getStatus();
        assertEquals(200, status);
        String content = mvcResult.getResponse().getContentAsString();
        Dazuoye[] dazuoyelist = super.mapFromJson(content, Dazuoye[].class);
        assertTrue(dazuoyelist.length > 0);
    }
    @Test
    public void createStudent() throws Exception {
        String uri = "/insert/";
        Dazuoye k1 = new Dazuoye();
        k1.setSid(99);
        k1.setSname("Ginger");
        k1.setScore(99);
        String inputJson = super.mapToJson(k1);
        MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.post(uri)
                .contentType(MediaType.APPLICATION_JSON_VALUE)
                .content(inputJson)).andReturn();

        int status = mvcResult.getResponse().getStatus();
        assertEquals(201, status);
        String content = mvcResult.getResponse().getContentAsString();
        assertEquals(content, "Tian jia cheng gong");
    }
    @Test
    public void updateStudent() throws Exception {
        String uri = "/update/";
        Dazuoye k1 = new Dazuoye();
        k1.setSid(99);
        k1.setSname("Ginger");
        k1.setScore(99);
        String inputJson = super.mapToJson(k1);
        MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.put(uri)
                .contentType(MediaType.APPLICATION_JSON_VALUE)
                .content(inputJson)).andReturn();

        int status = mvcResult.getResponse().getStatus();
        assertEquals(200, status);
        String content = mvcResult.getResponse().getContentAsString();
        assertEquals(content, "Geng xin cheng gong");
    }
    @Test
    public void delete() throws Exception {
        String uri = "/delete/99";
        MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.delete(uri)).andReturn();
        int status = mvcResult.getResponse().getStatus();
        assertEquals(200, status);
        String content = mvcResult.getResponse().getContentAsString();
        assertEquals(content, "Shan chu cheng gong");
    }
}
