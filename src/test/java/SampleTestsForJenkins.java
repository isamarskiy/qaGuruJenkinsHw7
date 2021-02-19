import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SampleTestsForJenkins {

    @Test
    @DisplayName("Positive test")
    void positiveTest(){
        assertEquals(4, 4);
    }

    @Test
    @DisplayName("Negative test")
    void negativeTest(){
        assertEquals(4, 5);
    }
}
