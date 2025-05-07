package models;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "users")
@NoArgsConstructor
@AllArgsConstructor
public class user {

       @Id
       private String userId;
       private String firstName;
       private String lastName;

       @Indexed (unique = true)
       private String email;
       private String role;

       @Indexed (unique = true)
       private String loginId;
       private String password;
       private String contactNumber;

}
