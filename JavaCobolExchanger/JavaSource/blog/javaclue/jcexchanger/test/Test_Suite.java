/*
 * blog/javaclue/jcexchanger/test/Test_Suite.java
 * 
 * Copyright (C) 2010 JackW
 * 
 * This program is free software: you can redistribute it and/or modify it under the terms of the
 * GNU Lesser General Public License as published by the Free Software Foundation, either version 3
 * of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without
 * even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License along with this library.
 * If not, see <http://www.gnu.org/licenses/>.
 */
package blog.javaclue.jcexchanger.test;

import junit.framework.TestSuite;

public class Test_Suite extends TestSuite {
	
	public Test_Suite(String arg0) {
		super(arg0);
	}

	public static void main(String[] args) {
		junit.textui.TestRunner.run(suite());
	}
	
	static TestSuite suite() {
		Class<?>[] testClasses = { 
				ArrayElementTest.class, 
				BooleanElementTest.class,
				CobolDecimalElementTest.class,
				DateTimeElementTest.class,
				DecimalElementTest.class,
				IntegerElementTest.class,
				StringElementTest.class,
				StructElementTest.class };

		return new TestSuite(testClasses);
	}
	
}
