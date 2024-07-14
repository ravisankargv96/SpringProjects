package com.project.springbootweb.springbootweb;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class EmployeeService {

    private final ModelMapper modelMapper;

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository, ModelMapper modelMapper){
        this.employeeRepository = employeeRepository;
        this.modelMapper = modelMapper;
    }

    public EmployeeDTO createNewEmployee(EmployeeDTO inputEmployee){
        EmployeeEntity toSaveEntity = modelMapper.map(inputEmployee, EmployeeEntity.class);
        EmployeeEntity savedEmployeeEntity = employeeRepository.save(toSaveEntity);
        return modelMapper.map(savedEmployeeEntity, EmployeeDTO.class);
    }

    public String getAllEmployees(){
        return "Service.getAllEmployees";
    }

    public Optional<EmployeeDTO> getEmployeeById(Long id){

        return employeeRepository.findById(id).map(employeeEntity -> modelMapper.map(employeeEntity, EmployeeDTO.class));
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
