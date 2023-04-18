package br.com.alura.rh.model.service;

import br.com.alura.rh.model.classes.Employee;
import br.com.alura.rh.model.classes.Role;
import br.com.alura.rh.model.exceptions.ValidacaoException;

public class PromotionService {
    public void promotion(Employee employee, boolean meta){
        if(employee.getRole() == Role.MANAGER)
            throw new ValidacaoException("Manager cannot get Promotion");
        if(meta)
            employee.promote(employee.getRole().getNextRole());
        else
            throw new ValidacaoException("Employee didn't succeded the meta");
        }   
}
