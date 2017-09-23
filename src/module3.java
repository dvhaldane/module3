/**
 * Created by HaldaneDavidV on 9/22/2017.
 */
public class module3
{
    public static void main(String[] args)
    {
        Comparable[] array = {1, 2, 2, 2, 4, 5, 8, 9, 14, 32};
        //Comparable[] array = {"APPLE", "BANANA", "BANANA", "BANANA", "BLUEBERRY", "COCONUT", "DURAN"};

       System.out.println(binarySearchForInsert(array, 15));
    }

    public static int binarySearchForInsert(Comparable[] objArray, Comparable searchObj)  //Will return index of found item.  If more than one of item returns index of last item.
    {
        int low = 0;
        int high = objArray.length - 1;
        int mid = 0;

        //Handle empty array
        if (objArray.length == 0)
        {
            return 0;
        }

        while (low <= high)
        {
            mid = (low + high) / 2;
            if (objArray[mid].compareTo(searchObj) < 0)
            {
                low = mid + 1;  //Test Commit
            }
            else if (objArray[mid].compareTo(searchObj) > 0)
            {
                high = mid - 1;
            }
            else
            {

                int prestep = mid;
                int poststep = mid + 1;

                //Run loop to find end of repeating values
                while (objArray[prestep].compareTo(objArray[poststep]) == 0)
                {
                    mid = poststep;
                    prestep++;
                    poststep++;
                }

                //Will return index to insert which is found index + 1
                return mid + 1;
            }
        }

        //Handle insertion of data not already in the array

        System.out.println("Low is " + low);
        System.out.println("High is " + high);
        System.out.println("Mid is" + mid);

        return mid + 1;  //Return fail code which is length + 1;
    }
}


