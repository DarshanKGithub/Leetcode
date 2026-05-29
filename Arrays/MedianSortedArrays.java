package Arrays;

public class MedianSortedArrays {

    public static double findMedianSortedArrays(int[] A, int[] B) {

        if (A.length > B.length)
            return findMedianSortedArrays(B, A);

        int x = A.length;
        int y = B.length;

        int low = 0, high = x;

        while (low <= high) {

            int partitionX = (low + high) / 2;
            int partitionY = (x + y + 1) / 2 - partitionX;

            int maxLeftX = (partitionX == 0)
                    ? Integer.MIN_VALUE
                    : A[partitionX - 1];

            int minRightX = (partitionX == x)
                    ? Integer.MAX_VALUE
                    : A[partitionX];

            int maxLeftY = (partitionY == 0)
                    ? Integer.MIN_VALUE
                    : B[partitionY - 1];

            int minRightY = (partitionY == y)
                    ? Integer.MAX_VALUE
                    : B[partitionY];

            if (maxLeftX <= minRightY &&
                    maxLeftY <= minRightX) {

                if ((x + y) % 2 == 0) {
                    return (Math.max(maxLeftX, maxLeftY)
                            + Math.min(minRightX, minRightY))
                            / 2.0;
                }

                return Math.max(maxLeftX, maxLeftY);

            } else if (maxLeftX > minRightY) {
                high = partitionX - 1;
            } else {
                low = partitionX + 1;
            }
        }

        throw new IllegalArgumentException();
    }
}