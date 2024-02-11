# Lab 3 Report
## Part 1

For this part of the lab, I am analyzing the ```append``` method of the ```LinkedList``` implementation.

**Failure Inducing Input:**

**Input that does not Induce Failure:**

**Symptom:**

**Bug:**
Before:

After:

**Explanation:**
The original code was creating a new node with the inputted value every time it moved up a node, but a new node should only be added once at the end. Since it was added every time, you could never get to the last node. To fix the bug, the second line in the while loop should be moved outside the while loop.
