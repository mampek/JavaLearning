public class NameManager {
    String fullName = "Krystian Mampe";
    public String getFirstName(){
        String [] values = fullName.split(" ");
        return values[0];
    }

    public String getSurname(){
        String [] values = fullName.split(" ");
        return values[values.length - 1];
    }
}
