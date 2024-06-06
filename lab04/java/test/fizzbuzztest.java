import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class fizzbuzzTest{
    //Failed test
    @Test
    void failFizz_tc01() {
        String fizz = fizzbuzz.fizzBuzz(3);
        String result = "fizz";
        assertEquals(result, fizz);
    }

    @Test
    void failFizz_tc02() {
        String fizz = fizzbuzz.fizzBuzz(3);
        String result = "Buzz";
        assertEquals(result, fizz);
    }


    @Test
    void passFizz_tc03() {
        String fizz = fizzbuzz.fizzBuzz(3);
        String result = "Fizz";
        assertEquals(result, fizz);
    }

    @Test
    void passBuzz_tc04() {
        String Buzz = fizzbuzz.fizzBuzz(5);
        String result = "Buzz";
        assertEquals(result, Buzz);
    }


}