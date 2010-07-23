package com.gfs.hudson.tools

import org.junit._
import Assert._

import org.apache.http.client._
import org.apache.http.impl.client._
import org.apache.http.client.methods._

@Test
class HttpTest {

    @Test
    def testGetConfig() = {
        //val url = "http://build.gfs.com:11418/job/warehouseService/config.xml"
        val url = "http://build.gfs.com:11418"
        println(HttpController.getConfig(url,"workflowManager"))
        println(HttpController.getConfig(url,"warehouseService"))
        println(HttpController.getConfig(url,"wmsBatch"))
        assertTrue(true)
    }
}


