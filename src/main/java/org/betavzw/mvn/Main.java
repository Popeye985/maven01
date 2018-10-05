package org.betavzw.mvn;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        System.out.println("Dag allemaal");
        LocalDateTime datum = LocalDateTime.now();
        if (datum.getHour() > 12){
            System.out.println("Goede namiddag");
        }else{
            System.out.println("Goede voormiddag");
        }
    }
}
