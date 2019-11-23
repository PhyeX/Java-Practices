public class Main {

    public static void main(String[] args) {

        Email email = new Email("Tayyip","Barbaros");
        email.setAlternateMail("rtb.barbaros@gmail.com");
        System.out.println(email.getAlternateMail());
        System.out.println(email.showInfo());
    }
}
