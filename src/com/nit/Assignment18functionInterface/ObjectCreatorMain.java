package com.nit.Assignment18functionInterface;

import java.util.function.Consumer;

public class ObjectCreatorMain {
    public static void main(String[] args) {
        // Using a lambda expression to instantiate a CustomObject (Student) using ObjectCreator interface
        ObjectCreator objectCreator = (id, name) -> new Student(id, name);
        
        // Call create method and store the object
        Student student = (Student) objectCreator.create(1, "John Doe");

        // Use a Consumer lambda expression to update the name attribute of the created Student object
        Consumer<String> updateName = name -> student.setName(name + " Jr.");
        student.updateName(updateName);

        // Print the details of the updated Student instance to verify its attributes
        System.out.println(student);

        // Test cases
        runTestCases();
    }

    private static void runTestCases() {
        // Test Case 1: Basic Creation and Update
        testStudentUpdate(1, "John Doe", name -> "Jane Updated", "Student{id=1, name='Jane Updated'}");

        // Test Case 2: Different Name Update
        testStudentUpdate(2, "Alice", name -> "Alice Johnson", "Student{id=2, name='Alice Johnson'}");

        // Test Case 3: No Name Update
        testStudentUpdate(3, "Bob", name -> name, "Student{id=3, name='Bob'}");
    }

    private static void testStudentUpdate(int id, String initialName, java.util.function.Function<String, String>
    updateFunction, String expectedOutput) {
        ObjectCreator objectCreator = (studentId, studentName) -> new Student(studentId, studentName);
        Student student = (Student) objectCreator.create(id, initialName);

        Consumer<String> updateName = name -> student.setName(updateFunction.apply(name));
        student.updateName(updateName);

        String result = student.toString();
        assert result.equals(expectedOutput) : "Test failed! Expected: " + expectedOutput + ", but got: " + result;
        System.out.println(result);
    }
}
