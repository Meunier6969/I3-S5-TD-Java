# MULTIPLE CHOICE
1. (a) class
2. (b) blueprint
3. (d) instance of a class
4. (b) instance
5. (b) new
6. (a) accessor
7. (d) mutator
8. (b) stale
9. (b) constructor
10. (a) shadows
11. (c) default constructor
12. (c) their parameter lists
13. (a) matching
14. (d) both (b) and (c)
15. (T)
16. (T)
17. (F)
18. (F)
19. (?)

# FIND THE ERROR
1. missing type of parameters value2 and value3

2. need parenthesis : new Rectangle()

3. the constructor doen't have a return type

4. the two constructors are conflicting

5. two methods with the same name and parameters

# ALGORITHM WORKBENCH
1. a. ```
public Book(String t, String a, String p, int cs) {
	this.title = t;
	this.author = a;
	this.publisher = p;
	this.copiesSold = cs;
}
```

   b. ```
public String getTitle() { return this.title; }
public String getAuthor() { return this.author; }
public String getPublisher() { return this.publisher; }
public int getCopiesSold() { return this.copiesSold; }

public void setTitle(String t) { this.title = t; }
public void setAuthor(String a) { this.author = a; }
public void setPublisher(String p) { this.publisher = p; }
public void setCopiesSold(int cs) { this.copiesSold = cs; }
```

   c.
_________________________________  
|		    Book				|
|-------------------------------|
|-title: String					|
|-author: String				|
|-publisher: String				|
|-CopiesSold: int				|
|-------------------------------|
|+getTitle(): String			|
|+getAuthor(): String			|
|+getPublisher(): String		|
|+getCopiesSold(): int			|
|+setTitle(t: String): void		|
|+setAuthor(a: String): void	|
|+setPublisher(p: String): void	|
|+setCopiesSold(cs: int): void	|
|_______________________________|

2. a. ```
public Square() {
	this.sideLength = 0.0;
}
```

   b. ```
public Square(double sl) {
	this.sideLength = sl;
}
```