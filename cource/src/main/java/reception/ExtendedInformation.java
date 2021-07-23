package reception;

import interfaces.Conversation;

public class ExtendedInformation extends Reception implements Conversation {
    private int number = "369"
    public ExtendedInformation(int number){
        this.number = number;
    }
    public ExtendedInformation() {
    }

    @Override
    public void StartOfConversation() {
        System.out.println("Hear you found extended information");
    }
}
