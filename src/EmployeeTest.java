import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void testUpdateShiftSchedule() {
        Employee employee = new Employee(1001, "Alice", "IT Support");
        employee.updateShiftSchedule("Night Shift");
        assertEquals("Night Shift", employee.getShiftSchedule());
    }

    @Test
    void testDisplayInfo() {
        Employee employee = new Employee(1001, "Alice", "IT Support");
        employee.updateShiftSchedule("Night Shift");
        // 测试输出（可手动验证或使用工具模拟标准输出）
        employee.displayInfo();
    }
}
