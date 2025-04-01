import java.util.ArrayList;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        // first need to find the maximum in candies[i] and save result
        int max = candies[0];

        for (int i = 1; i < candies.length; i++) {
            max = Math.max(max, candies[i]);
        }

        // then need to evaluate if after given extraCandies, kid has the greatest number of candies among all the kids and save result in ArrayList
        List<Boolean> result = new ArrayList<>();
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= max ) {
                result.add(true);
            } else {
                result.add(false);
            }
        }

        return result;
    }
}
