public class Radio {
    private int currentRadioStation;
    private int currentVolume;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < 0) {
            return;
        }
        if (newCurrentRadioStation > 9) {
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
        if (currentRadioStation != 9) {
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
        currentRadioStation = 9;
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
