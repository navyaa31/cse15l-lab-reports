# Lab 3 Report
## Part 1

For this part of the lab, I am analyzing the ```append``` method of the ```LinkedList``` implementation.

**Failure Inducing Input:**
```
@Test
  public void testAppend() {
    LinkedList emptyList = new LinkedList();
    for(int i = 10; i >= 0; i--) {
      emptyList.append(i);
      }
      assertEquals(0, emptyList.last());
      assertEquals(emptyList.length(), 11);
  }
```


**Input that does not Induce Failure:**
```
@Test
  public void testAppend() {
    LinkedList emptyList = new LinkedList();
    emptyList.append(1);
    assertEquals(1, emptyList.last());
    assertEquals(emptyList.length(), 1);
  }
```

**Symptom:**\
Failure Inducing Input:
![lab3part1_1](lab3part1_1.png)

Input that does not Induce Failure:
![lab3part1_2](lab3part1_2.png)

**Bug:**\
Code Before Fix:
```
public void append(int value) {
        if(this.root == null) {
            this.root = new Node(value, null);
            return;
        }
        // If it's just one element, add if after that one
        Node n = this.root;
        if(n.next == null) {
            n.next = new Node(value, null);
            return;
        }
        // Otherwise, loop until the end and add at the end with a null
        while(n.next != null) {
            n = n.next;
            n.next = new Node(value, null);
        }
    }
```

Code After Fix:
```
public void append(int value) {
        if(this.root == null) {
            this.root = new Node(value, null);
            return;
        }
        // If it's just one element, add if after that one
        Node n = this.root;
        if(n.next == null) {
            n.next = new Node(value, null);
            return;
        }
        // Otherwise, loop until the end and add at the end with a null
        while(n.next != null) {
            n = n.next;
        }
        n.next = new Node(value, null);
    }
```

**Explanation:**
The original code was creating a new ```Node``` with the inputted value every time it moved up a ```Node```, but a new ```Node``` should only be added once at the end. Since it was added every time, you could never get to the last ```Node```. To fix the bug, the second line in the while loop should be moved outside the while loop.

## Part 2
For this part I am exploring the ```grep``` command.

**grep -o**\
Example 1:
```
navyaa@Navyaas-Computer docsearch % grep -o 'Management' technical/government/About_LSC/Comments_on_semiannual.txt
```
```
Management
Management
Management
Management
Management
Management
Management
Management
```
Example 2:
```
navyaa@Navyaas-Computer docsearch % grep -o 'Management Report' technical/government/About_LSC/Comments_on_semiannual.txt
```
```
Management Report
Management Report
```
ChatGPT Citation:
I inputted "what is an interesting command line option for command grep" and the output was "An interesting command line option for the grep command is -o, which stands for "only-matching". When you use grep -o, it prints only the matching parts of the lines instead of the whole line. This can be particularly useful when you're searching for patterns within large blocks of text and only want to extract specific parts that match your criteria."

Explanation: 
```-o``` prints every time it sees the specified text pattern within a text file. This command option can be useful for identifying how many times a pattern is present or to see if its present at all in a text file.

**grep -B**\
Example 1:
```
navyaa@Navyaas-Computer docsearch % grep -B 12 'Conclusion' technical/biomed/1468-6708-3-1.txt
```
```
results from many studies. However, health measures
          designed specifically to measure those conditions might
          be more sensitive to change in weight than EVGFP. If YHL
          were based on such measures, the superiority of YHL to
          YOL would likely be even greater than that shown here.
          These more sensitive measures might also have detected
          differences between the overweight and normal weight
          persons, but we think this is unlikely given the absence
          of any differences in EVGFP.
        
      
      
        Conclusion
```
Example 2:
```
navyaa@Navyaas-Computer docsearch % grep -B 6 'Profile' technical/government/Media/Assuring_Underprivileged.txt
```
```
Assuring Underprivileged a Voice
Jurist Credits Parents for Strong Sense of Social
Responsibility
By Tina Spee

Wednesday, October 2, 2002
Profile:
```
ChatGPT Citation:
I inputted "what is an interesting command line option for command grep" and the output was "Another interesting command line option for grep is -B, which stands for "before context". When you use grep -B, it prints a specified number of lines before each match in addition to the matching line itself. This can be useful for providing context around the matching lines. For example, if you have a log file and you want to see the lines leading up to each occurrence of a certain error message, you can use grep -B to display the relevant context along with the error message."

Explanation: 
```-B``` followed by an integer and string prints the line with the string and the specified number of lines before it. This can be useful to find the context in which a certain text is present, or find the lead in of a part of the text or the last part of a subsection of the text.

