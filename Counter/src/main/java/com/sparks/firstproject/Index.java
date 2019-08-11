package com.sparks.firstproject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpSession;

@Controller
public class Index {
    @RequestMapping("")
    public String index(HttpSession session){
        Integer count = (Integer) session.getAttribute("count");
        if (count == null){
            count = 0;
        }
        session.setAttribute("count", count + 1);
        return "index.jsp";
    }
    @RequestMapping("/counter")
    public String counter(HttpSession session){
    	Integer count = (Integer) session.getAttribute("count");
        if (count == null){
            count = 0;
        }
        return "counter.jsp";
    }

    @RequestMapping("/reset")
    public String reset(HttpSession session){
        session.invalidate();
        return "reset.jsp";
    }

}