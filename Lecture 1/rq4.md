# MULTIPLE CHOICE
1. (a) 5
2. (b) 6
3. (c) postfix
4. (d) iteration
5. ~~(?)~~
 . (a)
6. (a) pretest
7. (b) posttest
8. (a) pretest
9. (c) infinite
10. (b) do-while
11. (a) initialization expression
12. (d) accumulator
13. ~~(c) signal~~
  . (a) sentinel
14. ~~(b) FileOpen~~
  . (a) PrintWriter
15. (d) File and Scanner
16. (b) close the file
17. ~~(a) File~~
  . (d) PrintWriter
18. (b) Scanner 
19. (T) 
20. (F) 
21. (F) 
22. (F) 
23. ~~(T)~~ 
  . (F) 
24. (T) 
25. (T) 
26. (F) 

# FIND THE ERROR
1. it should be ; instead of ,
   no need for count++ at the end of the loop
2. count is never incremented, the loop is infinite
3. "choice = 1" should be "choice == 1"
4. the while block should have braces
   5th line is missing a )
   again should already be initialized

# ALGORITHM WORKBENCH
1. ```
double total = 0;
for (int i = 1; i <= 30; i++) {
	total += i/(31-i)
}
```

2. ```
import java.util.Random;

public class ReviewQuestion2 {
	public static void main(String[] args) {
		Random r = new Random();
		System.out.println(r.nextInt(1, 11));
	}
}
```

3. ```
Scanner s = new Scanner(System.in);
String input;
do {
	input = s.NextLine()
} while(!(input.equals("yes") || input.equals("no")));
```

4. ```
for (int i = 7; i > 0; i--) {
	for (int j = 0; j < i; j++) {
		System.out.print("*");
	}
	System.out.println();
}
```