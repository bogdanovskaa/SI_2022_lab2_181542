import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class SILab2test {

    private List<String> createList(String... strings) {
        return new ArrayList<>(Arrays.asList(strings));
    }
     @BeforeAll
    public static void init(){
       System.out.println("BeforeAll init() method called");
     }

     @AfterAll
    public static void cleanUp(){
        System.out.println("After All cleanUp() method called");
    }

    @Test
    void everyStatementTestCriteria() {
        IllegalArgumentException exception = null;
        exception = assertThrows(IllegalArgumentException.class, () -> SILab2.function(createList()));

        assertTrue(exception.getMessage().contains("List length should be greater than 0"));
        exception = assertThrows(IllegalArgumentException.class, () -> SILab2.function(createList("0", "#", "#")));

        assertTrue(exception.getMessage().contains("List length should be a perfect square"));
        List<String> list = new ArrayList<>();

        list= createList("#", "#", "#", "#", "#", "#", "#", "#", "#");
        assertEquals(list, SILab2.function(list));
    }

    @Test
    public void everyBranchTestCriteria() {
        IllegalArgumentException exception = null;

        exception = assertThrows(IllegalArgumentException.class, () -> SILab2.function(createList()));
        assertTrue(exception.getMessage().contains("List length should be greater than 0"));

        exception = assertThrows(IllegalArgumentException.class, () -> SILab2.function(createList("0", "0")));
        assertTrue(exception.getMessage().contains("List length should be a perfect square"));

        List<String> list = new ArrayList<>();
        list= createList("#", "#", "0", "#", "0", "0", "0", "0", "#", "0", "0", "#", "0", "#", "#", "0");

        List<String> list2 = new ArrayList<>();
        list2= createList("#", "#", "2", "#", "2", "1", "0", "2", "#", "2", "2", "#", "2", "#", "#", "2");
        assertEquals(list2,  SILab2.function(list));
    }
}

