package org.homeTask;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class removeATest {
@Test
   public void test1remove(){
    removeA r1=new removeA();
    String actual=r1.remove("ABCD");
    assertEquals("BCD",actual);
}
@Test
   public void test2remove(){
    removeA r1=new removeA();
    String actual=r1.remove("AACD");
    assertEquals("CD",actual);
}
@Test
   public void test3remove(){
    removeA r1=new removeA();
    String actual=r1.remove("BACD");
    assertEquals("BCD",actual);
}
@Test
    public void test4remove(){
    removeA r1=new removeA();
    String actual=r1.remove("BBAA");
    assertEquals("BBAA",actual);
}
@Test
   public void test5remove(){
    removeA r1=new removeA();
    String actual=r1.remove("AABAA");
    assertEquals("BAA",actual);
}
@Test
   public void test6remove(){
    removeA r1=new removeA();
    String actual=r1.remove("AA");
    assertEquals("",actual);
}
@Test
 public void test7remove(){
    removeA r1=new removeA();
    String actual=r1.remove("AB");
    assertEquals("B",actual);
}
@Test
 public void test8remove(){
    removeA r1=new removeA();
    String actual=r1.remove("CA");
    assertEquals("C",actual);
}
@Test
   public void test9remove(){
    removeA r1=new removeA();
    String actual=r1.remove("VG");
    assertEquals("VG",actual);
}
}
