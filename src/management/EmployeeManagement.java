package management;

import data.Employees;
import data.JobPosition;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * EmployeeManagement Class เก็บข้อมูลของพนักงานบริษัทเป็น ArrayList ของ Employees
 *
 * @author Phumin Chumphu
 */
public class EmployeeManagement {
    ArrayList<Employees> employees = new ArrayList<>(); //

    /**
     * Constructor เมื่อมีการสร้าง Object EmployeesManagement ไม่ต้องทำอะไรใน Constructor
     */
    public EmployeeManagement() {
        // Nothing to do
    }

    /**
     * Method เช็คข้อมูลใน Collection ของ ArrayList
     *
     * @return true ถ้า Collection ใน ArrayList นั้น ว่าง; false ถ้า Collection ใน ArrayList นั้น มีข้อมูลของพนักงานบริษัทอยู่
     */
    public boolean isEmployeesEmpty(){
        return this.employees.isEmpty(); // Check data in collection
    }

    /**
     * Method ในการเพิ่มข้อมูลของพนักงานบริษัทลงใน Collection ของ ArrayList โดยมีการระบุ ชื่อ, อายุ, เงินเดือน, เบอร์โทรศัพท์, อีเมลล์, ตำแหน่งงาน
     *
     * @param name ชื่อ รับค่าเป็น String
     * @param age อายุ รับค่าเป็น Integer
     * @param salary เงินเดือน รับค่าเป็น Long
     * @param contactNumber เบอร์โทรศัพท์ รับค่าเป็น Long
     * @param email อีเมลล์ รับค่าเป็น String
     * @param jobPosition ตำแหน่งงาน รับค่าเป็น Enum jobPosition
     */
    public void addEmployee(String name, int age, double salary, String contactNumber, String email, JobPosition jobPosition) {
        employees.add(new Employees(name, age, salary, contactNumber, email, jobPosition)); // Add data in collection
    }

    /**
     * Method สำหรับการลบข้อมูลของพนักงานบริษัท โดยให้ระบุ id ในการลบข้อมูล
     *
     * @param id ไอดี รับค่าจาก Scanner ที่ User ต้องการลบ
     */
    public boolean deleteEmployee(int id) {
        for (Employees e : employees) {
            if (id == e.getId()) {
                employees.remove(e);
                return true;
            }
        }
        return false;
    }

    /**
     * Method สำหรับการเรียกดูข้อมูลของพนักงานบริษัททั้งหมด
     *
     * id, name, age, salary, contactNumber, email, jobPosition
     */
    public void listEmployee() {
        for(Employees e : employees) {
            System.out.printf("%-5s %-20s %-10s %-12s %-15s %-25s %s \n",e.getId(),e.getName(),e.getAge(),e.getSalary(),e.getContactNumber(),e.getEmail(),e.getJobPosition());
        }
    }

    /**
     * Method สำหรับการหาข้อมูลของพนักงานบริษัท โดยให้ระบุ id ในการหาข้อมูล
     *
     * @param id ไอดี รับค่าจาก Scanner ที่ User ต้องการหา
     */
    public boolean searchEmployee(int id) {
        for (Employees e : employees) {
            if (id == e.getId()) {
                System.out.println(e);
                return true;
            }
        }
        return false;
    }

    /**
     * Method สำหรับการแก้ไขข้อมูลของพนักงานบริษัท โดยให้ระบุ id ที่ต้องการแก้และระบุ edit ที่ต้องการแก้ข้อมูลของอะไร
     * ใช้ Switch ในการแก้ไขข้อมูล
     * case 1 -> แก้ไขชื่อ
     * case 2 -> แก้ไขอายุ
     * case 3 -> แก้ไขเงินเดือน
     * case 4 -> แก้ไขเบอร์โทรศัพท์
     * case 5 -> แก้ไขอีเมลล์
     *
     * @param id ไอดี รับค่าจาก Scanner ที่ User ต้องการแก้ไขไอดีคนไหน
     * @param edit ข้อมูลที่ต้องการแก้ไข รับค่าจาก Scanner ที่ User ต้องการแก้ไขข้อมูลของอะไร
     */
    public void editEmployee(int id, int edit) {
        Scanner scanner = new Scanner(System.in);
        for (Employees e : employees) {
            if (id == e.getId()) {
                switch (edit) {
                    case 1 -> {
                        System.out.print("Set Name: ");
                        e.setName(scanner.nextLine());
                    }
                    case 2 -> {
                        System.out.print("Set Age: ");
                        e.setAge(scanner.nextInt());
                    }
                    case 3 -> {
                        System.out.print("Set Salary: ");
                        e.setSalary(scanner.nextDouble());
                    }
                    case 4 -> {
                        System.out.print("Set Contact Number: ");
                        e.setContactNumber(scanner.nextLine());
                    }
                    case 5 -> {
                        System.out.print("Set Email: ");
                        e.setEmail(scanner.nextLine());
                    }
                }
            }
        }
    }

}
