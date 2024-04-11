package com.example.lab2.Controllers;


import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
@RequestMapping(value="/patito_hule" , method = RequestMethod.GET)
public class MainController {


    @GetMapping(value="")
    public String home(){
        return "home";
    }

    @PostMapping(value="/guardar_datos")
    public String recepcionar(Model model,    @RequestParam(name = "rows",required = false) int row,
                                              @RequestParam(name = "cols",required = false) int col,
                                              @RequestParam(name = "positions",required = false) String posiciones,
                                              @RequestParam(name = "photos",required = false) Integer photos){
        System.out.println("filas : " + row);
        System.out.println("columnas : " + col);
        System.out.println("posiciones : " + posiciones);
        System.out.println("numFotos : " + photos);

        Integer n = row;



        ArrayList<Integer> list = new ArrayList<>();

        while(n<=row){
            list.add(n);
            n = n+1;
        }
        System.out.println(list.size());
        model.addAttribute("row",row);
        model.addAttribute("col",col);
        model.addAttribute("posiciones", posiciones);
        model.addAttribute("fotos",photos);

        return "tabla_patos";
    }








}
