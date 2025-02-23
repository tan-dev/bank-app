package com.dummybank.bankapp.entity;

import jakarta.persistence.*;
import lombok.*;




@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "accounts")
@Entity
public class Account {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "account_holder_name")
	private String accountHolderName;
	private double balance;
	

}
