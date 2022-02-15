package br.com.zup.mvc.mudi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloController {

    @GetMapping("/hello")

    //Utilizando Servlet
    /*
    public String hello(HttpServletRequest request){
        request.setAttribute("nome", "Mundo");
        return "hello";
    }
    */

    //Modo usando o Model do Spring
     public  String hello(Model model){
         model.addAttribute("nome", "Mundo");
         return "hello";
    }
}
