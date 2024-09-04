# MULTIPLE CHOICE
1. (c) Character 
2. (b) toUpperCase
3. (a) String
4. (a) String
5. (a) String
6. (c) concat
7. (b) valueOf
8. ~~(?)~~ 
 . (a) 16 
9. (d) length 
10. (b) setCharAt 
11. (a) deleteCharAt 
12. (c) delimiter 
13. (d) split 
14. ~~(?)~~ 
  . (a) MIN_VALUE and MAX_VALUE 
15. (F) 
16. (T) 
17. (F) 
18. (T) 
19. (T) 
20. (F) 
21. ~~(F)~~ 
  . (T) 
22. ~~(T)~~ 
  . (F) 
23. (F)

# FIND THE ERROR
1. `valueOf` is a static method
2. you have to use `new StringBuilder("Joe Schmoe")`
3. 1 changes the second character
4. tokens should be String[]

# ALGORITHM WORKBENCH
1.
`if (Character.toLowerCase(choice) == 'y')`

2. ```
int counter = 0;
for (int i = 0; i < str.length(); i++) {
	if (str.charAt(i) == ' ')
		counter++;
}
```

3. ```
int counter = 0;
for (int i = 0; i < str.length(); i++) {
	if (Character.isDigit(str.charAt(i)))
		counter++;
}
```

4. ```
public boolean isWebsite(String s) {
	return s.endsWith(".com");
}
```