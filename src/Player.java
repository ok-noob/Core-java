public class Player {
    String name;
    int score;
    public Player (String name,int score) {
        this.name = name;
        this.score = score;

    }
    public void playerInfo() {
        System.out.println(name);
        System.out.println(score);
    }
}
