package com.cts.passportService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ChennaiPassportOffice implements HeadPassportOffice {
    private Document chennaiDocument;

    @Autowired
    public ChennaiPassportOffice(Document chennaiDocument) {
        this.chennaiDocument = chennaiDocument;
    }

    public Document getChennaiDocument() {
        return chennaiDocument;
    }

    public void setChennaiDocument(Document chennaiDocument) {
        this.chennaiDocument = chennaiDocument;
    }

    @Override
    public void doPhotoVerification() {
        System.out.println(String.format("Photo verification done using %s", chennaiDocument.getIdProof()));
    }

    @Override
    public void issuePassport() {
        System.out.println(String.format("Passport issue is in progress for %s from %s office", chennaiDocument.getName(), chennaiDocument.getCity()));
    }
}
