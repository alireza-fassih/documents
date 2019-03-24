package ir.fassih.example.applicationevents.event;

import lombok.Builder;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;


@Getter
public class EventA extends ApplicationEvent {

    private final String message;

    @Builder
    public EventA(Object source, String message) {
        super(source);
        this.message = message;
    }

}
