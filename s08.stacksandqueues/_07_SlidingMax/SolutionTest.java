package _07_SlidingMax;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionTest {
    
    /** Test method for {@link _07_SlidingMax.Solution } */
    Solution solution;

    @Rule
    public Timeout globalTimeout = new Timeout(200);

    @Before
    public void setUp() throws Exception {
        solution = new Solution();
    }

    @After
    public void tearDown() throws Exception {
        solution = null;
    }

    @Test
    public void Test1() {
        List<Integer> A = new ArrayList<>(Arrays.asList(1, 3, -1, -3, 5, 3, 6, 7));
        int B = 3;
        ArrayList<Integer> actual = solution.slidingMaximum(A, B);
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(3, 3, 5, 5, 6, 7));
        assertEquals(expected, actual);
    }

    @Test
    public void Test2() {
        List<Integer> A = new ArrayList<>(Arrays.asList(2, 3, 4, 2, 6, 2, 5, 1));
        int B = 3;
        ArrayList<Integer> actual = solution.slidingMaximum(A, B);
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(4, 4, 6, 6, 6, 5));
        assertEquals(expected, actual);
    }

}
