package first.reddisdemo.model;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
@Setter
@Getter
@ToString
public class User
{
private int id;
private String firstname;
private String lastname;
private String emailid;
private int age;

}
