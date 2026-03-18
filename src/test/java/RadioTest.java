import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    void setValuesRadioStationless0() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(-10);
        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setValuesRadioStationMore9() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(25);
        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setValuesRadioStationBoundaryMax() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);
        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setValuesRadioStationBoundaryMoreMax() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(10);
        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setValuesRadioStationBoundaryLessMax() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(8);
        int expected = 8;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setValuesRadioStationBoundaryMin() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setValuesRadioStationBoundaryMoreMin() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(1);
        int expected = 1;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setValuesRadioStationAverage() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(5);
        int expected = 5;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void EnteringValuesVolumeless0() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-10);
        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    void EnteringValuesVolumeMore100() {
        Radio radio = new Radio();
        radio.setCurrentVolume(150);
        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void EnteringValuesVolumeValidValues50() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);
        int expected = 50;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void EnteringValuesVolumeBoundaryMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void EnteringValuesVolumeBoundaryMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void EnteringValuesVolumeBoundaryLessMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        int expected = 99;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void EnteringValuesVolumeBoundaryMoreMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void EnteringValuesVolumeBoundaryMoreMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void EnteringValuesVolumeBoundaryLessMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    void increaseRadioStationСurrentStation9() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);
        radio.increaseRadioStation();
        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void increaseRadioStationСurrentStation8() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(8);
        radio.increaseRadioStation();
        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void increaseRadioStationСurrentStation5() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(5);
        radio.increaseRadioStation();
        int expected = 6;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void increaseRadioStationСurrentStation0() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        radio.increaseRadioStation();
        int expected = 1;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void increaseRadioStationСurrentStation1() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(1);
        radio.increaseRadioStation();
        int expected = 2;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void reducingRadioStationСurrentStation0() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        radio.reducingRadioStation();
        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void reducingRadioStationСurrentStation1() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(1);
        radio.reducingRadioStation();
        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void reducingRadioStationСurrentStation9() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);
        radio.reducingRadioStation();
        int expected = 8;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void reducingRadioStationСurrentStation8() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(8);
        radio.reducingRadioStation();
        int expected = 7;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void reducingRadioStationСurrentStation5() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(5);
        radio.reducingRadioStation();
        int expected = 4;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void increaseVolumeCurrentVolume100() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void increaseVolumeCurrentVolume99() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void increaseVolumeCurrentVolume50() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);
        radio.increaseVolume();
        int expected = 51;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void increaseVolumeCurrentVolume0() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.increaseVolume();
        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void increaseVolumeCurrentVolume1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.increaseVolume();
        int expected = 2;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void reducingVolumeCurrentVolume0() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.reducingVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void reducingVolumeCurrentVolume1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.reducingVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void reducingVolumeCurrentVolume50() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);
        radio.reducingVolume();
        int expected = 49;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void reducingVolumeCurrentVolume100() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.reducingVolume();
        int expected = 99;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void reducingVolumeCurrentVolume99() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        radio.reducingVolume();
        int expected = 98;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    //Тесты к flexible
    @Test
    void reducingStationСurrentStationMaxStationCountStationless0() {
        Radio radio = new Radio(-50);
        radio.setCurrentRadioStation(radio.getMaxStation());
        radio.reducingRadioStation();
        int expected = 8;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void reducingStationСurrentStationMaxStationCountStation1() {
        Radio radio = new Radio(1);
        radio.setCurrentRadioStation(radio.getMaxStation());
        radio.reducingRadioStation();
        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void increaseStationСurrentStation1MaxStation49() {
        Radio radio = new Radio(50);
        radio.setCurrentRadioStation(1);
        radio.increaseRadioStation();
        int expected = 2;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void increaseStationСurrentStation49MaxStation49() {
        Radio radio = new Radio(50);
        radio.setCurrentRadioStation(49);
        radio.increaseRadioStation();
        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void increaseStationСurrentStation0MaxStation49() {
        Radio radio = new Radio(50);
        radio.setCurrentRadioStation(0);
        radio.increaseRadioStation();
        int expected = 1;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void reducingStationСurrentStation0MaxStation49() {
        Radio radio = new Radio(50);
        radio.setCurrentRadioStation(0);
        radio.reducingRadioStation();
        int expected = 49;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void reducingStationСurrentStation49MaxStation49() {
        Radio radio = new Radio(50);
        radio.setCurrentRadioStation(49);
        radio.reducingRadioStation();
        int expected = 48;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void reducingStationСurrentStation5MaxStation49() {
        Radio radio = new Radio(50);
        radio.setCurrentRadioStation(5);
        radio.reducingRadioStation();
        int expected = 4;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

}
