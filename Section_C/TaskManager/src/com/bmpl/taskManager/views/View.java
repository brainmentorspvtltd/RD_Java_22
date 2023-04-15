package com.bmpl.taskManager.views;

import java.util.Scanner;

import com.bmpl.taskManager.tasks.TaskCRUD;

public class View {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		// Add messages.properties file and 
		// read all messages from that file
		System.out.println("1. Enter new task : ");
		System.out.println("2. Print all task : ");
		System.out.println("3. Delete task : ");
		System.out.println("4. Update task : ");
		System.out.println("Enter your choice : ");
		
		String choice = scanner.nextLine();
		switch (choice) {
		case "1": {
			System.out.println("Enter Task Name : ");
			String taskName = scanner.nextLine();
			System.out.println("Enter Task Desc : ");
			String taskDesc = scanner.nextLine();
			// Make object of TaskCRUD
			// call addTask and pass taskName and desc
			TaskCRUD crud = new TaskCRUD();
			crud.addTask(taskName, taskDesc);
		}
		default:
			
		}
		
		scanner.close();

	}

}
