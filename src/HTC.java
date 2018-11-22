public abstract class HTC implements Phone {
    private int batterylife = 20;
    private CallHistoryList[] calls = null;
    private ContactList [] contacts = null;
    private MessageList [] messages = null;
    private int i;
    private int j;
    private int k;


     public HTC () {
         this.calls = new CallHistoryList[5];
         this.contacts = new ContactList[2];
         this.messages = new MessageList[4];
         this.i = i;
         this.j = j;
         this.k = k;
     }

    @Override

    public void addContact(Contact contact) {
         ContactList ContactList = new ContactList(contact);
         contacts[i] = ContactList;
         i++;
    }

    @Override

    public void allContacts() {
        System.out.println("Contacts:");
        System.out.println("-------------------");
        for (ContactList contact: contacts) {
            if(contact !=null) {
                System.out.println(contact.getContact().toString());
            }
        }
    }

    @Override

    public void text(String number, String message) {
     if(message.length() < 500) {
       MessageList messageList = new MessageList(number, message);
       messages[j] = messageList;
       j++;
         System.out.println("You sent a text to: " + number);
       } else {
         System.out.println("Your message has to be between 1 and 500 characters long!");
       }
     }

     @Override

     public void allMessages(String number) {
         System.out.println("List all messages from :" + number);
         System.out.println("----------------------------");
         for (MessageList message: messages) {
             if(message != null && message.getNumber() == number) {
                 System.out.println(message.getMessage().toString());
             }
         }
     }

     @Override

     public void call(String phoneNumber) {
         CallHistoryList callHistoryList = new CallHistoryList(phoneNumber);
         calls[k] = callHistoryList;
         k++;
         System.out.println("You called:" + phoneNumber);
     }

     @Override

    public void callHistory() {
         System.out.println("Recent call history:");
         System.out.println("-----------------------------");
         for (CallHistoryList call: calls) {
             if(call !=null) {
                 System.out.println(call.getNumber().toString());
             }
         }
     }

    public int getBatterylife() {
        return batterylife;
    }

    public void setBatterylife(int batterylife) {
        this.batterylife = batterylife;
    }

    public void getBatteryAfterMessage() {
         if(batterylife > 1) {
             batterylife -= 1;
             System.out.println("You have :" +batterylife+ "hours of battery life left ");
         } else {
             System.out.println("Not enough battery to send message!");
         }
    }

    public void getBatteryAfterCall() {
         if(batterylife > 2) {
             batterylife -=2;
             System.out.println("You have :" +batterylife+ "hours of battery life left ");
         } else {
             System.out.println("Not enought battery to call!");
         }
     }
}