package com.gfs.hudson.tools

import org.junit._
import Assert._

@Test
class AppTest {

    @Test
    def testStringReplacement() = {
      var s = "/job/XXXYYYZZZ/config.xml"
      assertEquals("/job/peanutButter/config.xml", s.replace("XXXYYYZZZ", "peanutButter"))
    }

//    @Test
//    def testKO() = assertTrue(false)

}


