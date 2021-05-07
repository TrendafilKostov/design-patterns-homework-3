package Package;

import org.apache.commons.io.input.ObservableInputStream;

public interface MessageMediator {

        void addUser(User user);
        void sendMessage(String message, User user);


    }
