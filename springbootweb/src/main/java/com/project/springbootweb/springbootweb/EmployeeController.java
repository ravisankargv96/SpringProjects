package com.project.springbootweb.springbootweb;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }

    @PostMapping
    public ResponseEntity<EmployeeDTO> createNewEmployee(@RequestBody @Valid EmployeeDTO inputEmployee){
        EmployeeDTO savedEmployee = employeeService.createNewEmployee(inputEmployee);
        return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
    }

    @GetMapping
    public String getAllEmployees(@RequestParam(required = false, name = "inputAge") Integer age,
                                  @RequestParam(required = false) String sortBy){
        return employeeService.getAllEmployees();
    }


    @GetMapping(path = "/{employeeId}")
    public ResponseEntity<EmployeeDTO> getEmployeeById(@PathVariable(name = "employeeId") Long id){
        Optional<EmployeeDTO> employeeDTO = employeeService.getEmployeeById(id);
        return employeeDTO
                .map(employeeDTO1 -> ResponseEntity.ok(employeeDTO1))
                .orElseThrow( () -> new ResourceNotFoundException("Employee not found with id: " + id));
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
