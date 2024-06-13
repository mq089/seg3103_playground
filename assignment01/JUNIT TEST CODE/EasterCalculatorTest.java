import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class EasterCalculatorTest {

  @Test
  void tc_1_min_year() {
    String date = "April 4";
    int year = 1584;
    assertEquals(date, EasterCalculator.easterDate(year).toString());
  }

  @Test
  void tc_2_max_year() {
    String date = "March 29";
    int year = 4098;
    assertEquals(date, EasterCalculator.easterDate(year).toString());
  }

  @Test
  void tc_3_spec_year() {
    String date = "April 18";
    int year = 1954;
    assertEquals(date, EasterCalculator.easterDate(year).toString());
  }
  
  @Test
  void tc_4_spec_year() {
    String date = "April 19";
    int year = 1981;
    assertEquals(date, EasterCalculator.easterDate(year).toString());
  }
  
  @Test
  void tc_5_spec_year() {
    String date = "April 18";
    int year = 2049;
    assertEquals(date, EasterCalculator.easterDate(year).toString());
  }
  
  @Test
  void tc_6_spec_year() {
    String date = "April 19";
    int year = 2076;
    assertEquals(date, EasterCalculator.easterDate(year).toString());
  }
  
  @Test
  void tc_7_out_of_range() {
    String date = null;
    int year = 1583;
    assertEquals(null, EasterCalculator.easterDate(year));
  }

  @Test
  void tc_8_out_of_range() {
    String date = null;
    int year = 4099;
    assertEquals(null, EasterCalculator.easterDate(year));
  }

  @Test
  void tc_9_last_march() {
    String date = "March 31";
    int year = 2002;
    assertEquals(date, EasterCalculator.easterDate(year).toString());
  }

  @Test
  void tc_10_first_march() {
    String date = "March 23";
    int year = 1818;
    assertEquals(date, EasterCalculator.easterDate(year).toString());
  }

  @Test
  void tc_11_first_april() {
    String date = "April 1";
    int year = 2018;
    assertEquals(date, EasterCalculator.easterDate(year).toString());
  }

  @Test
  void tc_12_last_april() {
    String date = "April 25";
    int year = 2038;
    assertEquals(date, EasterCalculator.easterDate(year).toString());
  }


}