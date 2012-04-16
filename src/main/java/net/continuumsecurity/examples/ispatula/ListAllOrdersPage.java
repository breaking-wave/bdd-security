/*******************************************************************************
 *    BDD-Security, application security testing framework
 * 
 * Copyright (C) `2012 Stephen de Vries`
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see `<http://www.gnu.org/licenses/>`.
 ******************************************************************************/
package net.continuumsecurity.examples.ispatula;

import net.continuumsecurity.web.Config;
import net.continuumsecurity.web.Page;
import net.continuumsecurity.web.UnexpectedContentException;

import org.openqa.selenium.WebDriver;

public class ListAllOrdersPage extends Page {
	public final static String url = Config.getBaseUrl()+"shop/listOrders.do";
	public final static String expectedText = "All Orders";
	
	public ListAllOrdersPage(WebDriver driver) {
		super(url,driver);
	}
	
	@Override
	public ListAllOrdersPage open() {
		return (ListAllOrdersPage)super.open();
	}

	@Override
	public void verify() {
		if (!getSource().contains((expectedText))) {
			throw new UnexpectedContentException("Did not find the expected text: "+expectedText);
		}
	}
}
