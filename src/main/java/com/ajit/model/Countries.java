package com.ajit.model;

public class Countries {

    private String countryName;


    private String localName;
    private String webCode;
    private String region;
    private City cities;
    private String continent;
    private long latitude;
    private long longitude;
    private long surfaceArea;
    private long population;

    public Countries(String countryName, String localName, String webCode, String region, City cities, String continent, long latitude, long longitude, long surfaceArea, long population) {
        this.countryName = countryName;
        this.localName = localName;
        this.webCode = webCode;
        this.region = region;
        this.cities = cities;
        this.continent = continent;
        this.latitude = latitude;
        this.longitude = longitude;
        this.surfaceArea = surfaceArea;
        this.population = population;
    }

    public City getCities() {
        return cities;
    }

    public void setCities(City cities) {
        this.cities = cities;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getLocalName() {
        return localName;
    }

    public void setLocalName(String localName) {
        this.localName = localName;
    }

    public String getWebCode() {
        return webCode;
    }

    public void setWebCode(String webCode) {
        this.webCode = webCode;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public long getLatitude() {
        return latitude;
    }

    public void setLatitude(long latitude) {
        this.latitude = latitude;
    }

    public long getLongitude() {
        return longitude;
    }

    public void setLongitude(long longitude) {
        this.longitude = longitude;
    }

    public long getSurfaceArea() {
        return surfaceArea;
    }

    public void setSurfaceArea(long surfaceArea) {
        this.surfaceArea = surfaceArea;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Countries)) return false;

        Countries countries = (Countries) o;

        if (getLatitude() != countries.getLatitude()) return false;
        if (getLongitude() != countries.getLongitude()) return false;
        if (getSurfaceArea() != countries.getSurfaceArea()) return false;
        if (getPopulation() != countries.getPopulation()) return false;
        if (getCountryName() != null ? !getCountryName().equals(countries.getCountryName()) : countries.getCountryName() != null)
            return false;
        if (getLocalName() != null ? !getLocalName().equals(countries.getLocalName()) : countries.getLocalName() != null)
            return false;
        if (getWebCode() != null ? !getWebCode().equals(countries.getWebCode()) : countries.getWebCode() != null)
            return false;
        if (getRegion() != null ? !getRegion().equals(countries.getRegion()) : countries.getRegion() != null)
            return false;
        return getContinent() != null ? getContinent().equals(countries.getContinent()) : countries.getContinent() == null;
    }

    @Override
    public int hashCode() {
        int result = getCountryName() != null ? getCountryName().hashCode() : 0;
        result = 31 * result + (getLocalName() != null ? getLocalName().hashCode() : 0);
        result = 31 * result + (getWebCode() != null ? getWebCode().hashCode() : 0);
        result = 31 * result + (getRegion() != null ? getRegion().hashCode() : 0);
        result = 31 * result + (getContinent() != null ? getContinent().hashCode() : 0);
        result = 31 * result + (int) (getLatitude() ^ (getLatitude() >>> 32));
        result = 31 * result + (int) (getLongitude() ^ (getLongitude() >>> 32));
        result = 31 * result + (int) (getSurfaceArea() ^ (getSurfaceArea() >>> 32));
        result = 31 * result + (int) (getPopulation() ^ (getPopulation() >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Countries{" +
                "countryName='" + countryName + '\'' +
                ", localName='" + localName + '\'' +
                ", webCode='" + webCode + '\'' +
                ", region='" + region + '\'' +
                ", continent='" + continent + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", surfaceArea=" + surfaceArea +
                ", population=" + population +
                '}';
    }
}
