/*Write a Java program that uses the Stream.of method to create a stream of strings, filters out the empty strings, and then concatenate the remaining strings into a single string..

Input:
A stream of strings ["Hello", "", "World", " ", "from", " ", "Java", "!"].

Output:
A single concatenated string:
HelloWorld from Java!

*/

package com.nit.STREAM_APIday3;

import java.util.stream.Stream;

public class EmptyString {

	public static void main(String[] args) {
	Stream.of("hellor " ," ", " world "," "," from "," "," java "," ! ").filter(s->s.length()>=0).forEach(System.out::print);

	}

}
