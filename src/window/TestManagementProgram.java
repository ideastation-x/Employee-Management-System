package window;

/**
 * Employees Management System เรียกใช้การทำงานโปรแกรม
 *
 * @author Phumin Chumphu
 */
public class TestManagementProgram {

    /**
     * Constructor เมื่อมีการสร้าง Object TestManagementProgram ไม่ต้องทำอะไรใน Constructor
     */
    public TestManagementProgram() {
        //Nothing to do
    }

    /**
     * @param args ทำงานทั้งหมดของแต่ละ Statement ด้านใน
     *
     * สร้าง Object MainManagementWindow
     * เรียกใช้งาน mainMenu(); สำหรับการทำงานของโปรแกรมทั้งหมด
     */
    public static void main(String[] args) {
        MainManagementWindow managementSystem = new MainManagementWindow();
        managementSystem.mainMenu(); // หน้าต่างการทำงานทั้งหมด
    }
}
