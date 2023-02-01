package com.employee_system_api.daily_code_buffer_employee.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
public class EmployeeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    @Setter private Long id;
    @Column(nullable = false)
    @Getter @Setter private String firstName;
    @Column(nullable = false)
    @Getter @Setter private String lastName;
    @Column(nullable = false)
    @Getter @Setter private String emailId;
    
    public EmployeeEntity(Long id, String firstName, String lastName, String emailId) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailId = emailId;
    }
    
    public EmployeeEntity() {
    }
    

    
    
}
