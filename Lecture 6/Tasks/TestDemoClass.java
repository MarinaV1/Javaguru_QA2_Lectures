package lecture6;


import org.junit.jupiter.api.*;

public class TestDemoClass {

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Print Before all");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Print After all");
    }

    @BeforeEach
    public void setUp() {
        System.out.println("Print Before each");
    }

    @AfterEach
    public void tearDown() {
        System.out.println("Print After each");
    }

    @Test
    public void test1() {
        System.out.println("Test1");
    }

    @Test
    public void test2() {
        System.out.println("Test2");
    }
}
