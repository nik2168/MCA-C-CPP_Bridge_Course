// Difference between Right shift and Unsigned right shift in Java ( >> and >>> ) Example
// There are two types of right shift operator in Java >> and >>>,  former is known as right shift and later is known as right shift with zero fill or simply unsigned right shift operator in Java.  Though both of them are known as bit shift operators and moves bits patterns towards right hand side of a bit sequence, there is a subtle difference between them. When we use right shift operator i.e. ">>" it keeps the sign bit intact i.e. if the original number is negative then it will remain negative even after right shift i.e. first or most significant bit never lost, doesn't matter how many times you shift.
// On the other hand unsigned right shift operator ">>>" doesn't preserve sign of the original number and fills the new place with zero, that's why it's known as unsigned right shift operator or simply right shift with zero fill.

// Since Java represents negative numbers as 2's complement and all of its integral data types except char are signed, it's very important to remember this subtle difference between signed and unsigned right shift operator.

// This also means that negative numbers in Java has first or most significant bit (the left most) set, i.e. 1, while for a positive number this bit is always zero. All these confusions will remain until you see an example of right shift operator and do it by yourself, so what are we waiting for, let's jump into an example.



// Right Shift Operator Example in Java -  >> vs >>>

// When we use right shift operator to shift bits, the right most bit of a signed number is lost and a new bit is added on left most position. If number is negative, then right-shift operator i.e. >> adds 1 into left most position, otherwise it adds zero, as shown in the below example :


// // Using right shift operator with negative number in Java
// int number = -2;
// System.out.println(number);
// System.out.println("Before shift : " + Integer.toBinaryString(number));
                           
// number = number >> 1; //shifting 1 right bit

// System.out.println(number);
// System.out.println("After shift : " + Integer.toBinaryString(number));


// Output:
// -2
// Before shift : 11111111111111111111111111111110
// -1
// After shift : 11111111111111111111111111111111

// If you look at carefully, here we are shifting only one bit using right shift operator (number >> 1), which means 0 at left most position from binary representation of -2 will be lost (marked with red color). Remember, int primitive is a 32 bit variable in Java and that's why we are seeing 32 bits here. From output you can see that right most zero is lost and a new bit with value 1 is added into left most position (marked with blue). Why 1? because it's a negative number and its MSB or sign bit is 1. Since >> preserves sign, it is also known as right shift with sign extension.
// Difference between signed and unsigned right shift operator in Java


// If we repeat same example but with unsigned right shift operator >>> in Java then we will see a different result, because >>> operator doesn't preserve sign and always adds zero into left most position. Here is an example of unsigned right shift operator in Java :

// /**
//  * Java Program to demonstrate difference between singed right shift ">>"
//  * and unsigned right shift operator ">>>" in Java
//  *
//  * @author Javin Paul
//  */
// public class RightShiftWithoutSignDemo{
 
//     public static void main(String args[]) {
 
//         // Using unsigned right shift with negative number in Java
//         // we can use binary literals from JDK 1.7 to assign 
//         // binary values to an integer, 0b is for binary, similar 
//         // to 0x of hexadecimal
//         int number = 0b1111_1000_1111_1010_1111_1000_1111_1010;
       
//         System.out.println("Before unsigned right shift : "
//                              + Integer.toBinaryString(number));
//         System.out.println("number in decimal format : " + number);
                               
//         number = number >>> 1; //shift 1 bit using right shift without sign

//         System.out.println("After unsigned right shift : " 
//                              + Integer.toBinaryString(number));
//         System.out.println("number in decimal format : " + number);
      
//     }
    
// }

// Output :
// Before unsigned right shift : 11111000111110101111100011111010
// number in decimal format : -117769990
// After unsigned right shift : 1111100011111010111110001111101
// number in decimal format : 2088598653

// You can see clear difference in the output of signed and unsigned right shift operator in Java. Behavior of right shift operator is predictable as divide by two but that's not true for right shift with zero fill operator i.e. >>>, because it can change a negative number into positive one.

// By the way, when you run this program in Eclipse, you may think that unsigned right shift operator ">>>" is not working properly because you will see that sign bit is still "1", well I did until I see the decimal output which denotes a positive number. Then I carefully investigated bit pattern and find out that after shifting we only have 31 bit, because Integer.toBinaryString() has not printed leading zeros. Since it took me some time to realize I have highlighted this fact by color coding bits in a group of four, you can see in output the first group has only 3 bits because leading zero is not printed.

// Now let's see how these two operator works with positive numbers in Java. As per theory, since positive number's sign bit is always zero, both of these operators should produce same result.

// /**
//  * Java Program to demonstrate difference between singed right shift ">>"
//  * and unsigned right shift operator ">>>" in Java
//  *
//  * @author Javin Paul
//  */
// public class BitShiftDemo{
 
//     public static void main(String args[]) {
 
//         // Using right shift and unsigned right-shift 
//         // with positive number in Java
//         // we can use binary literals from JDK 1.7 to assign 
//         // binary values to an integer, 0b is for binary, 
//         // similar to 0x of hexadecimal
//         int a = 0b10000;
//         int b = 0b10000;
       
//         System.out.println("Before applying unsigned right shift ('>>>')
//                                     , a : " + a);
//         System.out.println("Before applying right shift ('>>'), b : " + b);        
                               
//         a = a >> 1;  //shift 1 bit using right shift with sign extension
//         b = b >>> 1; //shift 1 bit using right shift without sign

//         System.out.println("After applying unsigned right shift ('>>>'),
//                                       a : "  + a);
//         System.out.println("After applying right shift ('>>'), b : " + b);   
      
//     }
    
// }
// Output
// Before applying unsigned right shift ('>>>'), a : 16
// Before applying right shift ('>>'), b : 16
// After applying unsigned right shift ('>>>'), a : 8
// After applying right shift ('>>'), b : 8

// You can see in the output that for positive input both ">>" and ">>>" produce same output, which is also logical because the sign bit for positive integers in Java is always zero. So right shift operator preserves the sign bit and keeps the positive number as positive.


// That's all about difference between right shift and unsigned right shift operators in Java. Right shift ">>" keeps the sign extension while shifting bit patterns, but right shift without sign doesn't keep the original sign bit intact, it fills with zero. This means after using ">>>" a negative number can turned into positive number. 
// For positive inputs, both signed and unsigned right shift will produce the same result but for negative numbers they will produce different results. Also remember, ">>" is equal to divide by 2 e.g. ">> 1" will divide number by two, ">>2" will divide number twice by two e.g. by 4. It is well known fast way to divide a number by two in Java.


// If you want to know more about magic of bitshift and bitwise operator in Java, You will find the following articles interesting too :
// How to Swap Two Number without using Temp variable? (solution)
// How to check if an Integer is power of Two in Java? (solution)
// How to count number of Set bits (1s) in Java Integer? (solution)
// What is difference between bitwise and logical operator in Java? (answer)
// How to add two numbers without using arithmetic operator? (solution)
// How to check if a number is even or odd in Java? (solution)
