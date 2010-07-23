package com.gfs.hudson.tools

import org.apache.http.client._
import org.apache.http.impl.client._
import org.apache.http.client.methods._

object HttpController {
  val URL_CONFIG_SUFFIX = "/job/XXXYYYZZZ/config.xml";
  def getConfig(hudsonURL : String, projectName: String) : String = {
       val client = new DefaultHttpClient()
       val url = hudsonURL + URL_CONFIG_SUFFIX.replace("XXXYYYZZZ", projectName)
       println("Url to lookup " + url)
       var httpGet = new HttpGet(url)

       var handler = new BasicResponseHandler()
       var responseBody = client.execute(httpGet, handler)
       client.getConnectionManager().shutdown()
       return responseBody;
  }

  def copyJob(hudsonURL: String) : String = {
       "not ready" 
  }
}
