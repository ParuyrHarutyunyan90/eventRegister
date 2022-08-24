package eventRegister;

import eventRegister.manger.EventManager;
import eventRegister.manger.UserManager;
import eventRegister.model.Event;
import eventRegister.model.EventType;
import eventRegister.model.User;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        UserManager userManager = new UserManager();
        EventManager eventManager = new EventManager();
        Event event1 = new Event("aaa", "qqq", true, 22, EventType.MEETING);
        Event event2 = new Event("bbb", "qqq", true, 22, EventType.DANCE);
        Event event3 = new Event("ccc", "qqq", true, 22, EventType.FESTIVAL);

        User user1 = new User("aram", "aramyan", "aram@mail.ru", 1);
        User user2 = new User("vaxo", "aramyan", "aram@mail.ru", 3);
        User user3 = new User("valod", "aramyan", "aram@mail.ru", 2);

        eventManager.addEvent(event1);
        eventManager.addEvent(event2);
        eventManager.addEvent(event3);
        userManager.addUser(user1);
        userManager.addUser(user2);
        userManager.addUser(user3);
        eventManager.showEvents();
        userManager.showUsers();


    }
}
