package com.example.rds;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AddressRepositoryTest {

    @Autowired
    AddressRepository addressRepository;

    @Test
    void saveTest() {
        Address address = Address.builder()
                .city("서울")
                .province("서초구")
                .postCode("12345")
                .build();

        addressRepository.save(address);


    }
}