package com.pluralsight;

public class Vehicle extends Asset{
    private String makeModel;
    private int year,odometer;

    public Vehicle(String description, String dateAcquired, double originalCost, String makeModel, int year, int odometer) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }
    //custom methods

    @Override
    public double getValue(){
        double depreciationRate,currentYear,age,yearsOfLoss,currentValue;
        currentYear = 2023;
        age = currentYear - year;
        currentValue = getOriginalCost();
        boolean isHondaToyota = false;
        if(this.makeModel.contains("Honda") || this.makeModel.contains("Toyota")){
            isHondaToyota = true;
        }

        for(int i = 0; i < age; i++) {

          if (age >= 0 && age <= 3) {
              depreciationRate = .03;
              yearsOfLoss = (this.originalCost * depreciationRate) * i;
              currentValue = this.originalCost - yearsOfLoss;

          } else if (age >= 4 && age <= 6) {
              depreciationRate = .06;
              yearsOfLoss = (this.originalCost * depreciationRate) * i;
              currentValue = this.originalCost - yearsOfLoss;
          } else if (age >= 7 && age <= 10) {
              depreciationRate = .08;
              yearsOfLoss = (this.originalCost * depreciationRate) * i;
              currentValue = this.originalCost - yearsOfLoss;
          } else {
              currentValue = this.originalCost - 1000.00;
          }//end inner ifs

      //end outer if

        }//end for
        if(this.odometer > 100000 && !isHondaToyota) {
            depreciationRate = .25;
            currentValue -= (this.originalCost * depreciationRate);

        }

        return currentValue;
    }
}
