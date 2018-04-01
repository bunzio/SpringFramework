package Bunzio.SpringFramework;

import Bunzio.SpringFramework.domain.Castle;
import Bunzio.SpringFramework.domain.Knight;
import Bunzio.SpringFramework.domain.Quest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by Bunzio on 01.04.2018
 * Contact: bunzeladam@gmail.com
 */
@Component
public class Starter implements CommandLineRunner {

    @Autowired
    Castle castle;

    @Override
    public void run(String... args) throws Exception {

        System.out.println(castle);


    }


}
