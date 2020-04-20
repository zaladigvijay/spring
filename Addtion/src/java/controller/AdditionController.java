/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import service.AdditionService;
import model.addition;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;


public class AdditionController extends SimpleFormController {

    private AdditionService additionService;

    public void setAdditionService(AdditionService additionService) {
        this.additionService = additionService;
    }

    public AdditionController() {
        //Initialize controller properties here or
        //in the Web Application Context

        setCommandClass(addition.class);
        setCommandName("addition");
        setSuccessView("result");
        setFormView("input");
    }



    @Override
    protected ModelAndView onSubmit(
            HttpServletRequest request,
            HttpServletResponse response,
            Object command,
            BindException errors) throws Exception {
        ModelAndView mv = new ModelAndView(getSuccessView());
        System.out.println("Hello");
        addition add = (addition) command;
        mv.addObject("message", "Sum is "+additionService.sum(add.getNo1(), add.getNo2()));
        return mv;
    }
}
