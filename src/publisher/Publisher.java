package publisher;

import other.Message;
import service.PubSubService;

public interface Publisher {
    // Publishes new message to PubSubService
    void publish(Message message, PubSubService pubSubService);
}
