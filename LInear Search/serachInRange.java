public class serachInRange {

    public static void main(String[] args) {

        int[] arr={18,12,-7,3,14,28};
        // search for 3 in the range of index[1,4]

        int target = 18;
        int start=1;
        int end=4;
        System.out.println(search(arr,target,start,end));

    }


    static  boolean search(int[] arr, int target ,int start, int end)
    {

        if(arr.length==0)
        {
            return  false;
        }

        for (int i = start; i < end; i++) {
            if(target==i)
            {
                return  true;
            }
        }

        return  false;
    }










}
