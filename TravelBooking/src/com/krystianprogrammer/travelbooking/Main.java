package com.krystianprogrammer.travelbooking;

import com.krystianprogrammer.travelbooking.domain.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        TrainTicket trainTicket = new TrainTicket();
        trainTicket.cancel();

        TrainTicket trainTicket2 = new TrainTicket(123L,"London", "Edinburgh", new BigDecimal("59.00"),
                LocalDateTime.of(2022,8, 7, 16, 03),
                LocalDateTime.of(2022,8, 7, 19, 03),
                TravelClass.FIRST, 3, 42);

        trainTicket2.upgrade();

        String[] providers = {"First bus company", "Second bus company"};

        BusTicket busTicket = new BusTicket(124L,"London", "Edinburgh", new BigDecimal("59.00"),
                LocalDateTime.of(2022,8, 7, 16, 03),
                LocalDateTime.of(2022,8, 7, 19, 03),
                providers);

        trainTicket2.cancel();
        busTicket.cancel();

        //TravelTicket ticket = new TravelTicket();
        PlaneTicket planeTicket = new PlaneTicket();


    }


}
