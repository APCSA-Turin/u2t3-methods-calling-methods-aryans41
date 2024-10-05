
public class Game { 
     //instance variables
   private String gameName;
   private int players;
   private int score; 

   // constructor
   public Game(String gameName, int players) {
    this.gameName = gameName;
    this.players = players;
    score = 0;  // initial value
}

    // getter methods
    public String getGameName() {
        return gameName;
    }

    public int getPlayers() {
        return players;
    }

    public int getScore() {
        return score;
    }

    // this method increments the number of players by one
    public void addPlayer() {
        players++;
    }

    // this method increases the score by the given amount
    public void increaseScore (int increase) { 
        score += increase;
    }

    // this method return the average score among players
    public double averageScorePerPlayer () { 
        double average = (double) score / players; 
        return average; 
    }

    // this method decides if the game is over only when the score is higher than 9
    public boolean isGameOver () { 
        if (score > 9) { 
            return true; 
        } else { 
            return false;
        }
    }
}