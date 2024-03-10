# Lab Report 5
## Student Post
I am working on making a grading script and I want to check to see if the java file in the student submission contains specific methofd headers. However, I want to generalize the check to work for any variable argument names. How do I got about this?
Here is my file structure:

Here is my grading script and the command line where I ran the script and got the following errors. I used the sample inputs from the week 6 lab.
## TA Response
Interesting problem! One way to go about this issue is to use RegEx, which I suggest to research. In order to use RegEx with grep, you will have to use the -E option. Then, you will have to use the backslash character before each special character, such as the parentheses in this case, in the string you are searching for. Lastly, instead of using a set variable name, try researching how to represent the variable names with RegEx. Let us know if you have any more questions!.

## Student Fix
I changed my grading script to use the -E option with the grep command. Here is my changed code, I only had to change the two lines that checked for the two method headers. The terminal shows that I ran the script with the same input and got a passing result this time.

## My Reflection
Something cool I learned was RegEx. I was struggling with the same issue that I discussed in this report. I asked a TA about this issue and they introduced me to RegEx. It looks like a really useful tool, and I look forward to using it in the future. I like how RegEx can cover so many different cases with simple expressions. It looks like there is a lot to learn with RegEx and I look forward to doing so!
