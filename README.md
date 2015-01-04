Ethereal Lib
===============

A spooky library for other Ethereal Suite tools.

At least Java 7 is required to compile Ethereal Lib.

Building
========
If on Linux, run `./gradlew`.
If on Windows, run `gradlew`.
A new jar in build/libs will be created.

Using
=====
Ethereal Lib is available in the game|miners Maven repository.  
Add `http://mvn.gameminers.com/artifactory/repo` as a repository, and add one of the following as a dependency:

Maven
-----
```
<dependency>
    <groupId>com.gameminers</groupId>
    <artifactId>ethereallib</artifactId>
    <version>1.2</version>
</dependency>
```

Gradle
------
```
compile: 'com.gameminers:ethereallib:1.2'
```
**OR**
```
compile(group: 'com.gameminers', name: 'ethereallib', version: '1.2')
```

Ivy
---
```
<dependency org="com.gameminers" name="ethereallib" rev="1.2">
    <artifact name="ethereallib" ext="jar"/>
</dependency>
```