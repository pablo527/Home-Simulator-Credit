package com.example.SimulatorCredit.models;

import com.example.SimulatorCredit.utils.validation.IAdult;
import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import java.util.Date;

@Entity
@Table(name = "Clients")
public class Client {
    @Column(name = "IdClient")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "ClientName")
    private String name;

    @Column(name = "ClientLastName")
    private String lastName;

    @Column(name = "ClientCc")
    @Pattern(regexp = "[0-9]{8,10}", message = "The identification must contain between 8 to 10 digits ")
    private String cc;

    @Column(name = "ClientEmail")
    @Email(message = "the email does not have a valid format ")
    private String email;

    @Column(name = "ClientPhone")
    private String phone;

    @IAdult
    @Column(name = "ClientBirthDate")
    private Date birthDate;

    @Min(value =  908526)
    @Column(name = "ClientIncome")
    private double monthlyIncome;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public double getMonthlyIncome() {
        return monthlyIncome;
    }

    public void setMonthlyIncome(double monthlyIncome) {
        this.monthlyIncome = monthlyIncome;
    }
}
