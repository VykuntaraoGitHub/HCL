package com.accenture.shipping_address.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class AddressEntity {
	
	private String village;
	private String district;
	private String state;
	@Id
	private Long pinCode;

}
//CREATE TABLE AddressEntity( village VARCHAR2(20) , district VARCHAR2(20) NOT NULL,state VARCHAR2(20) NOT NULL, pincode NUMBER,PRIMARY KEY(pincode) );

///http://localhost:6464/shipping-address-path/shippingAddrCtrl/saveAddr
/*
 * {
  "village":"Palasa",
  "district":"Srikakulam",
  "state":"AP",
  "pinCode":"532287"
  }
 * 
 * 
 * 
 * /
 */