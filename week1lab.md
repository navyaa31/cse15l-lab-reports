# Lab 1 Report

## cd with no arguments
```
[user@sahara ~/lecture1/messages]$ cd
```

This results in the following output:

```
[user@sahara ~]$ 
```
The working directory when the command was run was /home/lecture1/messages. Having no input means that the directory will be changed to home by default. As can be seen in the output, the working directory is changed to /home and it is no longer /home/lecture1/messages. This is not an error.



## cd with a path to a directory as an argument
```
[user@sahara ~]$ cd lecture1/messages/
```

This results in the following output:

```
[user@sahara ~/lecture1/messages]$ 
```
The working directory when the command was run was /home. Having lecture1/messages/ means that this is the directory that the current working directory is changed to. The new current working directory is /home/lecture1/messages. This is not an error because the output shows that the directory has been changed from /home to /home/lecture1/messages which is what the given input path is.


## cd with a path to a file as an argument.

## ls with no arguments
```
[user@sahara ~]$ ls
```

This results in the following output:

```
lecture1
```
The working directory when the command was run was /home. Having no arguments means that all the folders/files in the current working directory will be listed. The output is lecture1 because ls lists all folders/files in /home/ and lecture1 is the name of the folder in /home/. The output is not an error.

## ls with a path to a directory as an argument

## ls with a path to a file as an argument.

## cat with no arguments

## cat with a path to a directory as an argument

## cat with a path to a file as an argument.
