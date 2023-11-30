import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void minimumOneBitOperationsTest1(){
        int n = 3;
        int expected = 2;
        int actual = new Solution().minimumOneBitOperations(n);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void minimumOneBitOperationsTest2(){
        int n = 6;
        int expected = 4;
        int actual = new Solution().minimumOneBitOperations(n);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void minimumOneBitOperationsTest3(){
        int n = 8;
        int expected = 15;
        int actual = new Solution().minimumOneBitOperations(n);

        Assert.assertEquals(expected, actual);
    }

}
