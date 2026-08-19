package opps;

public class game {
    public static void main(String[] args) {


//    obj1
        Player player1 = new Player("Alex", 300);
       player1.setScore(48);

        System.out.println();

//    obj2
        Player player2 = new Player("Brian", 160);
        player2.playerInfo();


    }

    public static class Player {
       private String name;
       private int score;
//       getters
        public String getName() {
            return name;
        }
        public int getScore() {
            return score;
        }

//        setter
        public void setScore (int score) {
            if (score < 0)
                throw new IllegalStateException("Score can't be negative");
            else {
                this.score = score;
                System.out.println("Score updated to "+score+"!");
            }
        }
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