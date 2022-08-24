package eventRegister.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private int id;
    private String name;
    private String surname;
    private String email;
    private int eventID;

    public User(String name, String surname, String email, int eventID) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.eventID = eventID;
    }
}
