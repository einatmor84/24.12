public class Smartphone implements SmartDevice{
    private int numbersOfCameras;

    public Smartphone(int numbersOfCameras) {
        this.numbersOfCameras = numbersOfCameras;
    }

    public boolean isWorking(){
        return numbersOfCameras > 0;
    }
}

