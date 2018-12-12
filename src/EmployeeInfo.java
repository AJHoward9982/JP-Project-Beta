/**
 * Andrew Howard
 *
 * User gives their Name and ID
 */

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmployeeInfo {

  StringBuilder name;
  String code;

  private String deptId;
  private Pattern pattern = Pattern.compile("[A-Z][a-z]{3}[0-9]{2}");
  private Scanner sc = new Scanner(System.in);


  /**
   * Default Constructor
   */
  public EmployeeInfo() {

    setName();
    setDeptId();
    sc.close();

  }

  /**
   * Gets the Employee Name
   *
   * @return the employee name
   */
  public StringBuilder getName() {

    return name;

  }

  /**
   * Getter for Employee Code
   *
   * @return Employee Code
   */
  public String getCode() {

    return code;

  }

  /**
   * Setter for Employee Name
   */
  private void setName() {

    String employeeName = inputName();

    name = new StringBuilder(employeeName);

    createEmployeeCode(name);

  }


  /**
   * Takes the first letter of the Employees name and adds it to the last name
   */
  private void createEmployeeCode(StringBuilder name) {

    int nameSplit = name.indexOf(" ");

    String lastName = name.substring((nameSplit + 1), name.length());

    code = name.charAt(0) + lastName;
  }


  /**
   * Gets the Employees input for name
   *
   * @return First and LAst name of Epmloyee
   */
  private String inputName() {

    System.out.println("Please enter your first and last name:");

    StringBuilder employeeInput = new StringBuilder(sc.nextLine());

    boolean nameSplitter = checkName(employeeInput);



    if (nameSplitter) {

      createEmployeeCode(employeeInput);

    } else {

      code = "guest";

    }

    return employeeInput.toString();
  }

  /**
   * Checks the name for the nameSplitter
   */
  private boolean checkName(StringBuilder name) {

    return name.toString().contains(" ");

  }


  /**
   * Setter for the Department ID
   */
  public String setDeptId() {

    System.out.println("Please enter the department ID:");

    String employeeIDInput = sc.nextLine();

    if (validId(employeeIDInput)) {

      return employeeIDInput;

    } else {

      return "None01";

    }

  }

  /**
   * Getter for department ID
   */
  private String getDeptId() {

    return this.deptId;

  }


  /**
   * Checks that the ID is valid by using Regular Expressions
   *
   * @return True or False match for "Valid ID"
   */
  private boolean validId(String id) {

    Matcher matchId = pattern.matcher(id);
    return matchId.matches();
  }

  /**
   * Reverses the Employee Name
   *
   * @return reverse employee information
   */
  public String reverseString(String id) {

    StringBuilder stringBuilder = new StringBuilder(id);

    stringBuilder = stringBuilder.reverse();

    return stringBuilder.toString();
  }

  /**
   * New formatted toString() method to output Employee Code and ID number
   *
   * @return printed out version of employee code and department number.
   */
  @Override
  public String toString() {

    return "Employee Code: " + code + "\n"
        + "Department Number: " + deptId;
  }

}
