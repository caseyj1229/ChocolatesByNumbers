import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChocolatesByNumbersTest {
    @Test
    void solution() {
        //Example Input
        assertEquals(5, ChocolatesByNumbers.solution(10, 4));

        //Extreme, Only 1 Chocolate
        assertEquals(1, ChocolatesByNumbers.solution(1, 1));

        //Extreme, All Chocolates for a large number
        assertEquals(50000, ChocolatesByNumbers.solution(50000, 1));

        //Medium Input
        assertEquals(35, ChocolatesByNumbers.solution(560, 16));

        //Input where M>N
        assertEquals(5, ChocolatesByNumbers.solution(5, 8));
    }
}