package io.projects.tmptool.services;

import io.projects.tmptool.dto.Task;
import io.projects.tmptool.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public Task saveOrUpdateTask(Task task) {
        return taskRepository.save(task);
    }

}
