/*
Definițiclasa abstractăTaskavand  atributele:taskID(String),
descriere(String)si  metodele:un  constructor  cu parametri,
 set/get, execute()(metoda  abstracta), toString()si  metodele
  equals -hashCode;De  ce  trebuie  sa  fie clasa Task abstracta?
 */

import java.util.Objects;

public abstract class Task {
    private String taskId;
    private String descriere;

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getDescriere() {
        return descriere;
    }

    public void setDescriere(String descriere) {
        this.descriere = descriere;
    }

    public Task(String taskId, String descriere) {
        this.taskId = taskId;
        this.descriere = descriere;
    }

    public abstract void execute();

    @Override
    public String toString() {
        return "Task{" +
                "taskId='" + taskId + '\'' +
                ", descriere='" + descriere + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return taskId.equals(task.taskId) && Objects.equals(descriere, task.descriere);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskId, descriere);
    }
}
