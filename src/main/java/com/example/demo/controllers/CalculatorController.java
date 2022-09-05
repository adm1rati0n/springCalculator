package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {
    @PostMapping("/calculator")
    public String postCalculator(
            Model model,
            @RequestParam(required = false) Double num1,
            @RequestParam(required = false) Double num2,
            @RequestParam(required = false) Character operation
    ){
        Double result = null;
        if(num1 != null && num2 != null && operation != null) {
            switch (operation) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
            }
        }
        model.addAttribute("result", result);
        return "calculator";
    }
    @GetMapping("/calculator")
    public String getCalculator(
            Model model,
            @RequestParam(required = false) Double num1,
            @RequestParam(required = false) Double num2,
            @RequestParam(required = false) Character operation
    ){
        Double result = null;
        if(num1 != null && num2 != null && operation != null) {
            switch (operation) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
            }
        }
        model.addAttribute("result", result);
        return "calculator";
    }
}
