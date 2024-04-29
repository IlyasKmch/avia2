public class BonusMilesService {

    public int calculate(int price) {
        int rubelsForMile = 20;
        int miles;
        miles = price / rubelsForMile;
        return miles;


    }
}
