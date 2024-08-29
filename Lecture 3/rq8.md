# MULTIPLE CHOICE
1. (c) static
2. (c) a reference to the object
3. (a) toString
4. (a) ~~nesting~~
 . (c) aggregation
5. (b) this
6. (c) ordinal
7. (d) Seasons.FALL 
8. ~~(a) a switch expression~~
 . (b) a case expression
9. (c) garbage collection
10. (a) finalize
11. (b) Class, Responsibilities, Collaborators
12. (F)
13. (F)
14. ~~(?)~~
  . (T) 
15. (F)

# FIND THE ERROR
1. - should be Coffee.DARK

2. - a static method is trying to access non-static variables

# ALGORITHM WORKBENCH
1. a. ```
@Override
public String toString() {
	return "Circle(radius:" + this.getRadius() + ", area:" + this.getArea() + ")";
}
```

   b. ```
@Override
public boolean equals(Object obj) {
	if (this == obj) 
		return true;
	if (obj == null || getClass() != obj.getClass())
		return false;

	Circle other = (Circle) obj;

	return this.radius == other.getRadius();
}
```

   c. ```
public boolean greaterThan(Circle other) {
	return this.getArea() > other.getArea();
}
```

2. ```
enum PetStoreItems { DOG, CAT, BIRD, HAMSTER };
```