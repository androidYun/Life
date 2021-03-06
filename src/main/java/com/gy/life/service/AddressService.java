package com.gy.life.service;

import com.gy.life.model.Address;

import java.util.List;

public interface AddressService {

    int insertAddress(Address address);

    List<Address> selectAllList(int userId);

    int deleteAddress(int addressId);

    int updateAllNotDefault();

    Address selectByAddressId(int addressId);

    Address selectDefaultAddress(int userId);

    int updateAddress(Address address);

    int updateDefaultAddress(int addressId, int userId);
}
