package Bunzio.SpringFramework.domain;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
/**
 * Created by Bunzio on 02.04.2018
 * Contact: bunzeladam@gmail.com
 */
public class KnightTest {

    @Test
    public void knightToStringMessage(){
        Quest quest = new Quest();
        Knight knight = new Knight("Lancelot",29);
        knight.setQuest(quest);
        String except = "Rycerz o imieniu: Lancelot (29 lat). Zadanie: Uratuj Ksiezniczke";
        assertEquals(except, knight.toString());
    }

    @Test
    public void setQuestTest(){
        Quest quest = new Quest();
        Knight knight = new Knight();
        knight.setQuest(quest);
        assertEquals(quest, knight.getQuest());
    }

    @Test
    public void getQuestTest(){
        Quest quest = new Quest();
        Knight knight = new Knight();
        knight.setQuest(quest);
        assertEquals(quest, knight.getQuest());
    }
}
