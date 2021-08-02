package com.example.SimulatorCredit.utils.formulas;

import com.example.SimulatorCredit.models.Client;
import com.example.SimulatorCredit.models.Simulation;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;


public  class PaymantPay {

    public static ArrayList<Month> generetePaymantMethod (Simulation data){
        double valueCredit = data.getHomeValue();
        double monthPay = Double.parseDouble(monthPay(valueCredit, data.getTermMonths()));

        ArrayList<Month> months = new ArrayList<>();
        double rent;
        double interest;
        double amortization;
        double balance;

        for (int i=0; i< data.getTermMonths();i++){

            if (i ==0){
                rent = 0;
                interest= 0;
                amortization=0;
                balance = valueCredit;
            } else if (i==1){
                rent = monthPay;
                interest = valueCredit * 0.08;
                amortization = rent - interest;
                balance = valueCredit - amortization;
            } else {
                Month monthAux = months.get(i-1);

                rent = monthAux.getRent() + 1;
                interest = monthAux.getBalance() * 0.08;
                amortization = rent - interest;
                balance = monthAux.getBalance() - amortization;
            }
            Month month = new Month(rent,interest,amortization,balance);

            months.add(month);
        }

        return months;
    }

    public static String monthPay(double credit, int term){
        try {
            double aux1 = credit * 0.08;
            double aux2 = 1- (Math.pow(1+0.08,-term));
            double monthPay = aux1/aux2;
            DecimalFormat df = new DecimalFormat("###.##");
            return df.format(monthPay);

        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return  null;
    }
}
