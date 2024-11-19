import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MemberTest {

    @Test
    void testMemberDetails() {
        Member member = new Member(2001, "John Doe", "Premium");
        assertEquals(2001, member.getMemberID());
        assertEquals("John Doe", member.getName());
        assertEquals("Premium", member.getMembershipType());
    }
}
