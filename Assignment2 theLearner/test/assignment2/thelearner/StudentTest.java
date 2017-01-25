/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2.thelearner;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author c0687421
 */
public class StudentTest {

    public StudentTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getName method, of class Student.
     */
    @Test
    public void testGetName() {

        Student instance = new Student("Bob", "c12", "Male", 91.3);
        String expResult = "Bob";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of setName method, of class Student.
     */
    @Test
    public void testSetName() {
        Student instance = new Student("Bob", "c12", "Male", 91.3);
        instance.setName("Bob");
        String expResult = "Bob";
        String result = instance.getName();
        assertEquals(expResult, result);

    }

    /**
     * Test of getId method, of class Student.
     */
    @Test
    public void testGetId() {
        Student instance = new Student("Bob", "c12", "Male", 91.3);
        String expResult = "c12";
        String result = instance.getId();
        assertEquals(expResult, result);

    }

    /**
     * Test of setId method, of class Student.
     */
    @Test
    public void testSetId() {
        Student instance = new Student("Bob", "c12", "Male", 91.3);
        instance.setId("c12");
        String expResult = "c12";
        String result = instance.getId();
        assertEquals(expResult, result);

    }

    /**
     * Test of getGender method, of class Student.
     */
    @Test
    public void testGetGender() {
        Student instance = new Student("Bob", "c12", "Male", 91.3);
        String expResult = "Male";
        String result = instance.getGender();
        assertEquals(expResult, result);

    }

    /**
     * Test of setGender method, of class Student.
     */
    @Test
    public void testSetGender() {
        Student instance = new Student();
        instance.setGender("Male");
        String expResult = "Male";
        String result = instance.getGender();
        assertEquals(expResult, result);

    }

    /**
     * Test of getGrade method, of class Student.
     */
    @Test
    public void testGetGrade() {
        Student instance = new Student("Bob", "c12", "Male", 91.3);
        double expResult = 91.3;
        double result = instance.getGrade();
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of setGrade method, of class Student.
     */
    @Test
    public void testSetGrade() {
        Student instance = new Student("Bob", "c12", "Male", 91.3);
        instance.setGender("Male");
        double expResult = 91.3;
        double result = instance.getGrade();
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of hashCode method, of class Student.
     */
    @Test
    public void testEqualsWithNonStudentObject() {
        Object ob = null;
        Student instance = new Student();
        boolean expResult = false;
        boolean result = instance.equals(ob);
        assertEquals(expResult, result);

    }

    /**
     * Test of equals method, of class Student.
     */
    @Test
    public void testEqualStudentWithSameNameAndId() {
        Student stu1 = new Student("Len", "c12", "Male", 91.3);
        Student stu2 = new Student("Len", "c12", "Male", 91.3);
        boolean expResult = true;
        boolean result = stu1.equals(stu2);
        assertEquals(expResult, result);

    }

    /**
     * Test of toString method, of class Student.
     */
    @Test
    public void testEqualStudentWithSameNameAndDifferentId() {
        Student stu1 = new Student("Jim", "c12", "Male", 91.3);
        Student stu2 = new Student("Jim", "c13", "Male", 91.3);
        boolean expResult = false;
        boolean result = stu1.equals(stu2);
        assertEquals(expResult, result);
    }

    @Test
    public void testEqualStudentWithSameIDAndDifferentName() {
        Student stu1 = new Student("Len", "c12", "Male", 91.3);
        Student stu2 = new Student("Jim", "c12", "Male", 91.3);
        boolean expResult = false;
        boolean result = stu1.equals(stu2);
        assertEquals(expResult, result);
    }

    @Test
    public void testEqualStudentWithDifferentNameAndId() {
        Student stu1 = new Student("Len", "c12", "Male", 91.3);
        Student stu2 = new Student("Jim", "c13", "Male", 91.3);
        boolean expResult = false;
        boolean result = stu1.equals(stu2);
        assertEquals(expResult, result);
    }

    @Test
    public void testtoStringWithInitializedObject() {
        Student stu1 = new Student("Len", "c12", "Male", 91.3);
        //String expResult = "(\"gender\":\"Male\",\"grade\":\"91.3\",\"name\":\"Len\",\"id\":\"c12\")";
        String expResult = "{\"name\":\"Len\",\"id\":\"c12\",\"gender\":\"Male\",\"grade\":91.3}";
        String result = stu1.toString();
        assertEquals(expResult, result);
    }

    @Test
    public void testStudentDefaultConstructorObject() {
        Student stu = new Student();
        boolean result = false;
        boolean expResult = true;
        if(stu.getName()==null && stu.getId()==null && stu.getGender()==null)
        {
          result  =true;
        }
        assertEquals(expResult, result);

    }

}
