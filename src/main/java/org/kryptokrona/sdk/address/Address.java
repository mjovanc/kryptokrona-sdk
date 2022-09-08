package org.kryptokrona.sdk.address;

import lombok.Getter;
import lombok.Setter;
import org.kryptokrona.sdk.crypto.Cache;
import org.kryptokrona.sdk.crypto.KeyPair;

import java.util.List;

/**
 * Address.java
 *
 * @author Marcus Cvjeticanin (@mjovanc)
 */
@Getter
@Setter
public class Address {

	private String paymentId;

	private String seed;

	private List<KeyPair> keys;

	private String language;

	private long subwalletIndex;

	private AddressPrefix prefix;

	private Cache cached;

	public Address() {
		// this.keys =
		this.language = "english";
		this.subwalletIndex = 0;
		this.prefix = new AddressPrefix();
		this.cached = new Cache();
	}

	private enum Sizes {
		KEY(32),
		CHECKSUM(4);

		private int code;

		Sizes(int code) {
			this.code = code;
		}

		public int getCode() {
			return code;
		}
	}
}
