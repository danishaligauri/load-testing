/**
 * 
 */
package com.xerago.rsa;

import java.util.Arrays;
import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author danish
 * @date 2020-Jul-21 5:44:56 pm
 */
@RestController
public class LoadController {

	@GetMapping("/loadtest")
	public Long loadtest() {

		long before = System.currentTimeMillis();

		Random random = new Random();

		for (int i = 0; i < 1000; i++) {

			long[] data = new long[1000000];
			for (int l = 0; l < data.length; l++) {
				data[l] = random.nextLong();
			}
			Arrays.sort(data);

		}

		return System.currentTimeMillis() - before;
	}
}
