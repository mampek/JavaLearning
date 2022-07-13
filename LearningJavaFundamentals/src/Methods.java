public class Methods {
    public static void main(String[] args) {
        for (String arg : args) {
            System.out.println(arg);
        }
        int result = whoIsOlder(5, 4);
        System.out.println(result);
        NameManager nameManager = new NameManager();

        System.out.println(nameManager.getFirstName());
        System.out.println(nameManager.getSurname());
    }

    public static int whoIsOlder(int age1, int age2) {
        if (age1 > age2) {
            return age1;
        } else {
            return age2;
        }
    }

    public static boolean longerThan5(String word){
//        if(word.length() > 5){
//            return true;
//        }
//        else {
//            return  false;
//        }
//        return word.length() > 5 ? true : false;
        return word.length() > 5;

    }
}