class Associate {
    private int associateId;
    private String associateName;
    private String workStatus;

    public int getAssociateId() {
        return associateId;
    }

    public void setAssociateId(int associateId) {
        this.associateId = associateId;
    }

    public String getAssociateName() {
        return associateName;
    }

    public void setAssociateName(String associateName) {
        this.associateName = associateName;
    }

    public String getWorkStatus() {
        return workStatus;
    }

    public void setWorkStatus(String workStatus) {
        this.workStatus = workStatus;
    }

    public void trackAssociateStatus(int days) {
        if (days <= 20) {
            setWorkStatus("Core skills");
        } else if (days <= 40) {
            setWorkStatus("Advanced modules");
        } else if (days <= 60) {
            setWorkStatus("Project phase");
        } else {
            setWorkStatus("Project phase");
        }
    }
}
