public class ContactList {
    private Contact contact;

    public ContactList(Contact contact) {
        this.contact = contact;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    @Override

    public String toString() {
        return "ContactList{" + "contact='" + contact + '\'' + '}';
    }
}
