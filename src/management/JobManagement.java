package management;

import data.JobPosition;

/**
 * JobManagement Class ในการจัดการส่วนของเงินเดือนในแต่ละตำแหน่งงาน
 *
 * @author Vichayaphat Patthikarnsakul
 */
public class JobManagement {

    /**
     * Constructor เมื่อมีการสร้าง Object JobManagement ไม่ต้องทำอะไรใน Constructor
     */
    public JobManagement() {
        //nothing to do
    }

    /**
     * Method ในการระบุเงินเดือนเริ่มต้นของพนักงานบริษัท โดยใช้ jobPosition เป็นตัวกำหนด
     * ใช้ Switch ในการระบุข้อมูล
     * case 1 -> Manager เงินเดือน 95000 บาท
     * case 2 -> Sale เงินเดือน 55000 บาท
     * case 3 -> Programmer เงินเดือน 85000 บาท
     * case 4 -> Designer เงินเดือน 75000 บาท
     * default -> Show Error Message
     *
     * @param jobPosition ตำแหน่งงาน รับค่า int ในการหา case ที่ได้กำหนดไว้
     * @return เงินเดือนเริ่มต้นของพนักงานตามตำแหน่งที่ได้กำหนดไว้เป็น double
     */
    public double salaryOfJob(int jobPosition) {
        return switch (jobPosition) {
            case 1 -> 95000;
            case 2 -> 55000;
            case 3 -> 85000;
            case 4 -> 75000;
            default -> throw new IllegalStateException("< None >");
        };
    }

    /**
     * Method ในการระบุตำแหน่งงานให้พนักงานบริษัท
     * case 1 -> Manager
     * case 2 -> Sale
     * case 3 -> Programmer
     * case 4 -> Designer
     * default -> Show Error Message
     *
     * @param jobPosition ตำแหน่งงาน รับค่า int ในการหา case ที่ได้กำหนดไว้
     * @return ตำแหน่งงานของพนักงานบริษัทเป็น Enum ของ jobPosition
     */
    public JobPosition jobPosition(int jobPosition){
        return switch (jobPosition) {
            case 1 -> JobPosition.Manager;
            case 2 -> JobPosition.Sale;
            case 3 -> JobPosition.Programmer;
            case 4 -> JobPosition.Designer;
            default -> throw new IllegalStateException("< None >");
        };
    }
}
