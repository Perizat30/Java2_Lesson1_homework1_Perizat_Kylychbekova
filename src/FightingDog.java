public final class FightingDog extends Dog{

    private int wins;


    public FightingDog(int age, Color color, String name) {
        super(age, color, name);
    }

    public FightingDog(int age, Color color, String name, int wins) {
        super(age, color, name);
        this.wins = wins;
    }

    public int getWins() {
        return wins;
    }

    @Override//extra override method
    public String makeVoice() {
        return super.makeVoice()+" Brrrrr";

    }

    @Override//override method
    public String getInfo() {
        return super.getInfo()+"\nNumber of wins: "+ wins;
    }
}
