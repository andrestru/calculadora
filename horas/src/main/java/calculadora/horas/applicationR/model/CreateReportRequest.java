package calculadora.horas.applicationR.model;

import calculadora.horas.common.operation.ApplicationRequest;

import java.util.Objects;

public class CreateReportRequest implements ApplicationRequest {

    private String identificationT;
    private String identificationS;
    private String startDate;
    private String finalDate;

    public CreateReportRequest() {
    }

    public CreateReportRequest(String identificationT, String identificationS, String startDate, String finalDate) {
        this.identificationT = identificationT;
        this.identificationS = identificationS;
        this.startDate = startDate;
        this.finalDate = finalDate;
    }

    public String getIdentificationT() {
        return identificationT;
    }

    public void setIdentificationT(String identificationT) {
        this.identificationT = identificationT;
    }

    public String getIdentificationS() {
        return identificationS;
    }

    public void setIdentificationS(String identificationS) {
        this.identificationS = identificationS;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getFinalDate() {
        return finalDate;
    }

    public void setFinalDate(String finalDate) {
        this.finalDate = finalDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreateReportRequest that = (CreateReportRequest) o;
        return Objects.equals(identificationT, that.identificationT) && Objects.equals(identificationS, that.identificationS) && Objects.equals(startDate, that.startDate) && Objects.equals(finalDate, that.finalDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identificationT, identificationS, startDate, finalDate);
    }

    @Override
    public String toString() {
        return "CreateReport{" +
                "identificationT='" + identificationT + '\'' +
                ", identificationS='" + identificationS + '\'' +
                ", startDate=" + startDate +
                ", finalDate=" + finalDate +
                '}';
    }
}
