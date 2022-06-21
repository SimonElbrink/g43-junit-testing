# Testing & Debugging

Adding Junit as a dependency inorder to access the testing Framework.
```xml
<dependency>
  <groupId>org.junit.jupiter</groupId>
  <artifactId>junit-jupiter</artifactId>
  <version>5.8.2</version>
  <scope>test</scope>
</dependency>
```

When running test methods you need to add `@Test` annotation.

ex..
```java
//imports omitted..
public class MainTest {
    @Test
    public void test_isAdult_true() {
        int age = 18;
        boolean isAdult = Main.isAdult(age);

        Assertions.assertTrue(isAdult);
    }
}
```


- Running One test
- Running Multiple tests at ones.
- TDD, "test-driven-development".
  - (Write test logic before implementing the code to make the test pass)

## Debugging

- Breakpoints
- Running program in debugging mode.
- Follow how variables updates.