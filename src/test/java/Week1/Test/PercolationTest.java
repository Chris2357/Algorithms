package Week1.Test;

import Week1.Percolation;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by rq36 on 23/02/2015.
 */
public class PercolationTest {
    Percolation percolation = new Percolation();
    @Test
    public void testPercolation1() throws Exception{
        percolation.Percolation(1);
        assertEquals(1,1);
    }
   // @Test
   // public void testPercolationX() throws Exception{
   //     percolation.Percolation(2);
   //     int[][] grid = new int[][]{{1, 1}, {2, 1}};
   //     assertArrayEquals("array equal", grid[][], );
   // }
    @Test
    public void testOpen() throws Exception {
        percolation.open(1,2);
        assertEquals("I assigned to J",2,2);
    }
    @Test
    public void testIsOpen() throws Exception{
        assertTrue(percolation.isOpen(1, 2));
    }
    @Test
    public void testIsFull() throws Exception{
        assertTrue(percolation.isFull(1, 2));
    }
    @Test
    public void testPercolates() throws Exception{
        assertTrue(percolation.percolates());
    }
}
