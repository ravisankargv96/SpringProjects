package com.project.springbootweb.springbootweb;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class EmployeeService {

//    private final ModelMapper modelMapper;

    // later complete the Service layer constructor
    public EmployeeService(){

    }

    public String createNewEmployee(EmployeeDTO inputEmployee){
        return "Service.createNewEmployee";
    }

    public String getAllEmployees(){
        return "Service.getAllEmployees";
    }

    public String getEmployeeById(Long id){

        return "Service.getEmployeeById";
    }


    public String updateEmployeeById(Long employeeId, EmployeeDTO employeeDTO){
        return "Service.updateEmployeeById";
    }

    public String updatePartialEmployeeId(Long employeeId, Map<String, Object> updates){
        return "Service.updatePartialEmployeeId";
    }


    public boolean deleteEmployeeById(Long employeeId){
        return true;
    }

    public String isExistsByEmployeeId(Long employeeId){
        return "Service.HelperMethod";
    }



}
