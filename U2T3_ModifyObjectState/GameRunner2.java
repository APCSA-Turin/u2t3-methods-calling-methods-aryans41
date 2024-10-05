public class GameRunner2 {
    public static void main(String[] args) {
        Game myGame = new Game("snakesAndLadders" , 3);
        System.out.println(myGame.getScore());
        System.out.println(myGame.getPlayers());
        System.out.println(myGame.isGameOver());
        
        System.out.println("----- UPDATING STATE OF GAME: END RESULT -----");

        myGame.addPlayer();
        myGame.increaseScore(24);
               
        System.out.println(myGame.getScore());
        System.out.println(myGame.getPlayers());
        System.out.println(myGame.isGameOver());
        System.out.println(myGame.averageScorePerPlayer());
    }
} 
