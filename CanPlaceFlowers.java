public class CanPlaceFlowers {

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n == 0) {
            return true;
        }

        for (int i = 0; i < flowerbed.length; i++) {
            int left = i > 0 ? flowerbed[i - 1] : 0;
            int right = i < flowerbed.length - 1 ? flowerbed[i + 1] : 0;
            int current = flowerbed[i];

            if (left == 1 || right == 1 || current == 1) {
                continue;
            }

            n--;

            if (n == 0) {
                return true;
            }

            flowerbed[i] = 1;
        }

        return n == 0;
    }
}
