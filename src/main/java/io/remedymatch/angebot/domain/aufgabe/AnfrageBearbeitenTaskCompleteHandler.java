package io.remedymatch.angebot.domain.aufgabe;

import io.remedymatch.anfrage.domain.AnfrageRepository;
import io.remedymatch.aufgabe.domain.handler.TaskCompleteHandler;
import io.remedymatch.engine.TaskDTO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Map;

@AllArgsConstructor
@Component
public class AnfrageBearbeitenTaskCompleteHandler implements TaskCompleteHandler {

    private final AnfrageRepository anfrageRepository;

    @Override
    public void taskPruefen(TaskDTO taskDTO, Map<String, Object> variables) {

    }

    @Override
    public String taskKey() {
        return AnfrageBearbeitenTaskContstants.TASK_KEY;
    }
}
