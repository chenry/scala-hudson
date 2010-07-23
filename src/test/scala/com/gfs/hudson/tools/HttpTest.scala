package com.gfs.hudson.tools

import org.junit._
import Assert._

import java.io._
import org.apache.http.entity._
import org.apache.http.client.methods._

@Test
class HttpTest {

    @Test
    def testHitHudson() = {
       var file = new File("someFile.txt")
       var entity = new FileEntity(file, "text/plain; charset=\"UTF-8\"")

       var httppost = new HttpPost("http://www.google.com")
       httppost.setEntity(entity)
    }
/*
    @Test
    def testResponseHandler() = {
       HttpClient httpClient = new DefaultHttpClient();
       HttpGet httpGet = new HttpGet("http://www.google.com"); 

    }
    */


//    @Test
//    def testKO() = assertTrue(false)

}


