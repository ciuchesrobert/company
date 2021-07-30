package com.example.company.service;

import com.example.company.model.Address;
import com.example.company.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    private AddressRepository addressRepository;

    @Override
    public List<Address> getAllAddresses() {
        return addressRepository.findAll();
    }

    @Override
    public void saveAddress(Address address) {
        this.addressRepository.save(address);

    }

    @Override
    public Optional<Address> getAddressById(long id) {
        return addressRepository.findById(id);
    }

    @Override
    public void deleteAddressById(long id) {

    }
}
