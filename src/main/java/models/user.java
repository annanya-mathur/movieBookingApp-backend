package models;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
@NoArgsConstructor
@AllArgsConstructor
public class user {

       @Id
       private String userId;

       @NotBlank
       private String firstName;

       @NotBlank
       private String lastName;

       @Email
       @NotBlank
       private String email;

       @NotBlank
       private String loginId;

       @NotBlank
       @Size(min = 8, message = "Password must be at least 8 characters long")
       @Pattern(
               regexp = "^(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=!]).*$",
               message = "Password must contain at least one uppercase letter, one number, and one special character"
       )
       private String password;

       @NotBlank
       @Size(min = 8, message = "Confirm Password")
       @Pattern(
               regexp = "^(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=!]).*$",
               message = "Password must contain at least one uppercase letter, one number, and one special character"
       )
       private String confirmPassword;

       @NotBlank(message = "Phone number is required")
       @Size(min = 10, max = 15, message = "Phone number must be between 10 and 15 digits")
       @Pattern(regexp="^\\+?[0-9]{10,15}$", message="Invalid phone number format")
       private String contactNumber;

}
