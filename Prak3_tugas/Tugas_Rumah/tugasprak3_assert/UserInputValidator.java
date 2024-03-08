/*Nama : Alfonso Clement Sutantio
 * NIM : 24060122130080
 * Tugas : Praktikum 3
 * Lab : D1
 */ 
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UserInputValidator {
    public static void validateUsername(String username) {
        // Assertion yang memenuhi persyaratan username menggunakan regex
        String regex = "^[a-zA-Z][a-zA-Z0-9_]{4,19}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(username);
        assert(username.length()>=5):"Username must be at least 5 characters long";
        assert(username.length()<=20):"Username must be at most 20 characters long";
        assert(matcher.find()):"Invalid username";
    }
  
    public static void validateEmail(String email) {
        // Assertion yang memenuhi persyaratan email
        String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        assert(matcher.find()):"Invalid email address";
    }
  
    public static void validateAge(int age) {
        // Assertion yang memenuhi persyaratan usia
        assert(age>=17 && age<=99):"Age must be between 17 and 99";
    }
  }
  