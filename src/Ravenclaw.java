public class Ravenclaw extends Hogwarts {
    private int smart;
    private int wise;
    private int witty;
    private int creative;

    public Ravenclaw(String name,
                     int magicOfPower,
                     int transgressionDistance,
                     int smart,
                     int wise,
                     int witty,
                     int creative) {
        super(name, magicOfPower, transgressionDistance);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creative = creative;
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public int getCreative() {
        return creative;
    }

    public void setCreative(int creative) {
        this.creative = creative;
    }
    @Override
    public String toString() {
        return "|Имя: " + getName() + "| " +
                "|Магическая сила: " + getMagicOfPower() + "| " +
                "|Расстоянние трансгрессии: " + getTransgressionDistance() + "| " +
                "|Ум: " + getSmart() + "| " +
                "|Мудрость: " + getWise() + "| " +
                "|Остроумие: " + getWitty() + "|"+
                "|Креатив: " + getCreative() + "|";
    }
}


