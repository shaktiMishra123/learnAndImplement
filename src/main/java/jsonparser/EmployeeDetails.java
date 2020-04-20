package jsonparser;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public  class EmployeeDetails {

  public static class Metadata{
  @JsonProperty("name")  // can be asked to ss
  private final String employeeName;
  @JsonProperty("department")  // can be asked to ss
  private final String departmentName;

    @Override
    public String toString() {
      return "Metadata{" +
          "employeeName='" + employeeName + '\'' +
          ", departmentName='" + departmentName + '\'' +
          '}';
    }

    public String getEmployeeName() {
      return employeeName;
    }

    public String getDepartmentName() {
      return departmentName;
    }

    @JsonCreator // can be asked to ss
    public Metadata(@JsonProperty("name") String employeeName, @JsonProperty("department") String departmentName) {
      this.employeeName = employeeName;
      this.departmentName = departmentName;
    }

    public Metadata setEmployeeName(String employeeName){
      return new Metadata(employeeName,departmentName);
    }

    public Metadata setEmployeeDept(String dept){
      return new Metadata(employeeName,dept);
    }

    public Metadata setEmployeeNameAndDept(String employeeName,String dept){
      return new Metadata(employeeName,dept);
    }
  }
}
