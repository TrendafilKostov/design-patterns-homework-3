package Package;

public class Main {

    public static void main(String[] args) {
        Singleton connection = Singleton.getInstance();
        connection.errorMessage("The bot is added.");

        MessageMediator chat = new Chat();

        User user1 = new ChatUser(chat, "Joro");
        User user2 = new ChatUser(chat, "Mario");
        User user3 = new ChatUser(chat, "Trendafil");


        user1.send("Some Message");



    }

}
