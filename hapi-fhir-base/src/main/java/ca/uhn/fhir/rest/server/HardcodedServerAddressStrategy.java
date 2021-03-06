package ca.uhn.fhir.rest.server;

/*
 * #%L
 * HAPI FHIR - Core Library
 * %%
 * Copyright (C) 2014 - 2017 University Health Network
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

/**
 * Server address strategy which simply returns a hardcoded URL
 */
public class HardcodedServerAddressStrategy implements IServerAddressStrategy {

	private String myValue;

	public HardcodedServerAddressStrategy() {
		// nothing
	}

	public HardcodedServerAddressStrategy(String theValue) {
		myValue = theValue;
	}

	public String getValue() {
		return myValue;
	}

	public void setValue(String theValue) {
		myValue = theValue;
	}

	@Override
	public String determineServerBase(ServletContext theServletContext, HttpServletRequest theRequest) {
		return myValue;
	}

}
