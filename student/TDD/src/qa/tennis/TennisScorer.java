package qa.tennis;

public class TennisScorer {
	private final Score score;
	private String previousString;
	
	public TennisScorer() {
		score = new Score();
		previousString = "";
	}
	
	public void winningPoint(char player) {
		winningPoints(String.valueOf(player));
	}
	
	public void winningPoints(String players) {
		previousString += players;
	}


    public String currentScore() {
        char[] winningSequence = previousString.toCharArray();
        for (char c : winningSequence) {
            if (c == 'A') {
                String scoreA = score.getPlayerAgameScore();

                switch (scoreA) {
                    case "0":
                        score.setPlayerAgameScore("15");
                        break;
                    case "15":
                        score.setPlayerAgameScore("30");
                        break;
                    case "30":
                        score.setPlayerAgameScore("40");
                        break;
                    case "40":
                        if (score.getPlayerBgameScore().equals("40")) {
                            score.setPlayerAgameScore("A");
                        } else {
                            score.setPlayerAgameScore("0");
                            score.setPlayerBgameScore("0");
                        }
                        break;
                }
            } else {
                String scoreB = score.getPlayerBgameScore();

                switch (scoreB) {
                    case "0":
                        score.setPlayerBgameScore("15");
                        break;
                    case "15":
                        score.setPlayerBgameScore("30");
                        break;
                    case "30":
                        score.setPlayerBgameScore("40");
                        break;
                    case "40":
                        if (score.getPlayerAgameScore().equals("40")) {
                            score.setPlayerBgameScore("A");
                        } else {
                            score.setPlayerAgameScore("0");
                            score.setPlayerBgameScore("0");
                        }
                        break;
                }
            }
        }

        return score.getPlayerAgameScore() + ":" + score.getPlayerBgameScore();
    }


	public Score getScore() {
		return score;
	}
	
	

}
