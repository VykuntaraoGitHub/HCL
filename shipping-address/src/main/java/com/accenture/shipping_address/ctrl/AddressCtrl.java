package com.accenture.shipping_address.ctrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.accenture.shipping_address.dto.AddressDTO;
import com.accenture.shipping_address.service.AddressService;

@RestController
@RequestMapping("/shippingAddrCtrl")
public class AddressCtrl {
	@Autowired
	AddressService addressService;
	
	//http://localhost:2525/shipping-address-path/shippingAddrCtrl/saveAddr
	@PostMapping("/saveAddr")
	public ResponseEntity<String> saveAddress(@RequestBody AddressDTO addrDto){
		String result=addressService.saveAddress(addrDto);
		return new ResponseEntity<String>(result,HttpStatusCode.valueOf(200));
	}
	//http://localhost:6464/shipping-address-path/shippingAddrCtrl/getAddress?pinCode=532264
	@GetMapping("/getAddress")
	public ResponseEntity<AddressDTO> getAddress1(@RequestParam Long pinCode){
		AddressDTO addrDto= addressService.getShippingAddress(pinCode);
		return new ResponseEntity<AddressDTO>(addrDto,HttpStatusCode.valueOf(200));
	}
	//http://localhost:6464/shipping-address-path/shippingAddrCtrl/getAddress/532264
		@GetMapping("/getAddress/{pinCode}")
		public ResponseEntity<AddressDTO> getAddress2(@PathVariable Long pinCode){
			AddressDTO addrDto= addressService.getShippingAddress(pinCode);
			return new ResponseEntity<AddressDTO>(addrDto,HttpStatusCode.valueOf(200));
		}

}
