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
```
[user@sahara ~/lecture1]$ cd Hello.java
```

This results in the following output:

```
bash: cd: Hello.java: Not a directory
[user@sahara ~/lecture1]$ 
```
The working directory when the command was run was /home/lecture1. Having the file as the argument does not make sense because the working directory cannot be the path to a file, it can only be the path to a directory. This is why the output is an error, because a file should not be passed in as an argument for cd, so the output tells us that if an argument is passed in, it should be a directory (not a file).

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
```
[user@sahara ~]$ ls lecture1
```

This results in the following output:

```
Hello.class  Hello.java  messages  README
[user@sahara ~]$ 
```
The working directory when the command was run was /home. Having a path to a directory as an argument means that all the files and folders in the given path are printed. The four items that are printed in the terminal are the four files/folders that are in the lecture1 folder which is why they are printed. The output is not an error.

## ls with a path to a file as an argument.
```
[user@sahara ~/lecture1]$ ls Hello.class
```

This results in the following output:

```
Hello.class
[user@sahara ~/lecture1]$
```
The working directory when the command was run was /home/lecture1. Having a file as an argument means that file that is the argument will be listed. This is because the path is an absolute path because there is only a single file within the filesystem /home/lecture1/Hello.class. This output is not an error.

## cat with no arguments
```
[user@sahara ~/lecture1]$ cat
```

This results in no output. The cursor just returns to the next line.

The working directory when the command was run was /home/lecture1. Having no argument with the cat command does not make sense because the cat command is supposed to print the contents of one or more files that are passed in as arguments. If no arguments are passed in, there contents from no files to print. The output is an error because after cat is entered with no arguments, following things that are entered will be printed because the cat command is still running.

## cat with a path to a directory as an argument
```
[user@sahara ~]$ cat /home/lecture1
```

This results in the following output:

```
cat: /home/lecture1: Is a directory
[user@sahara ~]$ 
```
The working directory when the command was run was /home. The cat command is supposed to print the content in the argument which is why it points out that the path is a directory. The output is an error. It is explaining that the argument is a directory, but it expects a file so that it can print the contents.

## cat with a path to a file as an argument.
```
[user@sahara ~]$ cat /home/lecture1/Hello.java
```

This results in the following output:

```
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class Hello {
  public static void main(String[] args) throws IOException {
    String content = Files.readString(Path.of(args[0]), StandardCharsets.UTF_8);    
    System.out.println(content);
  }
}[user@sahara ~]$
```
The working directory when the command was run was /home. The output is all of the content in the Hello.java file which is the printed lines of code. This output is not an error.
