public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int thirstForPower;

    public Slytherin(String name,
                     int magicOfPower,
                     int transgressionDistance,
                     int cunning,
                     int determination,
                     int ambition,
                     int resourcefulness,
                     int thirstForPower) {
        super(name, magicOfPower, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }
    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }
    public void setThirstForPower(int thirstOfPower) {
        this.thirstForPower = thirstOfPower;
    }
    @Override
    public String toString() {
        return "|Имя: " + getName() + "| " +
                "|Магическая сила: " + getMagicOfPower() + "| " +
                "|Расстоянние трансгрессии: " + getTransgressionDistance() + "| " +
                "|Хитрость: " + getCunning() + "| " +
                "|Решительность: " + getDetermination() + "| " +
                "|Амбициозность: " + getAmbition() + "| " +
                "|Находчивость: " + getResourcefulness() + "| " +
                "|Жажда власти: " + getThirstForPower() + "|";
    }
}





