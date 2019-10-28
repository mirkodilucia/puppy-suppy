package it.dlmrk.puppysuppy.publisher;

import it.dlmrk.puppysuppy.driver.Message;
import it.dlmrk.puppysuppy.service.PubSubService;

public class PublisherImpl implements Publisher {

    //Publishes new message to PubSubService
    @Override
    public void publish(Message message, PubSubService pubSubService) {
        pubSubService.addMessageToQueue(message);
    }
}