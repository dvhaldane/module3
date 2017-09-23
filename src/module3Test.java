import org.junit.Assert;
import org.junit.Test;

/**
 * Created by HaldaneDavidV on 9/22/2017.
 */
public class module3Test extends module3
{
    @Test
    public void testEmptyArray() throws Exception
    {
        Comparable[] array = {};

        Assert.assertTrue(binarySearchForInsert(array, 2) == 0);
    }

    @Test
    public void testLowerBoundExistsOdd() throws Exception
    {
        Comparable[] array = {2,3,4};

        Assert.assertTrue(binarySearchForInsert(array, 2) == 1);
    }

    @Test
    public void testLowerBoundExistsEven() throws Exception
    {
        Comparable[] array = {2,3,3,4};

        Assert.assertTrue(binarySearchForInsert(array, 2) == 1);
    }

    @Test
    public void testLowerBoundNotExistsOdd() throws Exception
    {
        Comparable[] array = {2,3,4};

        Assert.assertTrue(binarySearchForInsert(array, 1) == 0);
    }

    @Test
    public void testLowerBoundNotExistsEven() throws Exception
    {
        Comparable[] array = {2,3,3,4};

        Assert.assertTrue(binarySearchForInsert(array, 1) == 0);
    }

    @Test
    public void testUpperBoundExistsOdd() throws Exception
    {
        Comparable[] array = {2,3,4};

        Assert.assertTrue(binarySearchForInsert(array, 4) == 3);
    }

    @Test
    public void testUpperBoundExistsEven() throws Exception
    {
        Comparable[] array = {2,3,3,4};

        Assert.assertTrue(binarySearchForInsert(array, 4) == 4);
    }

    @Test
    public void testUpperBoundNotExistsOdd() throws Exception
    {
        Comparable[] array = {2,3,4};

        Assert.assertTrue(binarySearchForInsert(array, 5) == 3);
    }

    @Test
    public void testUpperBoundNotExistsEven() throws Exception
    {
        Comparable[] array = {2,3,3,4};

        Assert.assertTrue(binarySearchForInsert(array, 5) == 4);
    }

    @Test
    public void testMiddleBoundExistsOdd() throws Exception
    {
        Comparable[] array = {2,3,4};

        Assert.assertTrue(binarySearchForInsert(array, 3) == 2);
    }

    @Test
    public void testMiddleBoundExistsEven() throws Exception
    {
        Comparable[] array = {2,3,3,4};

        Assert.assertTrue(binarySearchForInsert(array, 3) == 3);
    }

    @Test
    public void testMiddleBoundNotExistsOdd() throws Exception
    {
        Comparable[] array = {2,4,6};

        Assert.assertTrue(binarySearchForInsert(array, 5) == 2);
    }

    @Test
    public void testMiddleBoundNotExistsEven() throws Exception
    {
        Comparable[] array = {2,4,6,7};

        Assert.assertTrue(binarySearchForInsert(array, 5) == 2);
    }

}