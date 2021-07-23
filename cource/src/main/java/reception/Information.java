package reception;

import interfaces.Conversation;

public class Information extends Reception implements Conversation {
    private String administrator = "Marina";

    public Information (String administrator){

        this.administrator = administrator;
    }
    public Information() {
    }

    @Override
    public void NameOfAdministrator() {

        System.out.println(administrator);
    }

    @Override
    public void StartOfConversation() {
        System.out.println("Hello. I can help you with the information about patients and doctors.");
    }
}
