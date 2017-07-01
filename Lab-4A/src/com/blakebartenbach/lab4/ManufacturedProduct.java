/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blakebartenbach.lab4;

import java.util.Random;

/**
 *
 * @author blake
 */
public class ManufacturedProduct {


	private final int productId;
	private boolean passedInspection;


	public ManufacturedProduct(int productId) {
		this.productId = productId;
		this.passedInspection = false;
	}

	public int getProductId() {
		return this.productId;
	}

	public void inspection() {
		Random random = new Random();
		int randomNumber = random.nextInt(20);
		if (randomNumber != 0) {
			this.passedInspection = true;
		}
	}

	@Override
	public String toString() {
		return "Product ID: [" + this.productId + "]  Passed Inspection: " + this.passedInspection;
	}
}
