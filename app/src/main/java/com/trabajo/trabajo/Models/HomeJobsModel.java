package com.trabajo.trabajo.Models;

public class HomeJobsModel{
//    String companyIcon;
    int companyIcon;
    String companyName;
    String jobDetails;
    public HomeJobsModel() {
    }

    public HomeJobsModel(int companyIcon, String companyName, String jobDetails) {
        this.companyIcon = companyIcon;
        this.companyName = companyName;
        this.jobDetails = jobDetails;
    }

    public int getCompanyIcon() {
        return companyIcon;
    }

    public void setCompanyIcon(int companyIcon) {
        this.companyIcon = companyIcon;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getJobDetails() {
        return jobDetails;
    }

    public void setJobDetails(String jobDetails) {
        this.jobDetails = jobDetails;
    }
}