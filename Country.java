public class Country {
    private String name;
    private Integer populationCount;
    private Integer emigrantsCount;

    public Country() {
    }

    public Country(String name, Integer populationCount, Integer emigrantsCount) {
        this.name = name;
        this.populationCount = populationCount;
        this.emigrantsCount = emigrantsCount;
    }

    public Integer getTotalPopulation() { //populationCount + emigrantsCount
        return populationCount + emigrantsCount;
    }
}
