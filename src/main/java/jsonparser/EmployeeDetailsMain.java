package jsonparser;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class EmployeeDetailsMain {
  public static void main(String[] args) throws IOException {
    String inputJson = "{ \"name\":\"shakti\",\"department\":\"IT\"}";
    ObjectMapper mapper = new ObjectMapper();
    EmployeeDetails.Metadata metadata = mapper.readerFor(EmployeeDetails.Metadata.class).readValue(inputJson);
    System.out.println(metadata.getDepartmentName());
    System.out.println(metadata.getEmployeeName());
    System.out.println(metadata.setEmployeeDept("Finance").getDepartmentName());
    System.out.println(metadata.setEmployeeNameAndDept("Biman","Finance"));

  }
}
