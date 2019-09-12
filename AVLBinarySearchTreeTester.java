package AVLBinarySearchTree;

import static org.junit.jupiter.api.Assertions.*;   
import java.util.ArrayList;
import java.util.TreeSet;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AVLBinarySearchTreeTester
{
    private AVLBinarySearchTree<Integer> tree;
    private ArrayList<Integer> correctArrList;
    
    @BeforeEach
    void setUp() throws Exception {
        tree = new AVLBinarySearchTree<>();
        correctArrList = new ArrayList<>();
    }
    
    @Test
    void addTestSmall() {
        assertTrue(tree.add(10));
        assertTrue(tree.add(5));
        assertTrue(tree.add(2));
        assertFalse(tree.add(10));
        
        correctArrList.add(2);
        correctArrList.add(5);
        correctArrList.add(10);
        
        assertArrayEquals(tree.toArrayList().toArray(), correctArrList.toArray());
        assertEquals(tree.size(), 3);
        assertTrue(tree.isBalanced());
    }
    
    @Test 
    void addTestMedium() {
        for (int i = 0; i < 10; i++) {
            assertTrue(tree.add(i));
            correctArrList.add(i);
        }
        for (int i = 0; i < 10; i++) 
            assertFalse(tree.add(i));
        
        
        assertArrayEquals(tree.toArrayList().toArray(), correctArrList.toArray());
        assertEquals(tree.size(), 10);
        assertTrue(tree.isBalanced());
    }
    
    @Test 
    void addTestLarge() {
        for (int i = 0; i < 100; i++) {
            assertTrue(tree.add(i));
            correctArrList.add(i);
        }
        for (int i = 0; i < 100; i++) 
            assertFalse(tree.add(i));
        
        assertArrayEquals(tree.toArrayList().toArray(), correctArrList.toArray());
        assertEquals(tree.size(), 100);
        assertTrue(tree.isBalanced());
    }
    
    @Test
    void addAllTest() {
        correctArrList.add(2);
        correctArrList.add(5);
        correctArrList.add(10);
        
        assertTrue(tree.addAll(correctArrList));
        tree.clear();
        
        tree.add(2);
        assertFalse(tree.addAll(correctArrList));
    }
    
    @Test
    void containsTest() {
        for (int i = 0; i < 100; i++) {
            tree.add(i);
        }
        
        assertTrue(tree.contains(50));
        assertTrue(tree.contains(57));
        assertTrue(tree.contains(0));
        assertTrue(tree.contains(99));
        assertTrue(tree.contains(23));
        assertFalse(tree.contains(900));
        assertFalse(tree.contains(-78));
        assertFalse(tree.contains(5555));
        assertFalse(tree.contains(100));
        assertFalse(tree.contains(4542));
        assertTrue(tree.isBalanced());
    }
    
    @Test
    void containsAllTest() {
        for (int i = 0; i < 100; i++) {
            assertTrue(tree.add(i));
            correctArrList.add(i);
        }
        
        assertTrue(tree.containsAll(correctArrList));
        correctArrList.remove(99);
        assertFalse(tree.containsAll(correctArrList));
        correctArrList.add(8000);
        assertFalse(tree.containsAll(correctArrList));
    }
    
    @Test
    void removeTest() {
        for (int i = 0; i < 100; i++) {
            assertTrue(tree.add(i));
            correctArrList.add(i);
        }
        
        assertArrayEquals(tree.toArrayList().toArray(), correctArrList.toArray());
        assertEquals(tree.size(), 100);
        assertTrue(tree.isBalanced());
        
        for (int i = 0; i < 100; i++) {
            assertTrue(tree.remove(i));
        }
        
        correctArrList.clear();
        
        assertArrayEquals(tree.toArrayList().toArray(), correctArrList.toArray());
        assertEquals(tree.size(), 0);
        assertTrue(tree.isBalanced());
        assertTrue(tree.isEmpty());
    }
    
    @Test
    void minimumTest() {
        for (int i = 0; i < 100; i++) {
            assertTrue(tree.add(i));
            correctArrList.add(i);
        }
        
        assertTrue(tree.minimum() == 0);
    }
    
    @Test
    void maximumTest() {
        for (int i = 0; i < 100; i++) {
            assertTrue(tree.add(i));
            correctArrList.add(i);
        }
        
        assertTrue(tree.maximum() == 99);
    }
    
    @Test
    void isBalancedTest() {
        for (int i = 0; i < 100; i++) {
            assertTrue(tree.add(i));
            correctArrList.add(i);
        }
        
        assertTrue(tree.isBalanced());
    }
    
    @Test
    void clearTest() {
        for (int i = 0; i < 100; i++) {
            assertTrue(tree.add(i));
            correctArrList.add(i);
        }
        
        assertFalse(tree.isEmpty());      
        tree.clear();        
        assertTrue(tree.isEmpty());
    }
    
    @Test
    void isEmptyTest() {
        for (int i = 0; i < 100; i++) {
            assertTrue(tree.add(i));
            correctArrList.add(i);
        }
        
        assertFalse(tree.isEmpty());      
        tree.clear();        
        assertTrue(tree.isEmpty());
    }
    
    @Test
    void sizeTest() {
        for (int i = 0; i < 100; i++) {
            assertTrue(tree.add(i));
            correctArrList.add(i);
        }
        
        assertEquals(tree.size(), 100);
    }

}


























