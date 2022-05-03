package com.greenfox.todo;

import com.greenfox.todo.model.Assignee;
import com.greenfox.todo.model.Todo;
import com.greenfox.todo.repositories.AssigneesRepository;
import com.greenfox.todo.repositories.TodoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class TodoApplication implements CommandLineRunner {

	final TodoRepository todoRepository;

	private final AssigneesRepository assigneesRepository;
	public static void main(String[] args) {
		SpringApplication.run(TodoApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		Todo todo1 = new Todo();
		Todo todo2 = new Todo();
		Todo todo3 = new Todo();
		Todo todo4 = new Todo();

		todo1.setTitle("Study");
		todo2.setTitle("Finish workshop");
		todo3.setTitle("Look on MR");
		todo4.setTitle("Take break");


		todo1.setUrgent(true);
		todo4.setDone(true);

		Assignee peter = new Assignee("Peter");
		Assignee patrik = new Assignee("Patrik");
		todo2.setAssignee(peter);

		assigneesRepository.save(peter);
		assigneesRepository.save(patrik);

		todoRepository.save(todo1);
		todoRepository.save(todo2);
		todoRepository.save(todo3);
		todoRepository.save(todo4);
	}
}
