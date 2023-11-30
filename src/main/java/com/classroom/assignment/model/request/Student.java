package com.classroom.assignment.model.request;

public class Student {
  private String id;
  private String name;
  private String dep;

  public Student(String id, String name, String dep) {
    this.setId(id);
    this.setName(name);
    this.setDep(dep);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getDep() {
    return dep;
  }

  public void setDep(String dep) {
    this.dep = dep;
  }
}
