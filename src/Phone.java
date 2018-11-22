public interface Phone {
    void addContact(Contact contact);
    void allContacts();
    void text(String number, String message);
    void allMessages (String number);
    void call(String phoneNumber);
    void callHistory();
}
