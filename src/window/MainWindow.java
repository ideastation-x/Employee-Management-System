package window;

import java.util.Scanner;

/**
 * MainManagementWindow Class หน้าต่างหลักสำหรับการเลือก Menu ของตัวโปรแกรม
 *
 * @author Siripong Phiwkhaw
 */
public class MainWindow {
    private final MinorWindow minorManagementWindow;

    /**
     * Constructor สร้าง MinorManagementWindow Object เมื่อมีการสร้าง MainManagementWindow Object
     */
    public MainWindow() {
        minorManagementWindow = new MinorWindow();
    }

    /**
     * Method หน้าต่างหลักในการเลือก Menu ที่ต้องการ
     * <p>
     * เรียกใช้ showMenu() เพื่อแสดงหน้าต่าง Menu ทั้งหมด
     * numberMenu เลือก Menu ที่ต้องการ โดยรับค่าจาก User
     */
    public void mainMenu() {
        int numberMenu;
        Scanner scanner = new Scanner(System.in);
        try {
            do {
                showMenu();
                System.out.print("Choose Menu [1-5] -> ");
                numberMenu = scanner.nextInt();
                selectedMenu(numberMenu);
            } while (numberMenu != 0);
        } catch (Exception e) {
            System.out.println("< Input Not Match >");
        }
    }

    /**
     * Method หน้าต่างแสดง Menu ทั้งหมด
     * 1) เพิ่มข้อมูลพนักงาน
     * 2) ลบข้อมูลพนักงาน
     * 3) แสดงข้อมูลพนังงานทั้งหมด
     * 4) ค้นหาข้อมูลพนักงาน
     * 5) แก้ไขข้อมูลพนักงาน
     * 0) ออกจากโปรแกรม
     */
    private void showMenu() {
        System.out.println("+-------------------------------+");
        System.out.println("|   Employee Management System  |");
        System.out.println("|      1) Add Employees         |");
        System.out.println("|      2) Delete Employees      |");
        System.out.println("|      3) View All Employees    |");
        System.out.println("|      4) Search Employees      |");
        System.out.println("|      5) Edit Detail           |");
        System.out.println("|      0) Exit Program          |");
        System.out.println("+-------------------------------+");
    }

    /**
     * Method หน้าต่างเลือก Menu ที่ต้องการ
     * ใช้ Switch ในการเลือก
     * case -> 1) เพิ่มข้อมูลพนักงาน
     * case -> 2) ลบข้อมูลพนักงาน
     * case -> 3) แสดงข้อมูลพนังงานทั้งหมด
     * case -> 4) ค้นหาข้อมูลพนักงาน
     * case -> 5) แก้ไขข้อมูลพนักงาน
     * case -> 0) ออกจากโปรแกรม
     *
     * @param numberMenu เลือก Menu รับค่าเป็น int เพื่อการหา case ที่ตรงกัน
     */
    private void selectedMenu(int numberMenu) {
        switch (numberMenu) {
            case 1 -> this.minorManagementWindow.addEmployeeWindow();
            case 2 -> this.minorManagementWindow.deleteEmployeeWindow();
            case 3 -> this.minorManagementWindow.listEmployeeWindow();
            case 4 -> this.minorManagementWindow.searchWindow();
            case 5 -> this.minorManagementWindow.editEmployeeWindow();
            case 0 -> System.out.println("< END PROGRAM >");
            default -> System.out.println("< Incorrect Number >");
        }
    }

}