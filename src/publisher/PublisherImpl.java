package publisher;

import other.Message;
import service.PubSubService;

public class PublisherImpl implements Publisher {
    @Override
    public void publish(Message message, PubSubService pubSubService) {
        pubSubService.addMessageToQueue(message);
    }
}
