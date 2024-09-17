public class ApplePieRecipe {
    Ingredient butter = new Ingredient(200d, "gram", "ongezouten roomboter");
    Ingredient whiteCasterSugar = new Ingredient(200d, "gram", "witte bastard suiker");
    Ingredient selfRaisingFlower = new Ingredient(400d, "gram", "zelfrijzend bakmeel");
    Ingredient egg = new Ingredient(1d, "stuk(s)", "ei");
    Ingredient vanillaSugar = new Ingredient(8d, "gram", "vanillesuiker");
    Ingredient salt = new Ingredient(1d, "snuf", "zout");
    Ingredient apple = new Ingredient(1.5d, "kilo", "zoutzure apples");
    Ingredient crystalSugar = new Ingredient(75d, "gram", "kristal suiker");
    Ingredient cinnamon = new Ingredient(3d, "theelepels", "kaneel");
    Ingredient breadcrumbs = new Ingredient(15d, "gram", "paneermeel");

    public void heatOven() {
        System.out.println("1. Verwarm de oven van te voren op 170 graden Celsius (boven en onderwarmte)");
    }

    public void stirEgg() {
        System.out.println("2. Klop het ei los en verdeel deze in twee delen. De ene helft is voor het deeg, het andere deel is voor het bestrijken van de appeltaart.");
    }

    public void makeDough() {
        System.out.println("3. Meng de boter, bastard suiker, zelfrijzend bakmeel, een helft van het ei, vanille suiker en een snufje zout tot een stevig deeg en verdeel deze in 3 gelijke delen.");
    }

    public void peelApples() {
        System.out.println("4. Schil nu de appels en snij deze in plakjes. Vermeng in een kopje de suiker en kaneel.");
    }

    public void greaseSpringform() {
        System.out.println("5. Vet de springvorm in en bestrooi deze met bloem");
    }

    public void coverBottom() {
        System.out.println("6. Gebruik een deel van het deeg om de bodem van de vorm te bedekken. Gebruik een deel van het deeg om de rand van de springvorm te bekleden. Strooi het paneermeel op de bodem van de beklede vorm. De paneermeel neemt het vocht van de appels op.");
    }

    public void addApples() {
        System.out.println("7. Doe de heft van de appels in de vorm en strooi hier 1/3 van het kaneel-suiker mengsel overheen. Meng de ander helft van de appels met het overgebleven kaneel-suiker mengsel en leg deze in de vorm.");
    }

    public void makeTop() {
        System.out.println("8. Rol het laatste deel van de deeg uit tot een dunne lap en snij stroken van ongeveer 1 cm breed.");
    }

    public void coverTop() {
        System.out.println("9. Leg de stroken kuislings op de appeltaart. Met wat extra deegstroken werk je de rand rondom af. Gebruik het overgebleven ei om de bovenkant van het deeg te bestrijken");
    }

    public void bakeCake() {
        System.out.println("10. Zet de taart iets onder het midden van de oven. Bak de taart in 60 minuten op 170 graden Celsius (boven en onderwarmte) gaar en goudbruin.");
    }

    public void printIngredients() {
        System.out.println("Ingredienten:");
        System.out.println(butter.amount + " " + butter.unit + " " + butter.name);
        System.out.println(whiteCasterSugar.amount + " " + whiteCasterSugar.unit + " " + whiteCasterSugar.name);
        System.out.println(selfRaisingFlower.amount + " " + selfRaisingFlower.unit + " " + selfRaisingFlower.name);
        System.out.println(egg.amount + " " + egg.unit + " " + egg.name);
        System.out.println(vanillaSugar.amount + " " + vanillaSugar.unit + " " + vanillaSugar.name);
        System.out.println(salt.amount + " " + salt.unit + " " + salt.name);
        System.out.println(apple.amount + " " + apple.unit + " " + apple.name);
        System.out.println(crystalSugar.amount + " " + crystalSugar.unit + " " + crystalSugar.name);
        System.out.println(cinnamon.amount + " " + cinnamon.unit + " " + cinnamon.name);
        System.out.println(breadcrumbs.amount + " " + breadcrumbs.unit + " " + breadcrumbs.name);
    }

    public void printSteps() {
        System.out.println("Stappen:");
        System.out.println("1. Verwarm de oven van te voren op 170 graden Celsius (boven en onderwarmte)");
        System.out.println("2. Klop het ei los en verdeel deze in twee delen. De ene helft is voor het deeg, het andere deel is voor het bestrijken van de appeltaart.");
        System.out.println("3. Meng de boter, bastard suiker, zelfrijzend bakmeel, een helft van het ei, vanille suiker en een snufje zout tot een stevig deeg en verdeel deze in 3 gelijke delen.");
        System.out.println("4. Schil nu de appels en snij deze in plakjes. Vermeng in een kopje de suiker en kaneel.");
        System.out.println("5. Vet de springvorm in en bestrooi deze met bloem");
        System.out.println("6. Gebruik een deel van het deeg om de bodem van de vorm te bedekken. Gebruik een deel van het deeg om de rand van de springvorm te bekleden. Strooi het paneermeel op de bodem van de beklede vorm. De paneermeel neemt het vocht van de appels op.");
        System.out.println("7. Doe de heft van de appels in de vorm en strooi hier 1/3 van het kaneel-suiker mengsel overheen. Meng de ander helft van de appels met het overgebleven kaneel-suiker mengsel en leg deze in de vorm.");
        System.out.println("8. Rol het laatste deel van de deeg uit tot een dunne lap en snij stroken van ongeveer 1 cm breed.");
        System.out.println("9. Leg de stroken kuislings op de appeltaart. Met wat extra deegstroken werk je de rand rondom af. Gebruik het overgebleven ei om de bovenkant van het deeg te bestrijken");
        System.out.println("10. Zet de taart iets onder het midden van de oven. Bak de taart in 60 minuten op 170 graden Celsius (boven en onderwarmte) gaar en goudbruin.");
    }
}

