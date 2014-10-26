/**
 * 
 */
package com.myprojects.interfaces;

/**
 * @author Nitesh-PC
 *
 */
public interface Greetings {

	public default void greet(String name){
		System.out.println("Hello "+name);
	}
}
