package ir.fassih.example.applicationevents.subscriper;

import ir.fassih.example.applicationevents.event.EventA;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class EventASubscriber implements ApplicationListener<EventA> {


    @Override
    public void onApplicationEvent(EventA event) {
        log.info("received new event {} from {} at {}", event.getMessage(), event.getSource(), event.getTimestamp());
    }


}
