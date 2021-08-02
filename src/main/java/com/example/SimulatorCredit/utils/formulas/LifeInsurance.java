package com.example.SimulatorCredit.utils.formulas;

import com.example.SimulatorCredit.models.Client;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

public class LifeInsurance {
    private double lifeInsurance(Client client, double credit){

        int age = getAge( client.getBirthDate());
        double selfPercentage = 0;

        if(age >=18 && age <=32){
            selfPercentage = 0.0005;
        }
        else if (age >=33 && age <=50){
            selfPercentage = 0.0006;
        }
        else if (age >=51 && age <=80){
            selfPercentage = 0.0009;
        } else if(age > 80){
            selfPercentage = 0.00011;
        }

        return  credit * selfPercentage;
    }

    private int getAge(Date birthDayClient){
        LocalDate now  = LocalDate.now();
        LocalDate birthday = birthDayClient.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        return Period.between(birthday, now).getYears();
    }
}
