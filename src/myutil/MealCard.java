package myutil;

public class MealCard {
    private static final int INITIAL_BALANCE = 100;
    private int points;

    public MealCard(){
        this.points = INITIAL_BALANCE;
    }

    public MealCard(int points){
        this.points = points;
    }

    public int getPoints() {
        return points;
    }

    public void purchaseFood(int foodPoints) {
        if (this.points - foodPoints >= 0)
            this.points -= foodPoints;
        else {
            System.out.println("Not enough points for food item");

        }
    }
    public void addPoints(int addedPoints){
            this.points += addedPoints;
        }



    }




