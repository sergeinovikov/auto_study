package main.lesson6.task4;

import java.util.Random;

public class IdentityDocument {
    private IdentityDocumentType documentType;
    private String seriesAndNumber;

    public IdentityDocumentType getDocumentType() {
        return documentType;
    }

    public void setDocumentType(IdentityDocumentType documentType) {
        this.documentType = documentType;
    }

    public String getSeriesAndNumber() {
        return seriesAndNumber;
    }

    public void setSeriesAndNumber(String seriesAndNumber) {
        this.seriesAndNumber = seriesAndNumber;
    }

    public IdentityDocument random(){
        int randomDocumentIndex = new Random().nextInt(IdentityDocumentType.values().length);
        IdentityDocumentType randomDocumentType = IdentityDocumentType.values()[randomDocumentIndex];
        String randomSeriesAndNumber = IdGenerator.generator(randomDocumentType);
        setDocumentType(randomDocumentType);
        setSeriesAndNumber(randomSeriesAndNumber);
        return this;
    }
}
