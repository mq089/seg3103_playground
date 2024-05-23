import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;




public class DateNextDateExceptionTest
{

    @Test
    void nextDate_16() {
        //Date d = new Date(1500,02,31);
        
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            new Date(1500,02,31);
        });
        
        assertEquals("day must less than 28 for month February on a non leap year.", exception.getMessage());
    }

    @Test
    void nextDate_17() {
        
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            new Date(1500,02,29);
        });
        
        assertEquals("day must less than 28 for month February on a non leap year.", exception.getMessage());
    }


    @Test
    void nextDate_18() {
        
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            new Date(-1,10,20);
        });
        
        assertEquals("year must be greater or equal to 0.", exception.getMessage());
    }

    @Test
    void nextDate_19() {
        
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            new Date(1458,15,12);
        });
        
        assertEquals("month must be between 1 and 12.", exception.getMessage());
    }

    @Test
    void nextDate_20() {
        
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            new Date(1975,6,-50);
        });
        
        assertEquals("day must greater or equal to 1.", exception.getMessage());
    }




}