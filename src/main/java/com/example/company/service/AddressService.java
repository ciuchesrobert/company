package com.example.company.service;

import com.example.company.model.Address;

import java.util.List;
import java.util.Optional;

public interface AddressService {

    List<Address> getAllAddresses();
    void saveAddress(Address address);
    Optional<Address> getAddressById(long id);
    void deleteAddressById(long id);
}
