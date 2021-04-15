package streamp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

public class Myclass {

	public static void main(String[] args) {

  List<String> stringList =new ArrayList<String>();
  stringList.add("babji is from aitam tekali");
  stringList.add("college name is aditya");
  stringList.add("training at niit");
  Stream<String> stream = stringList .stream();
  Consumer<String> consumer = (s) -> System.out.println(s);
  Function<String, Stream<String>> function = (value) -> {
	  String[] stringArray = value.split(" " ); //line no 14 is a string converted to an array of 5 strings
	  return (Stream<String>) Arrays.asList(stringArray).stream(); //that array is now again converted into a list
  };   //we are returning that list as a stream
  stream.flatMap(function).forEach(consumer);
	/*
	 * stream.flatMap ((value)->{
	 * 
	 * String[] split = value.split("");
	 * 
	 * return(stream<String>)Arrays.asList(split).stream();}).
	 * 
	 * forEach((value)-> System.out.println(value()));
	 */
  
  
  
  
  
	}
}
  
