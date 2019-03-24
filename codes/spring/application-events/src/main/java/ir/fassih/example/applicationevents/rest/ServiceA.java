package ir.fassih.example.applicationevents.rest;

import ir.fassih.example.applicationevents.event.EventA;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Slf4j
@RestController
@RequestMapping("/A")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class ServiceA {


    private final ApplicationEventPublisher eventPublisher;


    @GetMapping
    public void startAEvent() {

        log.info("before publish event A");

        EventA event = EventA.builder()
            .source(this)
            .message("event a")
            .build();

        eventPublisher.publishEvent(event);

        log.info("after publish event A");
    }

}
