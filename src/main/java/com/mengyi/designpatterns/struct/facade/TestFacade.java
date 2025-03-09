package com.mengyi.designpatterns.struct.facade;

public class TestFacade {
    public static void main(String[] args) {
        FamilyThreater familyThreater = new FamilyThreater();
        familyThreater.playMovie("Iron man");

        familyThreater.stopMovie();
    }
}
