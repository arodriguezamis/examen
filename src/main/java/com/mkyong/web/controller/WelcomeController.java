package com.mkyong.web.controller;

import java.sql.SQLException;
import java.util.Date;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class WelcomeController {

    private final Logger logger = LoggerFactory.getLogger(WelcomeController.class);
    
    @Value( "${mensaje}" )
    private String mensaje;
    
    @Value( "${nombre}" )
    private String nombre;
    
    @Autowired
    private DataSource datasource;

    @GetMapping("/")
    public String index(Model model) {
        logger.debug("Hola iniciando...");
        model.addAttribute("msg", getMessage());
        model.addAttribute("today", new Date());
        try {
			model.addAttribute("testdb", datasource.getConnection()!=null);
			model.addAttribute("testdbdetail", "Conexion existosa");
		} catch (SQLException e) {
			model.addAttribute("testdb", false);
			model.addAttribute("testdbdetail", e.getMessage());
		}

        return "index";

    }

    public String getMessage() {
        return mensaje +": "+nombre;
    }
    
    @PostConstruct
    public void run () {
    	try {
    		Thread t1 = new Thread(new HiloLog());
			t1.start();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

}
