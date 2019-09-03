package com.gy.life.service.impl;

import com.gy.life.mapper.AddressMapper;
import com.gy.life.model.Address;
import com.gy.life.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AddressServiceImpl implements AddressService {

    @Autowired
    AddressMapper addressMapper;

    @Override
    public int insertAddress(Address address) {
        return addressMapper.save(address);
    }

    @Override
    public List<Address> selectAllList(int userId) {
        return addressMapper.selectAddressList(userId);
    }

    @Override
    public int deleteAddress(int addressId) {
        return addressMapper.deleteById(addressId);
    }

    @Override
    public Address selectByAddressId(int addressId) {
        return addressMapper.getById(addressId);
    }

    @Override
    public Address selectDefaultAddress(int userId) {
        return addressMapper.selectDefaultAddress(userId);
    }

    @Override
    public int updateAddress(Address address) {
        return addressMapper.update(address);
    }
}
