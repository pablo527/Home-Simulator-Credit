package com.example.SimulatorCredit.formula;

import com.example.SimulatorCredit.utils.formulas.PaymantPay;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PaymantPayTest {

    @Test
    void monthPay(){
        double pay = Double.parseDouble(PaymantPay.monthPay(145000000,12));
        System.out.println();

        Assertions.assertEquals(195323,pay);
    }

}
