public class ipone13 implements SmartDevice, GPS{
    private int butterLevel;

    public boolean isWorking(){
        if(butterLevel >20){
            return true;
        }
        else
            return false;
    }
    public String getCoordinates(){
        return "Latitude: 1235.687, Longitude: 789.654";
    }
}
