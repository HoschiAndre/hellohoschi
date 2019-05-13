package de.hoschiland.hellohoschi.util;

import de.hoschiland.hellohoschi.de.hoschiland.hellohoschi.util.Hoschi;
import de.hoschiland.hellohoschi.de.hoschiland.hellohoschi.util.HoschiStore;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestHoschiStore {


    @Test
    void addHoschi() {

        // Arrange
        Hoschi hoschiTest = new Hoschi();

        hoschiTest.setFirstName("Test");
        hoschiTest.setLastName("Hoschi");
        hoschiTest.setNickName("HoschiTest");
        hoschiTest.setMagicNo(24);
        hoschiTest.setFancyNo(444);

        // Act
        HoschiStore.getInstance().addHoschi(hoschiTest);

        // Assert
        Assertions.assertEquals(hoschiTest, HoschiStore.getInstance().getHoschi(hoschiTest.getNickName()));
    }


}
