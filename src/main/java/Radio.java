public class Radio {
    private int currentRadioStation;
    private int currentVolume;
    private int maxStation;

    public Radio() {
        this.maxStation = 9;
    }

    public Radio(int countStation) {
        if (countStation<1){
            countStation=10;
        }
        this.maxStation = countStation - 1;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public void setMaxStation(int maxStation) {

    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < 0) {
            return;
        }
        if (newCurrentRadioStation > maxStation) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseRadioStation() {
        if (currentRadioStation != maxStation) {
            currentRadioStation++;
            return;
        }
        currentRadioStation = 0;
    }

    public void reducingRadioStation() {
        if (currentRadioStation != 0) {
            currentRadioStation--;
            return;
        }
        currentRadioStation = maxStation;
    }

    public void increaseVolume() {
        if (currentVolume != 100) {
            currentVolume++;
        }

    }

    public void reducingVolume() {
        if (currentVolume != 0) {
            currentVolume--;
        }
    }

}
