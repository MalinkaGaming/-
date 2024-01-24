public class Hufflepuff extends Hogwarts {
    private int hardworking;
    private int loyal;
    private int honest;

    public Hufflepuff(String name,
                      int magicOfPower,
                      int transgressionDistance,
                      int hardworking,
                      int loyal,
                      int honest) {
        super(name, magicOfPower, transgressionDistance);
        this.loyal = loyal;
        this.hardworking = hardworking;
        this.honest = honest;
    }

    public int getHardworking() {
        return hardworking;
    }

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public void setLoyal(int loyal) {
        this.loyal = loyal;
    }

    public int getHonest() {
        return honest;
    }

    public void setHonest(int honest) {
        this.honest = honest;
    }

    @Override
    public String toString() {
        return "|Имя: " + getName() + "| " +
                "|Магическая сила: " + getMagicOfPower() + "| " +
                "|Расстоянние трансгрессии: " + getTransgressionDistance() + "| " +
                "|Трудолюбивость : " + getHardworking() + "| " +
                "|Честность: " + getHonest() + "| " +
                "|Верность: " + getLoyal() + "|";
    }
}


