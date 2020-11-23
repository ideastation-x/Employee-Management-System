package window;

import management.EmployeeManagement;
import management.JobManagement;

import java.util.Scanner;

/**
 * MinorManagementWindow Class หน้าต่างการทำงานของแต่ละ Menu ที่เลือก
 *
 * @author Siripong Phiwkhaw
 */
public class MinorWindow {
    private final EmployeeManagement employeeManagement;
    private final JobManagement jobManagement;

    /**
     * Constructor สร้าง EmployeeManagement, JobManagement Object เมื่อมีการสร้าง MinorManagementWindow Object
     *
     * Add Employees 4 คน ในการ Test Program
     */
    public MinorWindow() {
        employeeManagement = new EmployeeManagement();
        jobManagement = new JobManagement();
        this.employeeManagement.addEmployee("Johnny English",24, jobManagement.salaryOfJob(1), "0813267546", "johnny@outlook.com",jobManagement.jobPosition(1) );
        this.employeeManagement.addEmployee("Beth Washington",23, jobManagement.salaryOfJob(2), "0854313211", "beth_wa@hotmail.com",jobManagement.jobPosition(2) );
        this.employeeManagement.addEmployee("Mike Tiger",30, jobManagement.salaryOfJob(3), "0843215313", "mike@gmail.com",jobManagement.jobPosition(3) );
        this.employeeManagement.addEmployee("Tu Texas",19, jobManagement.salaryOfJob(4), "0832198746", "tu_thailand@outlook.com",jobManagement.jobPosition(4) );
    }

    /**
     * Method หน้าต่างการเพิ่มข้อมูลของพนักงานบริษััท
     * <p>
     * ระบุชื่อ, อายุ, เบอร์โทรศัพท์, อีเมลล์, ตำแหน่งงาน
     * เมื่อมีการระบุตำแหน่งงาน jobManagement จะไประบุเงินเดือนเริ่มต้นให้ตาม jobPosition
     */
    public void addEmployeeWindow() {
        String name, email, contactNumber;
        int age, jobPosition;
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n-- Add Employee Detail --");
        try {
            System.out.print("Name: ");
            name = scanner.next();
            System.out.print("Age: ");
            age = scanner.nextInt();
            System.out.print("Contact Number: ");
            contactNumber = scanner.next();
            System.out.print("Email: ");
            email = scanner.next();
            do {
                System.out.print("Valid Job Position: [1.Manager] [2.Sale] [3.Programmer] [4.Designer] \n");
                System.out.print("Job Position: ");
                jobPosition = scanner.nextInt();
            } while (jobPosition != 1 && jobPosition != 2 && jobPosition != 3 && jobPosition != 4);
            this.employeeManagement.addEmployee(name, age, jobManagement.salaryOfJob(jobPosition), contactNumber, email, jobManagement.jobPosition(jobPosition));
            System.out.println("------ Add Complete ! -----\n");
        } catch (Exception e) {
            System.out.println("< Input Not Match >\n");
        }

    }

    /**
     * Method หน้าต่างการลบข้อมูลของพนักงานบริษััท โดยให้ระบุ id ในการลบข้อมูล
     * <p>
     * ระบุ id ที่ต้องการจะลบ
     */
    public void deleteEmployeeWindow() {
        if (employeeManagement.isEmployeesEmpty()) {
            System.out.println("\n< No Data >");
        } else {
            Scanner scanner = new Scanner(System.in);
            System.out.println("\n-- Which ID Do you want to Delete ? --");
            listEmployeeWindow();
            System.out.print("ID To Delete: ");
            try {
                if(this.employeeManagement.deleteEmployee(scanner.nextInt()))
                    System.out.println("---------- Delete Complete ! -----------\n");
                else
                    System.out.println("< ID Not Found >\n");
            } catch (Exception e) {
                System.out.println("< Input Not Match >\n");
            }
        }
    }

    /**
     * Method หน้าต่างดูข้อมูลของพนักงานบริษัททั้งหมด
     */
    public void listEmployeeWindow() {
        if (employeeManagement.isEmployeesEmpty()) {
            System.out.println("\n< No Data >");
        } else {
            System.out.println("\n------------------------------ Employee List ------------------------------------------");
            System.out.printf("%-10s %-15s %-10s %-12s %-15s %-25s %s \n", "ID","Name","Age","Salary","Contact","Email","Job");
            this.employeeManagement.listEmployee();
            System.out.println("--------------------------------------------------------------------------------------- \n");
        }
    }

    /**
     * Method หน้าต่างการหาข้อมูลของพนักงานบริษัท โดยให้ระบุ id ในการหาข้อมูล
     * <p>
     * ระบุ id ที่ต้องการหาข้อมูลพนักงานบริษัท
     */
    public void searchWindow() {
        if (employeeManagement.isEmployeesEmpty()) {
            System.out.println("\n< No Data >");
        } else {
            Scanner scanner = new Scanner(System.in);
            System.out.println("\n-- Which ID Do you want to Search ? --");
            System.out.print("ID To Search: ");
            try {
                if(this.employeeManagement.searchEmployee(scanner.nextInt()))
                    System.out.println("--------- Search Complete ! ----------\n");
                else
                    System.out.println("< ID Not Found >\n");
            } catch (Exception e) {
                System.out.println("< Input Not Match >\n");
            }
        }
    }

    /**
     * Method หน้าต่างแก้ไขข้อมูลของพนักงานบริษัท โดยให้ระบุ id ที่ต้องการแก้และระบุ edit ที่ต้องการแก้ข้อมูลของอะไร
     * <p>
     * ระบุ id ต้องการแก้ไขไอดีคนไหน
     * ระบุ edit ข้อมูลที่ต้องการแก้ไข
     */
    public void editEmployeeWindow() {
        if (employeeManagement.isEmployeesEmpty()) {
            System.out.println("\n< No Data >");
        } else {
            int id, edit;
            Scanner scanner = new Scanner(System.in);
            System.out.println("\n-- Which ID Do you want to Edit ? --");
            System.out.print("ID To Edit: ");
            try {
                id = scanner.nextInt();
                do {
                    if(this.employeeManagement.searchEmployee(id)) {
                        System.out.println("-- Which Detail Do you want to Edit ? --");
                        System.out.println("1) Name");
                        System.out.println("2) Age");
                        System.out.println("3) Salary");
                        System.out.println("4) Contact Number");
                        System.out.println("5) Email");
                        System.out.println("0) Exit From Editing");
                        System.out.print("Choose Your Detail To Edit: ");
                        edit = scanner.nextInt();
                        this.employeeManagement.editEmployee(id, edit);
                    }
                    else{
                        break;
                    }
                } while (edit != 0);
                if(this.employeeManagement.searchEmployee(id))
                    System.out.println("------------- Edit Complete ! ------------\n");
                else
                    System.out.println("< ID Not Found >\n");
            } catch (Exception e) {
                System.out.println("< Input Not Match >\n");
            }
        }
    }
}
