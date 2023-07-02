public class Radio {
    private int amountStation = 10;
    private int currentRadioStation = getCurrentRadioStation();
    private int currentVolume;

    public Radio(int amountStation) {
        this.amountStation = amountStation;
    }

    public Radio() {
        amountStation = getAmountStation();
    }

    public int getAmountStation() {
        return amountStation;
    }


    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation == amountStation) {
            newCurrentRadioStation = 0;
        } else if (newCurrentRadioStation == 0) {
            newCurrentRadioStation = amountStation;
        }
        currentRadioStation = newCurrentRadioStation;

    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > 100) {
            newCurrentVolume = 100;
        } else if (newCurrentVolume < 0) {
            newCurrentVolume = 0;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }

    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

    public void switchingToPreviousStation() {
        if (currentRadioStation <= amountStation) {
            currentRadioStation = currentRadioStation - 1;
        }
        if (currentRadioStation < 0) {
            currentRadioStation = amountStation - 1;
        }
    }

    public void switchingToNextStation() {
        if (currentRadioStation == amountStation - 1) {
            currentRadioStation = 0;
        } else {
            currentRadioStation = currentRadioStation + 1;
        }
    }

}

