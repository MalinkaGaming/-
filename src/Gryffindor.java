public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int courage;
    public Gryffindor(String name, int magicOfPower, int transgressionDistance, int nobility, int honor, int courage) {
        super(name, magicOfPower, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }
    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getCourage() {
        return courage;
    }

    public void setCourage(int courage) {
        this.courage = courage;
    }

    public void compare() {
    }
    @Override
    public String toString() {
        return "|Имя: " + getName() + "| " +
                "|Магическая сила: " + getMagicOfPower() + "| " +
                "|Расстоянние трансгрессии: " + getTransgressionDistance() + "| " +
                "|Благородство: " + getNobility() + "| " +
                "|Честь: " + getHonor() + "| " +
                "|Храбрость: " + getCourage() + "|";
    }
}


