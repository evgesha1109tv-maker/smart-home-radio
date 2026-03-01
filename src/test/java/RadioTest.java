import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    void increaseRadioStationСurrentStation9() {
        Radio Cond = new Radio();
        Cond.setCurrentRadioStation(9);
        Cond.increaseRadioStation();
        int expected = 9;
        int actual = Cond.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void increaseRadioStationСurrentStation5() {
        Radio Cond = new Radio();
        Cond.setCurrentRadioStation(5);
        Cond.increaseRadioStation();
        int expected = 6;
        int actual = Cond.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void increaseRadioStationСurrentStation0() {
        Radio Cond = new Radio();
        Cond.setCurrentRadioStation(0);
        Cond.increaseRadioStation();
        int expected = 1;
        int actual = Cond.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void reducingRadioStationСurrentStation0() {
        Radio Cond = new Radio();
        Cond.setCurrentRadioStation(0);
        Cond.reducingRadioStation();
        int expected = 0;
        int actual = Cond.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void reducingRadioStationСurrentStation9() {
        Radio Cond = new Radio();
        Cond.setCurrentRadioStation(9);
        Cond.reducingRadioStation();
        int expected = 8;
        int actual = Cond.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void reducingRadioStationСurrentStation5() {
        Radio Cond = new Radio();
        Cond.setCurrentRadioStation(5);
        Cond.reducingRadioStation();
        int expected = 4;
        int actual = Cond.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void increaseVolumeCurrentVolume100() {
        Radio Cond = new Radio();
        Cond.setCurrentVolume(100);
        Cond.increaseVolume();
        int expected = 100;
        int actual = Cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void increaseVolumeCurrentVolume50() {
        Radio Cond = new Radio();
        Cond.setCurrentVolume(50);
        Cond.increaseVolume();
        int expected = 51;
        int actual = Cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void increaseVolumeCurrentVolume0() {
        Radio Cond = new Radio();
        Cond.setCurrentVolume(0);
        Cond.increaseVolume();
        int expected = 1;
        int actual = Cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void reducingVolumeCurrentVolume0() {
        Radio Cond = new Radio();
        Cond.setCurrentVolume(0);
        Cond.reducingVolume();
        int expected = 0;
        int actual = Cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void reducingVolumeCurrentVolume50() {
        Radio Cond = new Radio();
        Cond.setCurrentVolume(50);
        Cond.reducingVolume();
        int expected = 49;
        int actual = Cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void reducingVolumeCurrentVolume100() {
        Radio Cond = new Radio();
        Cond.setCurrentVolume(100);
        Cond.reducingVolume();
        int expected = 99;
        int actual = Cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void EnteringValuesRadioStationless0() {
        Radio Cond = new Radio();
        Cond.setCurrentRadioStation(-1);
        int expected = 0;
        int actual = Cond.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void EnteringValuesRadioStationMore100() {
        Radio Cond = new Radio();
        Cond.setCurrentRadioStation(100);
        int expected = 0;
        int actual = Cond.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void EnteringValuesVolumeless0() {
        Radio Cond = new Radio();
        Cond.setCurrentVolume(-1);
        int expected = 0;
        int actual = Cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    void EnteringValuesVolumeMore100() {
        Radio Cond = new Radio();
        Cond.setCurrentVolume(101);
        int expected = 0;
        int actual = Cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void EnteringValuesVolumeValidValues50() {
        Radio Cond = new Radio();
        Cond.setCurrentVolume(50);
        int expected = 50;
        int actual = Cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void EnteringValuesRadioStationValidValues5() {
        Radio Cond = new Radio();
        Cond.setCurrentRadioStation(5);
        int expected = 5;
        int actual = Cond.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }
}