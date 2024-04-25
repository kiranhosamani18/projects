public class CoinDeterminer {

public static int coinDeterminer(int num) {

int[] coins = {1, 5, 7, 9, 11);

int[] dp = new int[num + 1]; Arrays.fill(dp, Integer.MAX_VALUE);

dp[0] = 0;

for (int i = 1; i <= num; i++) {

for (int coin: coins) {

if (coin <= 1 && dp[i coin] + 1 < dp[i]) { dp[i] = dp[i coin] + 1; }

return dp[num];

}

}

public static void main(String[] args) { System.out.println(coinDeterminer(6)); // Output: 2

System.out.println(coinDeterminer(16)); // Output: 2

}

}