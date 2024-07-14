package com.project.springbootweb.springbootweb;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }

    @PostMapping
    public String createNewEmployee(@RequestBody @Valid EmployeeDTO inputEmployee){
        return employeeService.createNewEmployee(inputEmployee);
    }

    @GetMapping
    public String getAllEmployees(@RequestParam(required = false, name = "inputAge") Integer age,
                                  @RequestParam(required = false) String sortBy){
        return employeeService.getAllEmployees();
    }


    @GetMapping(path = "/{employeeId}")
    public String getEmployeeById(@PathVariable(name = "employeeId") Long id){
        return employeeService.getEmployeeById(id);
    }

    @PutMapping(path = "/{employeeId}")
    public String updateEmployeeById(@RequestBody @Valid EmployeeDTO employeeDTO, @PathVariable Long employeeId){
        return employeeService.updateEmployeeById(employeeId, employeeDTO);
    }

    @PatchMapping(path = "/{employeeId}")
    public String updatePartialEmployeeById(@RequestBody Map<String, Object> updates,
                                            @PathVariable Long employeeId){
        return employeeService.updatePartialEmployeeId(employeeId, updates);
    }


    @DeleteMapping(path = "/{employeeId}")
    public Boolean deleteEmployeeById(@PathVariable Long employeeId){
        return employeeService.deleteEmployeeById(employeeId);
    }

}
