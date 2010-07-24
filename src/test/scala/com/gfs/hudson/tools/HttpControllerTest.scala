package com.gfs.hudson.tools

import org.junit._
import Assert._

import org.apache.http.client._
import org.apache.http.impl.client._
import org.apache.http.client.methods._

@Test
class HttpControllerTest {
    var url = ""
    var existingProject = ""
    @Before
    def setup() = {
        url = "http://build.gfs.com:11418"
        existingProject = "workflowManager"
    }

    @Test
    def testGetConfig() = {
        val configXml = HttpController.getConfig(url,existingProject)
        println(configXml)
    }

    @Test
    def testCopyJob() = {
        HttpController.copyJob(url,existingProject, "AAA" + existingProject)
    }
}


