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
        val url = "http://build.gfs.com:11418"
        println(HttpController.getConfig(url,"workflowManager"))
        assertTrue(true)
    }

    @Test
    def testCopyJob() = {
        val url = "http://build.gfs.com:11418"
        println(HttpController.copyJob(url,"workflowManager", "AAAworkflowManager"))
        assertTrue(true)
    }
}


