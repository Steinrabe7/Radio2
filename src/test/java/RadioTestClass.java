import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTestClass {
    @Test
    public void selectedStation() {
        Radio stat = new Radio();

        stat.setCurrentRadioStation(6);

        int expected = 6;
        int actual = stat.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void minRadioStation() {
        Radio stat = new Radio();

        stat.setCurrentRadioStation(10);

        int expected = 0;
        int actual = stat.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void maxRadioStation() {
        Radio stat = new Radio();

        stat.setCurrentRadioStation(-1);

        int expected = 9;
        int actual = stat.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void volumeMinimum() {
        Radio stat = new Radio();

        stat.setCurrentVolume(-1);

        int expected = 0;
        int actual = stat.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void volumeMaximum() {
        Radio stat = new Radio();

        stat.setCurrentVolume(101);

        int expected = 100;
        int actual = stat.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void previousRadioStation() {
        Radio stat = new Radio();

        stat.setCurrentRadioStation(3);
        stat.switchingToPreviousStation();

        int expected = 2;
        int actual = stat.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void nextRadioStation() {
        Radio stat = new Radio();

        stat.setCurrentRadioStation(5);
        stat.switchingToNextStation();

        int expected = 6;
        int actual = stat.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void maximumNextRadioStation() {
        Radio stat = new Radio();

        stat.setCurrentRadioStation(9);
        stat.switchingToNextStation();

        int expected = 0;
        int actual = stat.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void minimumPreviousRadioStation() {
        Radio stat = new Radio();

        stat.setCurrentRadioStation(0);
        stat.switchingToPreviousStation();

        int expected = 9;
        int actual = stat.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void increasingVolume() {
        Radio stat = new Radio();

        stat.setCurrentVolume(40);
        stat.increaseVolume();

        int expected = 41;
        int actual = stat.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void decreasingVolume() {
        Radio stat = new Radio();

        stat.setCurrentVolume(40);
        stat.decreaseVolume();

        int expected = 39;
        int actual = stat.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void increasingVolumeMaximum() {
        Radio stat = new Radio();

        stat.setCurrentVolume(100);
        stat.increaseVolume();

        int expected = 100;
        int actual = stat.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void decreasingVolumeMax() {
        Radio stat = new Radio();

        stat.setCurrentVolume(0);
        stat.decreaseVolume();

        int expected = 0;
        int actual = stat.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


}
