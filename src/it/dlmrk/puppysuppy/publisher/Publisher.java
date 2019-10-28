package it.dlmrk.puppysuppy.publisher;

import it.dlmrk.puppysuppy.driver.Message;
import it.dlmrk.puppysuppy.service.PubSubService;

public interface Publisher {

    //Publishes new message to PubSubService
    void publish(Message message, PubSubService pubSubService);
}