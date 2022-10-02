public class SearchNumber {

    public boolean doSearch (int x, int[] numbers) {
        return search(x, numbers);
    }

    private boolean search (int x, int[] numbers) {

        return (binarySearch(x, numbers, 0, numbers.length - 1)) != -1;
    }

    private int binarySearch (int x, int [] ascendingIntArray, int start, int end) {
        if (end >= start) {
            int mid = start + ((end - start)/2);

            if (ascendingIntArray[mid] == x) {
                return mid;
            }

            if (x > ascendingIntArray[mid]) {
                return binarySearch(x, ascendingIntArray, start, mid - 1 );
            }

            if (x < ascendingIntArray[mid]) {
                return binarySearch(x, ascendingIntArray, mid + 1, end);
            }
        }
        return -1;
    }
}
