import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[][] regional_teams = {{45, 31, 24, 22, 20, 17, 14, 13, 12, 10},
                {31, 18, 15, 12, 10, 8, 6, 4, 2, 1},
                {51, 30, 10, 9, 8, 7, 6, 5, 2, 1}};
        System.out.println(Arrays.toString(national_team(regional_teams)));
    }

    public static int[] merge(int[] team, int[] regional_teams) {

    }

    public static int[] national_team(int[][] regional_teams) {
        int[] team = regional_teams[0];
        for (int i = 1; i < regional_teams.length; i++) {
            team = merge(team, regional_teams[i]);
        }
        return team;
    }
}
