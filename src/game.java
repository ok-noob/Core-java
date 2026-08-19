public class game {
    public static void main(String[] args) {


//    obj1
        Player player1 = new Player("Alex", 300);
        player1.playerInfo();

        System.out.println();

//    obj2
        Player player2 = new Player("Brian", 160);
        player2.playerInfo();


    }

    public static class Player {
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
}