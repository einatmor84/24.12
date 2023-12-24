public class Computer implements SmartDevice{
    private int screenSize;
    private String core;

    public Computer(int screenSize, String core) {
        this.screenSize = screenSize;
        this.core = core;
    }
    public boolean isWorking(){
        return screenSize > 0;
    }
}
