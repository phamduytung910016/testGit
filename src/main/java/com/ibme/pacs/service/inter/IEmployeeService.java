package com.ibme.pacs.service.inter;


import com.ibme.pacs.dto.EmployeeDTO;
import com.ibme.pacs.entities.Employee;
import java.util.List;
import java.util.Optional;

public interface IEmployeeService {

    List<Employee> findAll();


    Optional<Employee> findById(int id);


    List<Employee> findByDepartment(int id);


    List<Employee> findByName(String name);

    boolean delete(int id);


    Employee saveOrUpdate(EmployeeDTO employeeDTO);
}
