package nl.timhendriksen.gelreairport.core;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.Length;
import java.sql.Timestamp;

public class Vlucht {

    @JsonProperty
    private int vluchtnummer;

    @JsonProperty
    @Length(max = 1)
    private String gatecode;

    @JsonProperty
    @Length(max = 2)
    private String maatschappijcode;

    @JsonProperty
    @Length(max =3)
    private String luchthavencode;

    @JsonProperty
    @Length(max = 30)
    private String vliegtuigtype;

    @JsonProperty
    private int max_aantal_psgrs;

    @JsonProperty
    private float max_totaalgewicht;

    @JsonProperty
    private float max_ppgewicht;

    @JsonProperty
    private Timestamp vertrekTijdstip;

    @JsonProperty
    private Timestamp aankomstTijdstip;

    public Vlucht(int vluchtnummer, String gatecode, String maatschappijcode, String luchthavencode, String vliegtuigtype,
                  int max_aantal_psgrs, float max_totaalgewicht, float max_ppgewicht, Timestamp vertrekTijdstip, Timestamp aankomstTijdstip) {
        this.vluchtnummer = vluchtnummer;
        this.gatecode = gatecode;
        this.maatschappijcode = maatschappijcode;
        this.luchthavencode = luchthavencode;
        this.vliegtuigtype = vliegtuigtype;
        this.max_aantal_psgrs = max_aantal_psgrs;
        this.max_totaalgewicht = max_totaalgewicht;
        this.max_ppgewicht = max_ppgewicht;
        this.vertrekTijdstip = vertrekTijdstip;
        this.aankomstTijdstip = aankomstTijdstip;
    }

    public int getVluchtnummer() {
        return vluchtnummer;
    }

    public void setVluchtnummer(int vluchtnummer) {
        this.vluchtnummer = vluchtnummer;
    }

    public String getGatecode() {
        return gatecode;
    }

    public void setGatecode(String gatecode) {
        this.gatecode = gatecode;
    }

    public String getMaatschappijcode() {
        return maatschappijcode;
    }

    public void setMaatschappijcode(String maatschappijcode) {
        this.maatschappijcode = maatschappijcode;
    }

    public String getLuchthavencode() {
        return luchthavencode;
    }

    public void setLuchthavencode(String luchthavencode) {
        this.luchthavencode = luchthavencode;
    }

    public String getVliegtuigtype() {
        return vliegtuigtype;
    }

    public void setVliegtuigtype(String vliegtuigtype) {
        this.vliegtuigtype = vliegtuigtype;
    }

    public int getMax_aantal_psgrs() {
        return max_aantal_psgrs;
    }

    public void setMax_aantal_psgrs(int max_aantal_psgrs) {
        this.max_aantal_psgrs = max_aantal_psgrs;
    }

    public float getMax_totaalgewicht() {
        return max_totaalgewicht;
    }

    public void setMax_totaalgewicht(float max_totaalgewicht) {
        this.max_totaalgewicht = max_totaalgewicht;
    }

    public float getMax_ppgewicht() {
        return max_ppgewicht;
    }

    public void setMax_ppgewicht(float max_ppgewicht) {
        this.max_ppgewicht = max_ppgewicht;
    }

    public Timestamp getVertrekTijdstip() {
        return vertrekTijdstip;
    }

    public void setVertrekTijdstip(Timestamp vertrekTijdstip) {
        this.vertrekTijdstip = vertrekTijdstip;
    }

    public Timestamp getAankomstTijdstip() {
        return aankomstTijdstip;
    }

    public void setAankomstTijdstip(Timestamp aankomstTijdstip) {
        this.aankomstTijdstip = aankomstTijdstip;
    }
}