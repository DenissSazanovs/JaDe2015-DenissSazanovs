package jade1;

import static org.junit.Assert.*;

import jade1.Search;
import org.junit.Test;

/**
 * Created by user on 15.24.9.
 */
public class SearchTest {

    static int[] mas = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

    @Test
    public void test1(){
        assertEquals(2, (Search.find(3, mas)));
    }

    @Test
    public void test2(){
        assertEquals(5, (Search.find(6, mas)));
    }

    @Test
    public void test3(){
        assertEquals(-1, (Search.find(10, mas)));
    }

    @Test
    public void test4(){
        assertEquals(0, (Search.find(1, mas)));
    }

    @Test
    public void test5(){
        assertEquals(8, (Search.find(9, mas)));
    }

    @Test
    public void test6(){
        assertEquals(6, (Search.find(7, mas)));
    }


}
