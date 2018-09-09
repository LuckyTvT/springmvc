package com.karlo.controller;


import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;

public class TestController  implements Controller {

    public String getNameTest() {
        return nameTest;
    }

    public void setNameTest(String nameTest) {
        this.nameTest = nameTest;
    }

    public String nameTest;

    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("itemList",list);
        modelAndView.setViewName("jsp/itemList.jsp");

        return null;
    }
}
