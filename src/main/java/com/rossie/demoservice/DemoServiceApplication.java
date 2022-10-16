package com.rossie.demoservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Calendar;

@SpringBootApplication
public class DemoServiceApplication {

    @RestController
    static class Rest{
        @GetMapping("/rest")
        public String getData() {
            return "Hello from [" + getPid() + "] on "  + Calendar.getInstance().getTime();
        }

        private static String getPid() {
            try {
                return ProcessHandle.current().pid() + "";
            } catch (UnsupportedOperationException  e){
                return "UNKOWN";
            }
        }
    }
    public static void main(String[] args) {
        SpringApplication.run(DemoServiceApplication.class, args);
    }

}
