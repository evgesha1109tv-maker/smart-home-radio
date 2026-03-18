import lombok.Getter;
import lombok.Setter;

@Getter
public class Radio {
    @Setter
    private int currentRadioStation;

    private int currentVolume;
    private int maxStation;
    private int countStation;

    public Radio() {
        this.maxStation = 9;
    }

    public Radio(int countStation) {
        if (countStation < 1) {
            countStation = 10;
        }
        this.countStation = countStation;
        this.maxStation = countStation - 1;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < 0) {
            return;
        }
        if (currentRadioStation > maxStation) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
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