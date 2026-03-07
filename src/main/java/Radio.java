public class Radio {
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

//    public Radio(int currentRadioStation, int currentVolume, int maxStation) {
//        this.currentRadioStation = currentRadioStation;
//        this.currentVolume = currentVolume;
//        this.maxStation = maxStation;
//    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
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

    public int getCurrentVolume() {
        return currentVolume;
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

    public int getMaxStation() {
        return maxStation;
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


//    public Radio() {
//        this.maxStation = 9;
//    }
//
//    public Radio(int countStation) {
//        if (countStation<1){
//            countStation=10;
//        }
//        this.maxStation = countStation - 1;
//    }
//
//    public int getMaxStation() {
//        return maxStation;
//    }
//
//    public void setMaxStation(int maxStation) {
//
//    }
//
//    public int getCurrentRadioStation() {
//        return currentRadioStation;
//    }
//
//    public void setCurrentRadioStation(int newCurrentRadioStation) {
//        if (newCurrentRadioStation < 0) {
//            return;
//        }
//        if (newCurrentRadioStation > maxStation) {
//            return;
//        }
//        currentRadioStation = newCurrentRadioStation;
//    }
//
//    public int getCurrentVolume() {
//        return currentVolume;
//    }
//
//    public void setCurrentVolume(int newCurrentVolume) {
//        if (newCurrentVolume < 0) {
//            return;
//        }
//        if (newCurrentVolume > 100) {
//            return;
//        }
//        currentVolume = newCurrentVolume;
//    }
//
//    public void increaseRadioStation() {
//        if (currentRadioStation != maxStation) {
//            currentRadioStation++;
//            return;
//        }
//        currentRadioStation = 0;
//    }
//
//    public void reducingRadioStation() {
//        if (currentRadioStation != 0) {
//            currentRadioStation--;
//            return;
//        }
//        currentRadioStation = maxStation;
//    }
//
//    public void increaseVolume() {
//        if (currentVolume != 100) {
//            currentVolume++;
//        }
//
//    }
//
//    public void reducingVolume() {
//        if (currentVolume != 0) {
//            currentVolume--;
//        }
//    }
//
//}
