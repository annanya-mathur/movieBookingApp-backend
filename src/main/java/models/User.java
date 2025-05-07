package models;
import dto.userRegistrationRequest;
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
public class User {

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

       public User(userRegistrationRequest registrationRequest , String role , String password) {
              this.firstName= registrationRequest.getFirstName();
              this.lastName= registrationRequest.getLastName();
              this.email= registrationRequest.getEmail();
              this.role=role;
              this.loginId=registrationRequest.getLoginId();
              this.password=password;
              this.contactNumber=registrationRequest.getContactNumber();
       }
}
