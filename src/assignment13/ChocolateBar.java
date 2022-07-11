package assignment13;

import java.util.Arrays;

public class ChocolateBar {
    //       type: currently we have these types: Milk Hazelnut Classic, Dark Hazelnut Classic, OatMilk Classic, White Chocolate Classic, Cookie & Creme Classic
//

    private final String brand = "TechChocos";
    private String type;
    private String netWeight;
    private final String manufacturedIn = "123 Chocolate Drive, Mclean, VA, 22102";
    private final String manufacturedBy = "Techcenture Chocos Inc on a class level";
    private long barCode;
    private String bestBefore; //e.g 09-30-2022
    private String directions;
    private double unitPrice;
    private int keepCool; //integer in Fahrenheit
    private double totalFat; // %
    private double cholesterol; // %
    private double sodium; // %
    private double vitaminD; //%
    private double calcium; // %
    private double carbohydrates; // %
    private double numberOfCalories;
    private String totalSugar; // in grams
    private String protein; // in grams
    private String servingSize; // in pieces or grams
    String[] ingredients;


    /**
     * an all-args constructor
     *
     * @param type
     * @param netWeight
     * @param barCode
     * @param bestBefore
     * @param directions
     * @param unitPrice
     * @param keepCool
     * @param totalFat
     * @param cholesterol
     * @param sodium
     * @param vitaminD
     * @param calcium
     * @param carbohydrates
     * @param numberOfCalories
     * @param totalSugar
     * @param protein
     * @param servingSize
     * @param ingredients
     */
    public ChocolateBar(String type, String netWeight, long barCode, String bestBefore, String directions,
                        double unitPrice, int keepCool, double totalFat, double cholesterol, double sodium,
                        double vitaminD, double calcium, double carbohydrates, double numberOfCalories,
                        String totalSugar, String protein, String servingSize, String[] ingredients) {
        this.type = type;
        this.netWeight = netWeight;
        this.barCode = barCode;
        this.bestBefore = bestBefore;
        this.directions = directions;
        this.unitPrice = unitPrice;
        this.keepCool = keepCool;
        this.totalFat = totalFat;
        this.cholesterol = cholesterol;
        this.sodium = sodium;
        this.vitaminD = vitaminD;
        this.calcium = calcium;
        this.carbohydrates = carbohydrates;
        this.numberOfCalories = numberOfCalories;
        this.totalSugar = totalSugar;
        this.protein = protein;
        this.servingSize = servingSize;
        this.ingredients = ingredients;
    }

    /**
     * a no-args constructor
     */

    public ChocolateBar() {

    }

    public String getBrand() {
        return brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNetWeight() {
        return netWeight;
    }

    public void setNetWeight(String netWeight) {
        this.netWeight = netWeight;
    }

    public String getManufacturedIn() {
        return manufacturedIn;
    }

    public String getManufacturedBy() {
        return manufacturedBy;
    }

    public long getBarCode() {
        return barCode;
    }

    public void setBarCode(long barCode) {
        this.barCode = barCode;
    }

    public String getBestBefore() {
        return bestBefore;
    }

    public void setBestBefore(String bestBefore) {
        this.bestBefore = bestBefore;
    }

    public String getDirections() {
        return directions;
    }

    public void setDirections(String directions) {
        this.directions = directions;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getKeepCool() {
        return keepCool;
    }

    public void setKeepCool(int keepCool) {
        this.keepCool = keepCool;
    }

    public double getTotalFat() {
        return totalFat;
    }

    public void setTotalFat(double totalFat) {
        this.totalFat = totalFat;
    }

    public double getCholesterol() {
        return cholesterol;
    }

    public void setCholesterol(double cholesterol) {
        this.cholesterol = cholesterol;
    }

    public double getSodium() {
        return sodium;
    }

    public void setSodium(double sodium) {
        sodium = sodium;
    }

    public double getVitaminD() {
        return vitaminD;
    }

    public void setVitaminD(double vitaminD) {
        this.vitaminD = vitaminD;
    }

    public double getCalcium() {
        return calcium;
    }

    public void setCalcium(double calcium) {
        this.calcium = calcium;
    }

    public double getCarbohydrates() {
        return carbohydrates;
    }

    public void setCarbohydrates(double carbohydrates) {
        this.carbohydrates = carbohydrates;
    }

    public double getNumberOfCalories() {
        return numberOfCalories;
    }

    public void setNumberOfCalories(double numberOfCalories) {
        this.numberOfCalories = numberOfCalories;
    }

    public String getTotalSugar() {
        return totalSugar;
    }

    public void setTotalSugar(String totalSugar) {
        this.totalSugar = totalSugar;
    }

    public String getProtein() {
        return protein;
    }

    public void setProtein(String protein) {
        this.protein = protein;
    }

    public String getServingSize() {
        return servingSize;
    }

    public void setServingSize(String servingSize) {
        this.servingSize = servingSize;
    }

    public String[] getIngredients() {
        return ingredients;
    }

    public void setIngredients(String[] ingredients) {
        this.ingredients = ingredients;
    }

    //NUTRITION FACTS
//       SERVING SIZE        7 Pcs
//       CALORIES              160
//       TOTAL FAT             13%
//       CHOLESTEROL            2%
//       SODIUM                 1%
//       TOTAL CARBOHYDRATES    5%
//       PROTEIN                3g
//       TOTAL SUGARS          14g
//       VITAMIN D              7%
//       CALCIUM                2%
//
//       INGREDIENT: Sugar, cocoa butter, hazelnuts, milk, chocolate, skim milk, soy lecithin, barley mold powder, artificial flavor.
//
//       May contain tree nuts
//
//       Manufactured by TechChocos Inc, 123 Chocolate Drive, Mclean, VA, 22102
//
//       Best Before: 09-30-2022
//
//       Bar Code: 0 030455 3454 9
//
//       Keep cool (60-68F) and dry
//       ---------------------------------------------------------------------------------------------------------------------------


    @Override
    public String toString() {

        return "ChocolateBar Nutritional facts:\n" +
                "ServingSize:" + servingSize + "\n" +
                "TotalFat:" + totalFat + "\n" +
                "Cholesterol:" + cholesterol + "\n" +
                "Sodium:" + sodium + "\n" +
                "VitaminD:" + vitaminD + "\n" +
                "Calcium:" + calcium + "\n" +
                "Carbohydrates:" + carbohydrates + "\n" +
                "NumberOfCalories:" + numberOfCalories + "\n" +
                "TotalSugar:" + totalSugar + '\'' + "\n" +
                "Protein:" + protein + '\'' +"\n" +
                "Ingredients:" + Arrays.toString(ingredients);

    }
}


















