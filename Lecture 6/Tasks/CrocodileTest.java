import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CrocodileTest {

    //    Crocodile crocodile = new Crocodile();
    AnotherLombokCrocodile crocodile = new AnotherLombokCrocodile();

    @Before
    public void setUp() {
        crocodile.setColor("Green");
        crocodile.setName("Gena");
        crocodile.setLength(200);
        crocodile.setSize(2500);
        crocodile.setHungry(true);
    }

    @After
    public void tearDown() {
        crocodile = null;
    }

    @Test
    public void firstTest() {


        assertThat(crocodile.getColor()).isEqualTo("Green");
        assertThat(crocodile.getName()).isEqualTo("Gena");
        assertThat(crocodile.getLength()).isEqualTo(200);
        assertThat(crocodile.getSize()).isEqualTo(2500);
        assertThat(crocodile.isHungry()).isEqualTo(true);
        assertThat(crocodile.isHungry()).isTrue();

//        System.out.println(crocodile.getColor());
//        System.out.println(crocodile.getName());
//        System.out.println(crocodile.getLength());
//        System.out.println(crocodile.getSize());
//        System.out.println(crocodile.isHungry());
    }
}
