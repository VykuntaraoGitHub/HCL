package com.accenture.shipping_address.service;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accenture.shipping_address.dto.AddressDTO;
import com.accenture.shipping_address.entity.AddressEntity;
import com.accenture.shipping_address.repository.AddressRepository;
@Service
public class AddressService {
	@Autowired
	AddressRepository addressRepository;
	@Autowired
	private ModelMapper modelMapper;
	public String saveAddress(AddressDTO adddto) {
		
		AddressEntity ae=modelMapper.map(adddto, AddressEntity.class);
		AddressEntity createdAddress=addressRepository.save(ae);
		return " Address saved successfully -pin:"+createdAddress.getPinCode();
		
	}
	public AddressDTO getShippingAddress(Long pinCode) {
		
		Optional<AddressEntity> createdAddress=addressRepository.findById(pinCode);
		AddressDTO addressDTO=modelMapper.map(createdAddress, AddressDTO.class);
		return addressDTO;
	}
	

}
