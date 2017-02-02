<b>First Part</b></br>
Make a program with one method that will take the following parameters:
1. Name as String
2. Last Name as String
3. Your age as Int
4. Current temperature as a double

This method will in turn take all these values and return a string. It will return the following sentence. 
"Hello, my name is: [full name], I am [age] years old. It is currently [temp] degrees outside.

<b>Solution:</b></br>
1. I created a static method called thisIsMe outside of the main method. The method took 4 parameters: String firstName, String lastName, int age, and double temp.
2. In the method I added in the variables and text into a new String object.
3. I then returned that String object.

<b>Second Part</b></br>
Make a program that takes in an array of strings as a parameters. This array will return a string. 
The string you need to create is: 
"My favorite things to do are: [index0], [index1].... . There are a total of [total number of indexes] items in my list.

<b>Solution:</b></br>
1. I created a static method called faveThings outside of the main method. The method took in a String array called faves.
2. I used the .toString method in the faveThings method to store the array as a String object. I also used the replace method to remove the brackets.
3. I then added the String object, the text, and the length of the array into a new String object, and then returned that.

<b>Third Part:</b></br> 
Review the attached code and solve the marked sections

<b>Solution:</b></br>
1. For the first part, I used and in-line conditional to replace the value of the boolean original with its opposite.
2. For the second part, I used a for statement to replace each int in the array with its negative value.
3. For the third part, I used a for statement to go through each of the values in someNumbers[]. Then I used an in-line conditional to return a true or false value depending on whether the number was higher or not than the floor value.
4. For the fourth part, I used a for statement to go through each value in the array, compare it to the last value, and assign it to the variables min or max depending on whether it was higher or lower. I then returned the min/max values in the new array.
