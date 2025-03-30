package no.klp.user_county_api.model;

public class CountyResponse {
    private String fylkesnummer;
    private String fylkesnavn;

    public String getFylkesnummer() {
        return fylkesnummer;
    }

    public void setFylkesnummer(String fylkesnummer) {
        this.fylkesnummer = fylkesnummer;
    }

    public String getFylkesnavn() {
        return fylkesnavn;
    }

    public void setFylkesnavn(String fylkesnavn) {
        this.fylkesnavn = fylkesnavn;
    }
}