package Bunzio.SpringFramework.domain;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by Bunzio on 02.04.2018
 * Contact: bunzeladam@gmail.com
 */
public class QuestTest {
    @Test
    public void questToStringMessage(){
        Quest quest = new Quest();
        String except = "Uratuj Ksiezniczke";
        assertEquals(except, quest.toString());

    }
}
