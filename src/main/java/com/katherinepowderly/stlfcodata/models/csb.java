package com.katherinepowderly.stlfcodata.models;

public class csb {

    private static int nextId = 1;


    private int csbId;

    private String date;
    private String address;
    private String intersectionOne;
    private String intersectionTwo;
    private String city;
    private String state;
    private String zip;
    private String catsReported;
    private String ward;
    private String complaintantName;
    private String complaintantAddress;
    private String complaintantPhone;

    public csb(String date, String address, String intersectionOne, String intersectionTwo, String city, String state, String zip, String catsReported, String ward, String complaintantName, String complaintantAddress, String complaintantPhone) {
        this();
        this.date = date;
        this.address = address;
        this.intersectionOne = intersectionOne;
        this.intersectionTwo = intersectionTwo;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.catsReported = catsReported;
        this.ward = ward;
        this.complaintantName = complaintantName;
        this.complaintantAddress = complaintantAddress;
        this.complaintantPhone = complaintantPhone; }

    public csb() {
        csbId = nextId;
        nextId++;
    }

        public int getCsbId() {
        return csbId;
        }

        public void setCsbId(int csbId) {
            this.csbId = csbId;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getIntersectionOne() {
            return intersectionOne;
        }

        public void setIntersectionOne(String intersectionOne) {
            this.intersectionOne = intersectionOne;
        }

        public String getIntersectionTwo() {
            return intersectionTwo;
        }

        public void setIntersectionTwo(String intersectionTwo) {
            this.intersectionTwo = intersectionTwo;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }


        public String getZip() {
        return zip;
        }

        public void setZip(String zip) {
        this.zip = zip;
        }

        public String getCatsReported() {
            return catsReported;
        }

        public void setCatsReported(String catsReported) {
            this.catsReported = catsReported;
        }

        public String getWard() {
            return ward;
        }

        public void setWard(String ward) {
            this.ward = ward;
        }

        public String getComplaintantName() {
            return complaintantName;
        }

        public void setComplaintantName(String complaintantName) {
            this.complaintantName = complaintantName;
        }

        public String getComplaintantAddress() {
            return complaintantAddress;
        }

        public void setComplaintantAddress(String complaintAddress) {
            this.complaintantAddress = complaintantAddress;
        }

        public String getComplaintantPhone() {
            return complaintantPhone;
        }

        public void setComplaintantPhone(String complaintantPhone) {
            this.complaintantPhone = complaintantPhone;
        }



    }


