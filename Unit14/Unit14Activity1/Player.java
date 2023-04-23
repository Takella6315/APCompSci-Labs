package Unit14.Unit14Activity1;

public class Player {
    protected String name;
    protected int lives;
    protected int score;
    protected int credits;
    
    public Player(String name, int lives, int score, int credits) {
        this.name = name;
        this.lives = lives;
        this.score = score;
        this.credits = credits;
    }
    
    public void loseLife() {
        lives--;
    }
    
    public void gainScore(int points) {
        score += points;
    }
    
    public void gainCredits(int amount) {
        credits += amount;
    }
    
    public void loseCredits(int amount) {
        credits -= amount;
    }
}