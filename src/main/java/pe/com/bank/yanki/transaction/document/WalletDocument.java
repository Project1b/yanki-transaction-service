package pe.com.bank.yanki.transaction.document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WalletDocument {
	
	private String walletId;
	private String documentType;
	private Integer documentNumber;
	private Double balance;
	private Integer phoneNumber;
	private Long phoneImei;
	private String email;
	private String debitcardId;

}
