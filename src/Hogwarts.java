public class Hogwarts {
    private String name;
    private int magicOfPower;
    private int transgressionDistance;
    public Hogwarts(String name, int magicOfPower, int transgressionDistance) {
        this.name = name;
        this.magicOfPower = magicOfPower;
        this.transgressionDistance = transgressionDistance;
    }
        public String getName () {
            return name;
        }
        public void setName (String name){
            this.name = name;
        }
        public int getMagicOfPower () {
            return magicOfPower;
        }
        public void setMagicOfPower ( int magicOfPower){
            this.magicOfPower = magicOfPower;
        }
        public int getTransgressionDistance () {
            return transgressionDistance;
        }
        public void setTransgressionDistance ( int transgressionDistance){
            this.transgressionDistance = transgressionDistance;
        }
    }