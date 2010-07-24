package com.gfs.hudson.tools

import org.junit._
import Assert._

import scala.xml._

@Test
class ConfigProcessorTest {
    @Before
    def setup() = {
    }

    @Test
    def testTransformConfig() = {
      var xml = XML.load("testData/configs/warehouseService-config.xml").mkString
      println("***************SOMEXML*********************")
      println(ConfigProcessor.transformConfig(xml, "2.2.2"))
    }
} 
