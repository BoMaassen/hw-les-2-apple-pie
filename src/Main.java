public class Main {
    public static void main(String[] args) {
        ApplePieRecipe recipe = new ApplePieRecipe();

        recipe.printIngredients();

        recipe.heatOven();
        recipe.makeDough();
        recipe.stirEgg();
        recipe.peelApples();
        recipe.greaseSpringform();
        recipe.coverBottom();
        recipe.addApples();
        recipe.makeTop();
        recipe.coverTop();
        recipe.bakeCake();

        recipe.printSteps();
    }
}
