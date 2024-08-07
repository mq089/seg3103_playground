import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DateTest {

  @Test
  void nextDate_tc01() {
    Date today = new Date(1700, 6, 20);
    Date expectedTomorrow = new Date(1700, 6, 21);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc02() {
    Date today = new Date(2005, 4, 15);
    Date expectedTomorrow = new Date(2005, 4, 16);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc03() {
    Date today = new Date(1901, 7, 20);
    Date expectedTomorrow = new Date(1901, 7, 21);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc04() {
    Date today = new Date(3456, 3, 27);
    Date expectedTomorrow = new Date(3456, 3, 28);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc05() {
    Date today = new Date(1500, 2, 17);
    Date expectedTomorrow = new Date(1500, 2, 18);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc06() {
    Date today = new Date(1700, 6, 29);
    Date expectedTomorrow = new Date(1700, 6, 30);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc07() {
    Date today = new Date(1800, 11, 29);
    Date expectedTomorrow = new Date(1800, 11, 30);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc08() {
    Date today = new Date(3453, 1, 29);
    Date expectedTomorrow = new Date(3453, 1, 30);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc09() {
    Date today = new Date(444, 2, 29);
    Date expectedTomorrow = new Date(444, 3, 1);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc10() {
    Date today = new Date(2005, 4, 30);
    Date expectedTomorrow = new Date(2005, 5, 1);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc11() {
    Date today = new Date(3453, 1, 30);
    Date expectedTomorrow = new Date(3453, 1, 31);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc12() {
    Date today = new Date(3456, 3, 30);
    Date expectedTomorrow = new Date(3456, 3, 31);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc13() {
    Date today = new Date(1901, 7, 31);
    Date expectedTomorrow = new Date(1901, 8, 1);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc14() {
    Date today = new Date(3453, 1, 31);
    Date expectedTomorrow = new Date(3453, 2, 1);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc15() {
    Date today = new Date(3456, 12, 31);
    Date expectedTomorrow = new Date(3457, 1, 1);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_invalid_tc16() {
    assertThrows(
      IllegalArgumentException.class,
      () -> new Date(1500, 2, 31)
    );
  }

  @Test
  void nextDate_invalid_tc17() {
    assertThrows(
      IllegalArgumentException.class,
      () -> new Date(1500, 2, 29)
    );
  }

  @Test
  void nextDate_invalid_tc18() {
    assertThrows(
      IllegalArgumentException.class,
      () -> new Date(-1, 10, 20)
    );
  }

  @Test
  void nextDate_invalid_tc19() {
    assertThrows(
      IllegalArgumentException.class,
      () -> new Date(1458, 15, 12)
    );
  }

  @Test
  void nextDate_invalid_tc20() {
    assertThrows(
      IllegalArgumentException.class,
      () -> new Date(1975, 6, -50)
    );
  }

  @Test
  void nextDate_invalid_tc21() {
    assertThrows(
      IllegalArgumentException.class,
<<<<<<< HEAD
      () -> new Date(1500, 2, 31)
=======
      () -> new Date(1944, 2, 31)
>>>>>>> 7e6c04428960dc436ac901d9a0f1b063579ec382
    );
  }

  @Test
  void nextDate_invalid_tc22() {
    assertThrows(
      IllegalArgumentException.class,
<<<<<<< HEAD
      () -> new Date(1500, 6, 31)
    );
  }
@Test
void nextDate_invalid_tc23() {
    assertThrows(
      IllegalArgumentException.class,
      () -> new Date(1500, 6, -1)
    );
  }
@Test
void nextDate_invalid_tc24() {
    assertThrows(
      IllegalArgumentException.class,
      () -> new Date(1500, 6, 51)
    );
  }
@Test
void nextDate_invalid_tc25() {
    assertThrows(
      IllegalArgumentException.class,
      () -> new Date(1900, 2, 31)
    );
  }
@Test
void nextDate_invalid_tc26() {
    assertThrows(
      IllegalArgumentException.class,
      () -> new Date(1943, 2, 29)
    );
  }
@Test
void nextDate_invalid_tc30() {
    assertThrows(
      IllegalArgumentException.class,
      () -> new Date(1944, 2, 30)
=======
      () -> new Date(1918, 6, 31)
>>>>>>> 7e6c04428960dc436ac901d9a0f1b063579ec382
    );
  }

  @Test
<<<<<<< HEAD
  void toString_tc27() {
    Date today = new Date(3456, 12, 31);
    String StrToday = today.toString();
    assertEquals(StrToday, "3456/December/31");
  }

  @Test
  void equals_tc28() {
    Date today = new Date(3456, 12, 31);
    int date = 5;
    boolean f = today.equals(date);
    assertEquals(false, f);
  }

 @Test
  void equals_tc29() {
    Date today = new Date(3456, 12, 31);
    boolean f = today.equals(today);
    assertEquals(false, f);
  }




=======
  void nextDate_invalid_tc23() {
    assertThrows(
      IllegalArgumentException.class,
      () -> new Date(1943, 1, 33)
    );
  }

  @Test
  void toString_tc24() {
    Date today = new Date(3456, 12, 31);
	String StrToday = today.toString();
	String Date = "3456/December/31";
	assertEquals(Date, StrToday);
  }
	
  @Test
  void nextDate_tc25() {
    Date today = new Date(2000, 2, 28);
    Date expectedTomorrow = new Date(2000, 2, 29);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_invalid_tc26() {
    assertThrows(
      IllegalArgumentException.class,
      () -> new Date(1975, 6, 50)
    );
  }

  @Test
  void nextDate_invalid_tc27() {
    assertThrows(
      IllegalArgumentException.class,
      () -> new Date(1916, 4, 31)
    );
  }

  @Test
  void nextDate_invalid_tc28() {
    assertThrows(
      IllegalArgumentException.class,
      () -> new Date(1910, 9, 31)
    );
  }

  @Test
  void nextDate_invalid_tc29() {
    assertThrows(
      IllegalArgumentException.class,
      () -> new Date(1945, 11, 31)
    );
  }

  @Test
  void nextDate_invalid_tc30() {
    assertThrows(
      IllegalArgumentException.class,
      () -> new Date(1975, -1, 50)
    );
  }

  @Test
  void nextDate_invalid_tc31() {
    assertThrows(
      IllegalArgumentException.class,
      () -> new Date(1975, 13, 50)
    );
  }

 
  @Test
  void nextDate_invalid_tc33() {
    Date today = new Date(2000, 1, 31);
    Date expectedTomorrow = new Date(2000, 2, 1);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_invalid_tc34() {
    Date today = new Date(1913, 4, 30);
    Date expectedTomorrow = new Date(1913, 5, 1);
    assertEquals(expectedTomorrow, today.nextDate());
  }
  

  @Test
  void nextDate_invalid_tc35() {
    Date today = new Date(1913, 5, 31);
    Date expectedTomorrow = new Date(1913, 6, 1);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_invalid_tc36() {
    Date today = new Date(1913, 2, 28);
    Date expectedTomorrow = new Date(1913, 3, 1);
    assertEquals(expectedTomorrow, today.nextDate());
  }


>>>>>>> 7e6c04428960dc436ac901d9a0f1b063579ec382
}