public class SmartWatch implements SmartDevice{
    private boolean NFT;

    public SmartWatch(boolean NFT) {
        this.NFT = NFT;
    }
    public boolean isWorking(){
        return NFT;
    }
}
