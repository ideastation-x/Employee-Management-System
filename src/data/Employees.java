package data;

/**
 * Employees Class ของพนักงานบริษัท มี id, name, age, salary, contactNumber, email, jobPosition
 * nextId จะเพิ่มขึ้นเรื่อยๆ เมื่อมีการสร้าง Object Employees
 *
 * @author Phumin Chumphu
 */
public class Employees {
    private static int nextId = 1; // จำนวนการสร้าง object ของพนักงานทั้งหมด
    private final int id; // id
    private String name; // ชื่อ
    private int age; // อายุ
    private double salary; // เงินเดือน
    private String contactNumber; // เบอร์โทรศัพท์
    private String email; // อีเมลล์
    private final JobPosition jobPosition; // ตำแหน่งงาน

    /**
     * Constructor ของ Employees Class โดยมีการระบุ ชื่อ, อายุ, เงินเดือน, เบอร์โทรศัพท์, อีเมลล์, ตำแหน่งงาน
     *
     * @param name ชื่อ รับค่าเป็น String
     * @param age อายุ รับค่าเป็น Integer
     * @param salary เงินเดือน รับค่าเป็น Long
     * @param contactNumber เบอร์โทรศัพท์ รับค่าเป็น Long
     * @param email อีเมลล์ รับค่าเป็น String
     * @param jobPosition ตำแหน่งงาน รับค่าเป็น Enum jobPosition
     */
    public Employees(String name, int age, double salary, String contactNumber, String email, JobPosition jobPosition) {
        this.id = nextId++;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.contactNumber = contactNumber;
        this.email = email;
        this.jobPosition = jobPosition;
    }

    /**
     * Setter สำหรับการ set ชื่อ
     * @param name ชื่อ รับค่ามาเป็น String
     */
    public void setName(String name){
        this.name = name;
    }

    /**
     * Setter สำหรับการ set อายุ
     * @param age อายุ รับค่ามาเป็น Integer
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Setter สำหรับการ set เงินเดือน
     * @param salary เงินเดือน รับค่ามาเป็น Double
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * Setter สำหรับการ set เบอร์โทรศัพท์
     * @param contactNumber เบอร์โทรศัพท์ รับค่ามาเป็น Long
     */
    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    /**
     * Setter สำหรับการ set อีเมลล์
     * @param email อีเมลล์ รับค่ามาเป็น String
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Getter สำหรับการ get ไอดี
     * @return id ของพนักงานบริษัท
     */
    public int getId(){
        return id;
    }

    /**
     * Getter สำหรับการ get ชื่อ
     * @return name ของพนักงานบริษัท
     */
    public String getName() {
        return name;
    }

    /**
     * Getter สำหรับการ get อายุ
     * @return age ของพนักงานบริษัท
     */
    public int getAge() {
        return age;
    }

    /**
     * Getter สำหรับการ get เงินเดือน
     * @return salary ของพนักงานบริษัท
     */
    public double getSalary() {
        return salary;
    }

    /**
     * Getter สำหรับการ get เบอร์โทรศัพท์
     * @return contactNumber ของพนักงานบริษัท
     */
    public String getContactNumber() {
        return contactNumber;
    }

    /**
     * Getter สำหรับการ get อีเมลล์
     * @return email ของพนักงานบริษัท
     */
    public String getEmail() {
        return email;
    }

    /**
     * Getter สำหรับการ get ตำแหน่งงาน
     * @return jobPosition ของพนักงานบริษัท
     */
    public JobPosition getJobPosition() {
        return jobPosition;
    }

    /**
     * คืนค่าเป็น id, ชื่อ, อายุ, เงินเดือน, เบอร์โทรศัพท์, อีเมลล์, ตำแหน่งงาน
     *
     * @return Employees Details : [ID: #] [Name: #] [Age: #] [Salary: #.00] [Contact Number: #] [Email: #] [Job Position: #]
     */
    public String toString() {
        return "Employee Details : " + "[" + "ID: " + id + "] "+ "[" + "Name: " + this.name + "] " +
                "[" + "Age: " + this.age + "] "+ "[" + "Salary: " + this.salary + "] "+
                "[" + "Contact Number: " + this.contactNumber + "] "+ "[" + "Email: " + this.email + "] " +
                "[" + "Job Position: " + this.jobPosition + "] ";
    }
}
