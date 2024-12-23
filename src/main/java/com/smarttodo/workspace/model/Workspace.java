package com.smarttodo.workspace.model;

import java.util.List;

import com.smarttodo.task.model.Task;
import com.smarttodo.user.model.User;

import java.util.List;
import com.smarttodo.user.model.User;
import com.smarttodo.task.model.Task;

public class Workspace {
    // Attributes
    private String workspaceID;
    private String name;
    
    private String description;
    private String ownerId;
    private List<String> collaboratorIds;
    private List<String> taskIds;

    // Constructor
    public Workspace(String workspaceID, String name, String description, String ownerId) {
        this.workspaceID = workspaceID;
        this.name = name;
        this.description = description;
        this.ownerId = ownerId;
    }

    // Getters and Setters
    public String getWorkspaceID() {
        return workspaceID;
    }

    public void setWorkspaceID(String workspaceID) {
        this.workspaceID = workspaceID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOwner() {
        return ownerId;
    }

    public void setOwner(String ownerId) {
        this.ownerId = ownerId;
    }

    public List<String> getCollaborators() {
        return collaboratorIds;
    }

    public void setCollaborators(List<String> collaboratorIds) {
        this.collaboratorIds = collaboratorIds;
    }

    public List<String> getTasks() {
        return taskIds;
    }

    public void setTasks(List<String> taskIds) {
        this.taskIds = taskIds;
    }

    // Methods
    public void removeTask(int taskID) {
        // Logic to remove a task by taskID
    }

    public void addCollaborator(User user, int role) {
        // Logic to add a collaborator with a specific role
    }

    public void removeCollaborator(int userID) {
        // Logic to remove a collaborator by userID
    }

    public void editTask(Task task) {
        // Logic to edit an existing task
    }

    public void createTask(Task task) {
        // Logic to create a new task
    }

    
}


