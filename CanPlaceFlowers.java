public class CanPlaceFlowers {

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        for (int i = 0; i < flowerbed.length; i++) {
            boolean prev = i == 0 || flowerbed[i - 1] == 0;
            boolean curr = flowerbed[i] == 0;
            boolean next = i == flowerbed.length - 1 || flowerbed[i + 1] == 0;

            if (prev && next && curr) {
                flowerbed[i] = 1;
                n--;
            }
        }

        return n <= 0;
    }
}
