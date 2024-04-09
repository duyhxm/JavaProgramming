package Task1;

public class Address {
    private String houseNumber;
    private String subMunicipalLevel; //ward, commune
    private String municipalLevel; //district
    private String provincialLevel; //city, province
    Address(String houseNumber, String subMunicipalLevel, String municipalLevel, String provincialLevel){
        this.houseNumber = houseNumber;
        this.subMunicipalLevel = subMunicipalLevel;
        this.municipalLevel = municipalLevel;
        this.provincialLevel = provincialLevel;
    }
    public String getHouseNumber(){
        return this.houseNumber;
    }
    public String getSubMunicipalLevel(){
        return this.subMunicipalLevel;
    }
    public String getMunicipalLevel(){
        return this.municipalLevel;
    }
    public String getProvincialLevel(){
        return this.provincialLevel;
    }
}

