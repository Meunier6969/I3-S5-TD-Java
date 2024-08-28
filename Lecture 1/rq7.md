# MULTIPLE CHOICE
1. (b) size declarator
2. (a) subscript
3. (b) 0
4. (d) 1 less than the number of elements
5. (c) when the program runs
6. (c) length
7. (d) iterative search
8. (a) binary search
9. (d) N/2
10. ~~(c) brackets
  . (a) braces
11. (c) add
12. (a) remove
13. (a) size
14. (F)
15. (F)
16. (T)
17. (T)
18. (?)
19. (F)
20. (T)
21. (F)
22. (T)
23. (T)

# FIND THE ERROR
1. can't have a negative value as size

2. the values have to be in braces

3. it tries to access the 11th element of a 10-sized array

4. can't use length

5. array has no method toUpperCase()

# ALGORITHM WORKBENCH
1. ```
// a
int[][] grades = new int[30][10];
// b
int total = 0
for (int i = 0; i < grades.size ; i++) {
	total = 0;
	for (int j = 0; j < grades[i].size; j++) 
		total += grades[i][j];
	System.out.printf("%d\t%d", i, total/30);
}
```