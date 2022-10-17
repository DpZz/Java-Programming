package com.nc.training.abstractex;

abstract class CentralOffice {
    abstract void collectDocuments();
    public void verifyDocuments() {
        System.out.println("Verifying submitted documents");
        System.out.println("Approval / Rejected");
    }
}

class MumbaiLocalOffice extends CentralOffice {

    @Override
    void collectDocuments() {
        System.out.println("Collecting Voter ID for ID proof");
    }
}

class NetcrackerOffice {

}

class BengaluruOffice extends CentralOffice {

    @Override
    void collectDocuments() {
        System.out.println("Collecting PAN card for ID proof");
    }
}


public class AbstractDemo3 {
    public static void main(String[] args) {
        MumbaiLocalOffice office = new MumbaiLocalOffice();
        office.collectDocuments();
        office.verifyDocuments();

        BengaluruOffice office1 = new BengaluruOffice();
        office1.collectDocuments();
        office.verifyDocuments();
    }

}


