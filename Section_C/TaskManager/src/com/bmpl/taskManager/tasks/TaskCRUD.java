package com.bmpl.taskManager.tasks;

import java.util.ArrayList;

public class TaskCRUD {
	ArrayList<Task> taskList;
	public TaskCRUD() {
		taskList = new ArrayList<>();
	}
	public void addTask(String taskName, String taskDesc) {
		Task task = new Task();
		task.setTaskName(taskName);
		task.setTaskDesc(taskDesc);
		taskList.add(task);
	}
	public void deleteTask() {
		
	}
	public void printTask() {
		
	}
	public void updateTask() {
		
	}
}
