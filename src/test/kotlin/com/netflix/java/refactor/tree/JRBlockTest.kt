package com.netflix.java.refactor.tree

import org.junit.Test
import kotlin.test.assertEquals

abstract class JRBlockTest(parser: Parser): AstTest(parser) {
    
    @Test
    fun methodBlock() {
        val a = parse("""
            public class A {
                public void foo() {
                    System.out.println("foo");
                }
            }
        """)
        
        assertEquals(1, a.classDecls[0].methods[0].body.statements.size)
    }
}