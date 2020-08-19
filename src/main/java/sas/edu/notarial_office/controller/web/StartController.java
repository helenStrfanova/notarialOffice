package sas.edu.notarial_office.controller.web;/*
 * @author Alona Sviridova
 * @version 1
 * Project name: "notarialOffice"
 * 18 Aug 2020
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StartController {

    @RequestMapping("/")
    String showStart(){
        return "Start";
    }
}
