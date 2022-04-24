package com.greenfox.todo;

import com.greenfox.todo.model.Todo;
import com.greenfox.todo.repositories.TodoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class TodoApplication implements CommandLineRunner {

	final TodoRepository todoRepository;
	public static void main(String[] args) {
		SpringApplication.run(TodoApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		Todo todo1 = new Todo();
		Todo todo2 = new Todo();

		todo1.setTitle("Study");
		todo2.setTitle("Finish workshop");

		todoRepository.save(todo1);
		todoRepository.save(todo2);
	}
}
