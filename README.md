# Title of your project

Short blurb of your project. This repository was created to demonstrate to students an example for organizing your repository when submitting assignments. Take the advice provided here as a guideline.

Longer descriptions of your project can be helpful to include. Writing about your project can cover the 5 w's: who, what, when, where, why and also how.

Author notes. This repository was created by Professor Katherine Chuang for use with teaching  at Brooklyn College's Department of CIS.

# Installation

When "shipping your code", you may be sending your code off to a teammate in addition to the end user. It helps to think in their shoes. What do they need to be able to compile your code? What file(s) should be compiled and how does one do that?

## Dependencies

* [Java 8](https://docs.oracle.com/javase/8/docs/api/index.html)
* Terminal for command line access. I use [iterm2 for macos](https://iterm2.com/)
* [Travis CI](https://travis-ci.com/)

While a short list of the dependencies is often sufficient, sometimes it helps to elaborate in detail the rationale behind selecting certain dependencies. Java 8 is used here because it's the department's officially supported language and version.

It also helps to describe the connections between dependencies. This repository is linked to Travis-CI by way of a `.travis.yml` file in the root of the directory.

## Setup

These are the steps to compile `Main.java` and run the program `Main`. Source code is found in the src folder. These steps are for use with command line workflow such as with a terminal.

1. Sign up for a GitHub account if you don't have one. Set up your SSH keys with github.
2. Clone this repository `git clone git@github.com:cisc3130-s20/assignment-template.git` to your machine to get a copy.
3. Move into the project's root directory with `cd assignment-template` [^1]
4. Move again into the subdirectory `src` using the command `cd src`
5. Compile the java file using the java compiler command `javac Main.java`
6. Run the compiled java program with the java command `java Main`

You should see an output similar to the following:

```sh
$ javac Main.java
$ java Main
Hello World
```

## Folder Structure

* Code is saved into the `src` folder.
* Data is saved into the `data` folder.

---

Footnotes:

[^1]: the command `cd` refers to the action of [change directory](https://en.wikipedia.org/wiki/Cd_(command)) and is an easier typed abbreviation :)
