public class Main {

    public static void main(String[] args) {

       Phone htc = new HTCOne("125662362", "red", "aluminium");
       Phone samsung = new SamsungS5("45634122", "black", "plastic");

       Contact friend1 = new Contact("Calin", "0741490122", 1);
       Contact friend2 = new Contact("Sergiu", "0748512629", 2);
       Contact friend3 = new Contact("Carmen", "0751341555", 3);

       samsung.addContact(friend2);
       samsung.addContact(friend3);
       samsung.allContacts();
       samsung.call("0751341555");
       samsung.callHistory();
       samsung.text("0751341555", "Are you still upset?");
       samsung.text("0751341555", "Glad you can come!");
       samsung.allMessages("0751341555");

       htc.addContact(friend1);
       htc.addContact(friend2);
       htc.allContacts();
       htc.call("0741490122");
       htc.call("0748512629");
       htc.callHistory();
       htc.text("0748512629", "Want to go out?");
       htc.text("0748512629", "See you tomorrow!");
       htc.text("0741490122", "Hey, can't make it on time.");
       htc.allMessages("0748512629");

    }
}
