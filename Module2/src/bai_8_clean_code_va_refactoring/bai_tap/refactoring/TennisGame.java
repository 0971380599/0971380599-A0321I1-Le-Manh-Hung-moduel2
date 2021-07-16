package bai_8_clean_code_va_refactoring.bai_tap.refactoring;

public class TennisGame {
    private static String howToCall = "";
    private static final int zeroPoints = 0;
    private static final int onePoints = 1;
    private static final int twoPoints = 2;
    private static final int threePoints = 3;

    public static String getScore(String player1Name, String player2Name, int pointPlayer1, int pointPlayer2) {
        howToCall = "";
        if (pointPlayer1 == pointPlayer2) {
            draw(pointPlayer1);
        } else if (pointPlayer1 >= 4 || pointPlayer2 >= 4) {
            considerAdvantages(pointPlayer1, pointPlayer2);
        } else {
            normalScore(pointPlayer1);
            howToCall += "-";
            normalScore(pointPlayer2);
        }

        return howToCall;
    }

    public static void normalScore(int points) {
        switch (points) {
            case zeroPoints:
                howToCall += "Love";
                break;
            case onePoints:
                howToCall += "Fifteen";
                break;
            case twoPoints:
                howToCall += "Thirty";
                break;
            case threePoints:
                howToCall += "Forty";
                break;
        }
    }

    public static void considerAdvantages(int pointPlayer1, int pointPlayer2) {
        int minusResult = pointPlayer1 - pointPlayer2;
        if (minusResult == 1) howToCall = "Advantage player1";
        else if (minusResult == -1) howToCall = "Advantage player2";
        else if (minusResult >= twoPoints) howToCall = "Win for player1";
        else howToCall = "Win for player2";
    }

    public static void draw(int pointPlayer1) {
        switch (pointPlayer1) {
            case zeroPoints:
                howToCall = "Love-All";
                break;
            case onePoints:
                howToCall = "Fifteen-All";
                break;
            case twoPoints:
                howToCall = "Thirty-All";
                break;
            case threePoints:
                howToCall = "Forty-All";
                break;
            default:
                howToCall = "Deuce";
                break;
        }
    }
}