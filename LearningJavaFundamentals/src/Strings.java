public class Strings {
    public static void main(String[] args) {
        String firstDay = "Sunday";
        String nextDay = firstDay.equals("Sunday") ? "Monday" : "Tuesday";
        System.out.println(nextDay);

        String name = "Sandra Burnside";
        int position = name.indexOf(" ");
        String surname = name.substring(position +1, name.length());
        boolean evenLength = surname.length() % 2 == 0;
        System.out.println(surname);
        System.out.println(evenLength);

        String greetings = String.format("Good morning %s today is %s.", surname, nextDay);
        System.out.println(greetings);

        String colours = "blue, red, green, orange, purple";
        String [] coloursArray = colours.split(", ");
        for (String colour : coloursArray){
            System.out.println(colour);
        }

    }
}
