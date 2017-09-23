/**
 * Created by HaldaneDavidV on 9/22/2017.
 */
public class module3
{
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
                if (mid == objArray.length - 1 )
                {
                    return mid + 1;
                }
                else if (objArray[mid + 1].compareTo(searchObj) > 0)
                {
                    return mid + 1;
                }
                else
                {
                    low = mid + 1;
                }
            }
            else if (objArray[mid].compareTo(searchObj) > 0)
            {
                if (mid == 0)
                {
                    return 0;
                }
                else if (objArray[mid - 1].compareTo(searchObj) < 0)
                {
                    return mid;
                }
                else
                {
                    high = mid - 1;
                }
            }
            else
            {

                int prestep = mid;
                int poststep = mid + 1;

                if (mid == objArray.length - 1)
                {
                    return mid + 1;
                }

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

        //Return fail code which is length + 2;
        return mid + 2;
    }
}


