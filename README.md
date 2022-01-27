# calculator

## Personal repository for the Endava Automation incubator homework assignments & courses.

### HOMEWORK Day 6&7:
 1. Day 6&7 homework for the calculator can be found in java -> com -> DaySixCourse -> basic/expert.
 2. See implementation of the parentheses in the expert calculator and afferent unit tests in expertEquationTests.

---

### HOMEWORK JUnit day one:
1. Tests can be divided as follows: 
   - basicAdditionTests: tests for the addition operation including asserts.
   - expertMultiplyTests: tests for the multiply operation including asserts.
   - expertPowTests: tests for the powerOf operation including asserts.
   - expertFactTests: tests for the factorial operation including asserts.
2. ```
   <goals>
    <goal>integration-test</goal>
    <goal>verify</goal>
   </goals>   
4. ```
   public static final Logger LOGGER = LogManager.getLogger(TestReporterExtension.class);
    @Override
    public void beforeTestExecution(ExtensionContext extensionContext) {
        LOGGER.info("Starting test {}/{}", extensionContext.getTestClass().get().getSimpleName(), extensionContext.getDisplayName());
    }
5. ```
   Surefire: mvn install -DskipTests
   Failsafe: mvn install -DskipITs
6. *TEST EXECUTION LISTENER AND REPLACE REST REPORTER EXTENSION*

---

### HOMEWORK JUnit Day two (asserts):
1. The original addition tests were refactored to use the AssertJ library.
