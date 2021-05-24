package com.cts.passportService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BangalorePassportOffice implements HeadPassportOffice {
    private Document bangaloreDocument;

    @Autowired
    public BangalorePassportOffice(Document bangaloreDocument) {
        this.bangaloreDocument = bangaloreDocument;
    }

    public Document getBangaloreDocument() {
        return bangaloreDocument;
    }

    public void setBangaloreDocument(Document bangaloreDocument) {
        this.bangaloreDocument = bangaloreDocument;
    }

    @Override
    public void doPhotoVerification() {
        System.out.println(String.format("Photo verification done using %s", bangaloreDocument.getIdProof()));
    }

    @Override
    public void issuePassport() {
        System.out.println(String.format("Passport issue is in progress for %s from %s office", bangaloreDocument.getName(), bangaloreDocument.getCity()));
    }
}
