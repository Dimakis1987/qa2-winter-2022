import hw1.*;
import org.junit.jupiter.api.Test;

public class MyObjectPractice {
    @Test
    public void workingWithBook () {
        Book classBook = new Book();

        classBook.getPageNumber(364);
        classBook.getNameOfBook("Ballada");
        classBook.getLettersNumber(1578);
        classBook.getChapterNumber(23);
        classBook.getPublishingHouse("New Stories");
    }

    public void workingWithCalculator () {
        Calculator classCalculator = new Calculator();

        classCalculator.getButtonNumber(15);
        classCalculator.getColour("Grey");
        classCalculator.getTypeOfCalculator("Scientific");
        classCalculator.getDisplayQuantity(1);
        classCalculator.getBrandName("Citizen");
    }

    public void workingWithFlower () {
        Flower classFlower = new Flower();

        classFlower.getColour("Green");
        classFlower.getHeigthM(1.00f);
        classFlower.getNameOfFlower("Akacija");
        classFlower.getStrunkNumber(2);
        classFlower.isWaterNeeded ("True");
    }

    public void workingWithMyCar () {
        MyCar classMyCar = new MyCar();

        classMyCar.getTypeOfCar("Compact Wan");
        classMyCar.getTypeOfEnngine("Diesel");
        classMyCar.setColour("Grey");
        classMyCar.getModel("Touran");
        classMyCar.setSeatQuantity(5);
    }

    public void workingWithMyFishingRod () {
        MyFishingRod classMyFishingRod = new MyFishingRod();

        classMyFishingRod.getTypeOfRod("Spinning");
        classMyFishingRod.getSpecialFor("Predator fish");
        classMyFishingRod.getPartNumber(4);
        classMyFishingRod.getAction("Fast");
        classMyFishingRod.getMaxGrammsLoading(25);
    }

    public void workingWithMyFlat () {
        MyFlat classMyFlat = new MyFlat();

        classMyFlat.getAddress("Stirnu iela, Riga");
        classMyFlat.getRoomNumber(3);
        classMyFlat.getFloorNumber(1);
        classMyFlat.isConvenience("True");
        classMyFlat.getHouseFloor(5);
    }

    public void workingWithMyPC () {
        MyPC classMyPC = new MyPC();

        classMyPC.getModelOfPc("Asus");
        classMyPC.getColourOfPc("Black");
        classMyPC.getOperationalSystem("Windows");
        classMyPC.getRam(2.00f);
        classMyPC.getScreenResolution(513.00f);
    }

    public void workingWithMyPhone () {
        MyPhone classMyphone = new MyPhone();

        classMyphone.getModel("Samsung");
        classMyphone.getOperationalSystem("Android");
        classMyphone.getRam(512.00f);
        classMyphone.getMemoryGb(20);
        classMyphone.getScreenSize(25);
    }

}
