package com.example.demo;

import com.example.demo.model.user.employeeDto;
import com.example.demo.service.EmployeeService;
import com.example.demo.service.project.ProjectService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ServiceTest {
    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private ProjectService projectService;

    @Test
    public void testOfGetEmployeeInfo() {
        System.out.println("start test");
        employeeDto employee = employeeService.getEmployeeInfo((String) "test3");
        System.out.println(employee);
        try {
            String employeeJson = new ObjectMapper().writeValueAsString(employee);
            System.out.println("==================");
            System.out.println(employeeJson);
            System.out.println("==================");
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testOfDeleteProject() {
        System.out.println("start test");
        projectService.deleteProject("56");
        System.out.println("삭제 성공");
    }
}
