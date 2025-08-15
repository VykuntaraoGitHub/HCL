package com.accenture.shipping_address.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddressDTO {
	
	private String village;
	private String district;
	private String state;
	private Long pinCode;

}
