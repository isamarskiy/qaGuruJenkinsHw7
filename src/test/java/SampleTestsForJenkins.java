import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class SampleTestsForJenkins {

    @Test
    @DisplayName("Positive test")
    void positiveTest(){
        assertThat(4, is(4));
    }

    @Test
    @DisplayName("Negative test")
    void negativeTest(){
        assertThat(4, is(5));
    }
}
